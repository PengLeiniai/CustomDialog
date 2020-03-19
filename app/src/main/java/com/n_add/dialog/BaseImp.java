package com.n_add.dialog;

/**
 * Created by apple on 18/4/16.
 */

public interface BaseImp {
    int getContentView();
    void init();
    void initView();
    void initListener() throws NoSuchFieldException;
}
