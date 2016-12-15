package com.lzz.myzfb.activities;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 基类活动
 * Created by lzz on 16/12/14.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected final String TAG = getClass().getSimpleName();

    // 子类
    protected Context mContext;
    // 全局
    protected Context mAppContent;


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        mContext = this;
        mAppContent = getApplicationContext();
    }

}
