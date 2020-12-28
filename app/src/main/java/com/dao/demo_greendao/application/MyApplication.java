package com.dao.demo_greendao.application;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.dao.demo_greendao.dao.DaoMaster;
import com.dao.demo_greendao.dao.DaoSession;
import com.dao.demo_greendao.dao.DaoUpgrade;
import com.dao.demo_greendao.dao.DaoUtils;
import com.dao.demo_greendao.dao.DaoUtilsManager;

public class MyApplication extends Application {
    public static MyApplication mApp;
    private static String daoname = "xiaohui";
    public static DaoUtils daoUtils;//操作数据库 增、删、改、插
    public static DaoUtilsManager daoUtilsManager;
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        initdao();
    }

    private void initdao() {
        DaoUpgrade daoUpgrade = new DaoUpgrade(mApp, daoname);
        SQLiteDatabase writableDatabase = daoUpgrade.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(writableDatabase);
        daoSession = daoMaster.newSession();

    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
    public static DaoUtilsManager getDaoUtilsManager(){
        if (daoUtils==null){

                if (daoUtils==null){
                    daoUtils=new DaoUtils();
                }

        }
        return daoUtils;
    }
}
