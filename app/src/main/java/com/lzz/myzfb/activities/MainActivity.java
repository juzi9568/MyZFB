package com.lzz.myzfb.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.lzz.myzfb.R;
import com.lzz.myzfb.fragments.ArticleFragment;
import com.lzz.myzfb.fragments.TopicFragment;
import com.roughike.bottombar.BottomBar;

public class MainActivity extends BaseActivity {

    private ArticleFragment mArticleFragment = new ArticleFragment();
    private TopicFragment mTopicFragment = new TopicFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.main_bottomBar);

        bottomBar.setOnTabSelectListener(tabId -> {
            Fragment fragment = mArticleFragment;
            // 判断点击tab的ID，设置对应fragment
            if (tabId == R.id.tab_article) {
                fragment = mArticleFragment;
                getSupportActionBar().setTitle("资讯");
            } else if (tabId == R.id.tab_topic) {
                fragment = mTopicFragment;
                getSupportActionBar().setTitle("话题");
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragmentLayout, fragment).commit();
        });

        // 默认加载 ArticleFragment
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragmentLayout, mArticleFragment).commit();
        getSupportActionBar().setTitle("资讯");

    }

}
