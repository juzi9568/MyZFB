package com.lzz.myzfb.bean;

import java.util.List;

/**
 * 资讯类
 * Created by lzz on 2016/12/14.
 */

public class ArticleBean {

    /**
     * code : 0
     * msg : success
     * data : [{ArticleBean},......,{ArticleBean}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {

        /**
         * id : 5
         * sort : 1
         * author : 刘畛畛
         * source : http://jmw.7808.cn/zixun/187187.html?vtype=INPUT&uid=f3ca50b01f418dd9f6d90958acbe9cd7
         * title : 女大学生用5000元摆地摊 9个月赚回10万
         * summary : 女大学生用5000元摆地摊9个月赚回10万的秘诀是什么？
         * keywords : 摆地摊
         * content : <p>南充一名女大学生边读书边摆地摊，用5000元在九个月内就赚了10万元，被同学们戏称为“校园富豪”，她就是余秋莲。</p>
         * thumb : http://ohhzfjgi3.bkt.clouddn.com/1480772155082522302
         * display : true
         * commentCount : 0
         * favoriteCount : 4
         * createTime : 1480772155000
         */

        private int id;
        private int sort;
        private String author;
        private String source;
        private String title;
        private String summary;
        private String keywords;
        private String content;
        private String thumb;
        private boolean display;
        private int commentCount;
        private int favoriteCount;
        private long createTime;
        private boolean favorite;

        public boolean isFavorite() {
            return favorite;
        }

        public void setFavorite(boolean favorite) {
            this.favorite = favorite;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public boolean isDisplay() {
            return display;
        }

        public void setDisplay(boolean display) {
            this.display = display;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public int getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }
    }
}
