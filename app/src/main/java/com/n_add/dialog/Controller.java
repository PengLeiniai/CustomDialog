package com.n_add.dialog;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint("ParcelCreator")
public abstract class Controller implements Parcelable,ControllerInterface{
    int[] getOnClickResId(int... onClickResIds) {
        return onClickResIds == null ? new int[]{} : onClickResIds;
    }
    @Override
    public int[] getOnClickResId() {
        return new int[0];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

}
