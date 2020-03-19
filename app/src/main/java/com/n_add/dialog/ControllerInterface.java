package com.n_add.dialog;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint("ParcelCreator")
public interface ControllerInterface{
    /**
     *dialog xml layout
     * @return int
     */
    int getLayoutResIds();

    /**
     * view xml id
     * @return int[]
     */
    int[] getOnClickResId();
}
