package com.dao.demo_greendao.dao;

import android.content.Context;

import com.dao.demo_greendao.application.MyApplication;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class DaoUtils implements DaoUtilsManager {


    @Override
    public void insert(Context context,DemoBean demoBean) {
        DaoSession daoSession = MyApplication.mApp.getDaoSession();
        QueryBuilder<DemoBean> builder = daoSession.getDemoBeanDao().queryBuilder();
        List<DemoBean> list = builder.where(DemoBeanDao.Properties.Name.eq(demoBean.name)).list();
        if (list == null || list.size() < 0) {
            daoSession.getDemoBeanDao().insert(demoBean);
        }
    }

    @Override
    public void insertList(Context context,List<DemoBean> list) {
        DaoSession daoSession = MyApplication.mApp.getDaoSession();
        daoSession.getDemoBeanDao().insertInTx(list);
    }

    @Override
    public List<DemoBean> query(Context context,String names) {
        DaoSession daoSession = MyApplication.mApp.getDaoSession();
        QueryBuilder<DemoBean> builder = daoSession.getDemoBeanDao().queryBuilder();
        List<DemoBean> list = builder.where(DemoBeanDao.Properties.Name.eq(names)).list();
        return list;
    }

    @Override
    public Boolean delete(Context context,String names) {
        DaoSession daoSession = MyApplication.mApp.getDaoSession();
        DemoBeanDao demoBeanDao = daoSession.getDemoBeanDao();
        QueryBuilder<DemoBean> builder = demoBeanDao.queryBuilder();
        List<DemoBean> list = builder.where(DemoBeanDao.Properties.Name.eq(names)).list();
        if (list != null && list.size() > 0) {
            return true;
        } else {

            return false;
        }
    }
}
