package com.dao.demo_greendao.dao;

import android.content.Context;

import java.util.List;

public interface DaoUtilsManager {
    void insert(Context context,DemoBean demoBean); //插入数据

    void insertList(Context context,List<DemoBean> list);//插入集合

    List<DemoBean> query(Context context,String names);//查询数据

    Boolean delete(Context context,String  names); //删除数据
}
