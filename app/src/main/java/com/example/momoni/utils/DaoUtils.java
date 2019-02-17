package com.example.momoni.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.momoni.contents.Contens;
import com.example.momoni.greendao.DaoMaster;
import com.example.momoni.greendao.DaoSession;

public class DaoUtils {
    private static DaoUtils daoUtils;



    public  static  DaoUtils getIntent(){
        if (daoUtils==null) {
            synchronized (DaoUtils.class){
                if (daoUtils==null) {

                   daoUtils= new DaoUtils();

                }

            }

        }
    return daoUtils;
    }
    /*
    * 初始化
    * */
    public void initGreendao(Context context){

        DaoMaster.DevOpenHelper devOpenHelper=new DaoMaster.DevOpenHelper(context,Contens.DB_USER);

        SQLiteDatabase db = devOpenHelper.getReadableDatabase();//创建可读数据库

        DaoMaster daoMaster = new DaoMaster(db);

        daoSession=daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    private DaoSession daoSession;



}
