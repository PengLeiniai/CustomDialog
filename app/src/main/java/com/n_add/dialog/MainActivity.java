package com.n_add.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final ControllerDialog dialog = ControllerDialog.getInstance(new Controller(){
                    @Override
                    public int getLayoutResIds() {
                        return R.layout.dialog;
                    }

                    @Override
                    public int[] getOnClickResId() {
                        return super.getOnClickResId(R.id.dialog_text);
                    }
                }).setInitView(new ControllerDialog.InitView() {
                    @Override
                    public void initView(ControllerDialog controllerDialog) {
                        //初始化view
                    }
                }).show(MainActivity.this);
                dialog.setClickListener(new ControllerDialog.onClickListener() {
                    @Override
                    public void onClick(View view) {
                        switch (view.getId()){
                            case R.id.dialog_text:
                               TextView textView = (TextView) dialog.findViewById(R.id.dialog_text);
                               textView.setText("我点击了弹窗dialog");
                                Toast.makeText(MainActivity.this,"我点击了弹窗dialog",Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });
            }
        });
    }
}
