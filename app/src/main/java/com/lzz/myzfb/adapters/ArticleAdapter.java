package com.lzz.myzfb.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lzz.myzfb.R;
import com.lzz.myzfb.bean.ArticleBean;
import com.lzz.myzfb.utils.RecyclerViewCallBackInterface;
import com.lzz.myzfb.utils.Tools;

import java.util.List;

/**
 * 资讯适配器
 * Created by lzz on 2016/12/14.
 */

public class ArticleAdapter extends RecyclerView.Adapter {

    private List<ArticleBean.DataBean> mArticleDataBeanList;
    private Context mContext;
    // 声明回调函数
    private RecyclerViewCallBackInterface mRecyclerViewCallBackInterface;

    public ArticleAdapter(List<ArticleBean.DataBean> articleDataBeanList, Context context) {
        mArticleDataBeanList = articleDataBeanList;
        mContext = context;
    }

    public void setRecyclerViewCallBackInterface(RecyclerViewCallBackInterface recyclerViewCallBackInterface) {
        mRecyclerViewCallBackInterface = recyclerViewCallBackInterface;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.item_article, parent, false);
        return new ViewHolderBody(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ArticleBean.DataBean dataBean = mArticleDataBeanList.get(position);
        ((ViewHolderBody) holder).mItemArticleTitle.setText(dataBean.getTitle());
        ((ViewHolderBody) holder).mItemArticleContent.setText(dataBean.getSummary());
        ((ViewHolderBody) holder).mItemArticleComment.setText(" " + dataBean.getCommentCount());
        ((ViewHolderBody) holder).mItemArticleGood.setText(" " + dataBean.getFavoriteCount());
        ((ViewHolderBody) holder).mItemArticleTime.setText(Tools.formatDate(dataBean.getCreateTime()));
        ((ViewHolderBody) holder).mItemArticleImage.setImageResource(R.drawable.jx);
        Drawable drawable = mContext.getResources().getDrawable(R.drawable.ic_heart_red);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        ((ViewHolderBody) holder).mItemArticleGood.setCompoundDrawables(drawable, null, null, null);

    }

    @Override
    public int getItemCount() {
        return mArticleDataBeanList.size();
    }

    class ViewHolderBody extends RecyclerView.ViewHolder {
        ImageView mItemArticleImage;
        TextView mItemArticleTitle;
        TextView mItemArticleContent;
        TextView mItemArticleGood;
        TextView mItemArticleComment;
        TextView mItemArticleTime;

        ViewHolderBody(View view) {
            super(view);
            mItemArticleImage = (ImageView) view.findViewById(R.id.item_article_image);
            mItemArticleTitle = (TextView) view.findViewById(R.id.item_article_title);
            mItemArticleContent = (TextView) view.findViewById(R.id.item_article_content);
            mItemArticleGood = (TextView) view.findViewById(R.id.item_article_good);
            mItemArticleComment = (TextView) view.findViewById(R.id.item_article_comment);
            mItemArticleTime = (TextView) view.findViewById(R.id.item_article_time);
            view.setOnClickListener(view1 -> {
                //TODO 跳转资讯详情页
            });
        }
    }

}
