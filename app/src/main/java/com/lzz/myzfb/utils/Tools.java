package com.lzz.myzfb.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.text.SimpleDateFormat;

/**
 * 工具类
 * Created by lzz on 2016/12/14.
 */

public class Tools {

    /**
     * 格式化时间
     *
     * @param date
     * @return
     */
    public static String formatDate(Long date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return dateFormat.format(date);
    }

}
