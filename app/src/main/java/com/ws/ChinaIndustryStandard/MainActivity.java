package com.ws.ChinaIndustryStandard;

import android.os.Bundle;


import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.ws.AdapterView.SpecialitiesListAdapter;
import com.ws.GreenDao.Specialities;
import com.ws.Base.BaseActivity;
import com.ws.Base.ChinaIndustryStandardApplication;
import com.ws.config.EventBusEvent;
import com.ws.config.EventBusType;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * Created by SoulShan on 2017/10/7.
 */


@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @ViewById
    TextView tv_title_name;
    @ViewById(R.id.lv_specialities)
    ListView lv_specialities;

    @ViewById
    RadioButton rb_update;
    @ViewById
    RadioGroup rg;
    @ViewById
    ProgressBar pb_progress;

    @Bean
    SpecialitiesListAdapter specialitiesListAdapter;

    private List<Specialities> specialitiesList;//从数据库获取未写

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        EventBus.getDefault().register(this);
    }

    @AfterViews
    public void afterView() {

   /*     new Thread(new Runnable() {
            @Override
            public void run() {
                int max = 100;
                int pro = 1;
                pb_progress.setVisibility(View.VISIBLE);
                try {
                    //子线程循环间隔消息
                    while (pro <= max) {
                        pb_progress.setProgress(pro);
                        pro += 1;
                        Thread.sleep(100);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();*/


    }

    @ItemClick
    void lv_specialities(Specialities specialities) {
     //   System.out.print(specialities.toString());
        com.ws.ChinaIndustryStandard.CatalogChapterActivity_.intent(this).specialitiesid(specialities.getId()).specialities_name(specialities.getName()).start();
    }


    @Click(R.id.rb_update)
    void rg(RadioButton rb) {
        if (rb.getId() == rb_update.getId() || rb_update.isChecked()) {
            com.ws.ChinaIndustryStandard.UpdateSQLActivity_.intent(this).start();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        specialitiesList = ChinaIndustryStandardApplication.instances.getDaoSession().getSpecialitiesDao().loadAll();
        if (!specialitiesList.isEmpty()) {
            specialitiesListAdapter.clear();
            specialitiesListAdapter.appendToList(specialitiesList);
            lv_specialities.setAdapter(specialitiesListAdapter);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //      EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventBusEvent ebe) {
        int jobCount = ChinaIndustryStandardApplication.getInstance().getJobManager().count();
        switch (ebe.type) {
            case EventBusType.imageSucc: {
            }

        }
    }


}
