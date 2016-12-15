package com.lzz.myzfb.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzz.myzfb.R;

/**
 * 话题碎片
 * Created by lzz on 16/12/14.
 */

public class TopicFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topic,container,false);
        init();
        return view;
    }

    // 初始化
    private void init(){

    }

}
