package com.ws.Base;


import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.facebook.stetho.Stetho;
import com.path.android.jobqueue.JobManager;
import com.path.android.jobqueue.config.Configuration;
import com.path.android.jobqueue.log.CustomLogger;
import com.ws.GreenDao.gen.DaoMaster;
import com.ws.GreenDao.gen.DaoSession;


/**
 * Created by SoulShan on 2017/10/7.
 */
public class ChinaIndustryStandardApplication extends BaseApplication {
    private JobManager jobManager;
    public static DaoMaster.DevOpenHelper mHelper;
    public static SQLiteDatabase db;
    public static DaoMaster mDaoMaster;
    public static DaoSession mDaoSession;
    public static ChinaIndustryStandardApplication instances;



    public ChinaIndustryStandardApplication() {
        instances = this;
    }

    public static ChinaIndustryStandardApplication getInstance() {
        return instances;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(Stetho
                .newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(
                        Stetho.defaultInspectorModulesProvider(this)).build());
        setDatabase();
        configureJobManager();
    }

    /**
     * 设置JobManager
     **/
    private void configureJobManager() {
        Configuration configuration = new Configuration.Builder(this)
                .customLogger(new CustomLogger() {
                    private static final String TAG = "JOBS";

                    @Override
                    public boolean isDebugEnabled() {
                        return true;
                    }

                    @Override
                    public void d(String text, Object... args) {
                        Log.d(TAG, String.format(text, args));
                    }

                    @Override
                    public void e(Throwable t, String text, Object... args) {
                        Log.e(TAG, String.format(text, args), t);
                    }

                    @Override
                    public void e(String text, Object... args) {
                        Log.e(TAG, String.format(text, args));
                    }
                }).minConsumerCount(1)// always keep at least one consumer alive
                .maxConsumerCount(3)// up to 3 consumers at a time
                .loadFactor(3)// 3 jobs per consumer
                .consumerKeepAlive(120)// wait 2 minute
                .build();
        jobManager = new JobManager(this, configuration);
    }

    public JobManager getJobManager() {
        return jobManager;
    }

    /**
     * 设置greenDao
     */
    private void setDatabase() {
        // 通过 DaoMaster 的内部类 DevOpenHelper，你可以得到一个便利的 SQLiteOpenHelper 对象。
        // 可能你已经注意到了，你并不需要去编写「CREATE TABLE」这样的 SQL 语句，因为 greenDAO 已经帮你做了。
        // 注意：默认的 DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表，意味着这将导致数据的丢失。
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。
        mHelper = new DaoMaster.DevOpenHelper(this, "soulshan_db", null);
        db = mHelper.getWritableDatabase();
        // 注意：该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();


    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    public SQLiteDatabase getDb() {
        return db;
    }

}
