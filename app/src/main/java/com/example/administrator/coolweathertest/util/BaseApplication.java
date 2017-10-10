package com.example.administrator.coolweathertest.util;

import android.app.Application;

import com.example.administrator.coolweathertest.db.DaoSession;

import org.greenrobot.greendao.AbstractDaoSession;

/**
 * Created by Administrator on 2017/10/11.
 */

public class BaseApplication extends Application {
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
