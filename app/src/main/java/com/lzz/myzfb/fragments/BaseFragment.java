package com.lzz.myzfb.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * 基类碎片
 * Created by lzz on 16/12/14.
 */

public abstract class BaseFragment extends Fragment {

    protected final String TAG = getClass().getSimpleName();

    protected Context mContext;
    protected Context mAppContext;
    protected Activity mActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        mAppContext = mContext.getApplicationContext();
        mActivity = getActivity();
    }

}
