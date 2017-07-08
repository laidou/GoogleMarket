package com.google.laidoudou.utils;

import android.content.Context;

import com.google.laidoudou.base.MyApplication;

/**
 * Created by laidoudou on 2017/7/8.
 */

public class UiUtils {
    private static String packageName;

    /**
     * 得到上下文
     */
    public static Context getContext(){
        return MyApplication.getContext();
    }

    public static char[] getString(int resId) {
        return new char[0];
    }

    public static String getPackageName() {
        return packageName;
    }
    /**
     * 得到Res
     */

}
