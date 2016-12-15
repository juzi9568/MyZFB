package com.lzz.myzfb.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.lzz.myzfb.R;
import com.lzz.myzfb.adapters.ArticleAdapter;
import com.lzz.myzfb.bean.ArticleBean;
import com.lzz.myzfb.utils.RecyclerViewCallBackInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * 文章碎片
 * Created by lzz on 16/12/14.
 */

public class ArticleFragment extends BaseFragment {

    RecyclerView mRecyclerView;

    private ArticleAdapter mArticleAdapter;
    private List<ArticleBean.DataBean> mArticleDataBeanList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_article, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.article_recyclerView);
        init();
        return view;
    }

    // 初始化
    private void init() {

        // 设置RecyclerView布局
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        mArticleDataBeanList = getArticleDataBeanList();
        mArticleAdapter = new ArticleAdapter(mArticleDataBeanList, mContext);

        // 设置RecyclerView适配器
        mRecyclerView.setAdapter(mArticleAdapter);

    }

    // 模拟post获取的数据
    public List<ArticleBean.DataBean> getArticleDataBeanList() {
        List<ArticleBean.DataBean> list = new ArrayList<ArticleBean.DataBean>();

        ArticleBean.DataBean data = new ArticleBean.DataBean();
        data.setId(1);
        data.setSort(1);
        data.setAuthor("刘畛畛");
        data.setSource("http://jmw.7808.cn/zixun/187187.html?vtype=INPUT&uid=f3ca50b01f418dd9f6d90958acbe9cd7");
        data.setTitle("女大学生用5000元摆地摊 9个月赚回10万");
        data.setSummary("女大学生用5000元摆地摊9个月赚回10万的秘诀是什么？");
        data.setKeywords("摆地摊");
        data.setContent("<p>南充一名女大学生边读书边摆地摊，用5000元在九个月内就赚了10万元，被同学们戏称为“校园富豪”，她就是余秋莲。</p>");
        data.setThumb("http://ohhzfjgi3.bkt.clouddn.com/1480772155082522302");
        data.setDisplay(true);
        data.setCommentCount(213);
        data.setFavoriteCount(133);
        data.setCreateTime(1480772155000L);

        for (int i = 0; i < 10; i++) {
            list.add(data);
        }

        return list;
    }
}
