package com.dao.demo_greendao.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DaoUpgrade extends DaoMaster.OpenHelper {
    public DaoUpgrade(Context context, String name) {
        super(context, name);
    }
    /**
     * 为预留数据库升级做准备
     * @param context
     * @param name
     * @param factory
     */
    public DaoUpgrade(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
}
