package com.google.laidoudou.base;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by laidoudou on 2017/7/8.
 */

public class MyApplication extends AppCompatActivity {
    private static Context context;
    private static Handler mainThreadHandler;
    private static int mainThread;
    /**
     * 得到主线程的
     */
    public static Handler getMainThreadHandler() {
        return mainThreadHandler;
    }

    public static void setMainThreadHandler(Handler mainThreadHandler) {
        MyApplication.mainThreadHandler = mainThreadHandler;
    }

    public static int getMainThread() {
        return mainThread;
    }

    public static void setMainThread(int mainThread) {
        MyApplication.mainThread = mainThread;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        MyApplication.context = context;
    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {//程序入口的方法
        //上下文
        context = getApplicationContext();

        //主线程的Handler
        mainThreadHandler = new Handler();

        //主线程的线程id
        mainThread = Process.myTid();
        /**
         * myTid:Thread  线程id
         * myPid:Process 进程id
         * myUid:Users   用户id
         */
        super.onCreate(savedInstanceState);
    }
}
