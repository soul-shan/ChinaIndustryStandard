package com.ws.AdapterView;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.ws.GreenDao.CommunicationCatalog;
import com.ws.GreenDao.SignalCatalog;
import com.ws.GreenDao.Specialities;
import com.ws.GreenDao.SupervisionStandardCatalog;
import com.ws.GreenDao.SupervisionstandardParagraph;
import com.ws.GreenDao.gen.CommunicationCatalogDao;
import com.ws.GreenDao.gen.SignalCatalogDao;
import com.ws.GreenDao.gen.SupervisionStandardCatalogDao;
import com.ws.GreenDao.gen.SupervisionstandardParagraphDao;
import com.ws.Base.ChinaIndustryStandardApplication;
import com.ws.ChinaIndustryStandard.R;
import com.ws.net.CB;
import com.ws.net.RequestNet;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SoulShan on 2017/10/10.
 */
@EViewGroup(R.layout.item_updatesql)
public class UpdateSQLItemView extends LinearLayout {
    @ViewById
    TextView tv_name;
    @ViewById
    Button btn_update_catalog, btn_update_paragraph;
    int id;

    public UpdateSQLItemView(Context context) {
        super(context);
    }

    public void bind(Specialities specialities) {
        id = specialities.getId();
        try {
            tv_name.setText(specialities.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Click
    void btn_update_paragraph() {
        RequestNet.updateParagraphBySpecialitiesId(new CB() {
            @Override
            public void fail(JSONObject response) {

            }

            @Override
            public void success(JSONObject response) {
                if (id == 1) {
                    List<SupervisionstandardParagraph> list = new ArrayList<SupervisionstandardParagraph>();
                    // System.out.print("1231231" + response.toJSONString());
                    list = JSONObject.parseArray(String.valueOf(response.getJSONArray("info")), SupervisionstandardParagraph.class);
                    // System.out.print(list.toString());
                    SupervisionstandardParagraphDao supervisionstandardParagraphDao = ChinaIndustryStandardApplication.instances.getDaoSession().getSupervisionstandardParagraphDao();
                    supervisionstandardParagraphDao.deleteAll();
                    for (int i = 0; i < list.size(); i++) {
                        supervisionstandardParagraphDao.insert(list.get(i));
                    }
                }
            }
        }, id);
    }

    @Click
    void btn_update_catalog() {


        // System.out.print("id===="+specialities.getId());
        // 更新数据库
        RequestNet.updateCatalogBySpecialitiesId(new CB() {
            @Override
            public void fail(JSONObject response) {

            }

            @Override
            public void success(JSONObject response) {
                if (id == 1) {
                    List<SupervisionStandardCatalog> list = new ArrayList<SupervisionStandardCatalog>();
                    // System.out.print("1231231" + response.toJSONString());
                    list = JSONObject.parseArray(String.valueOf(response.getJSONArray("info")), SupervisionStandardCatalog.class);
                    // System.out.print(list.toString());
                    SupervisionStandardCatalogDao supervisionStandardCatalogDao = ChinaIndustryStandardApplication.instances.getDaoSession().getSupervisionStandardCatalogDao();
                    supervisionStandardCatalogDao.deleteAll();
                    for (int i = 0; i < list.size(); i++) {
                        supervisionStandardCatalogDao.insert(list.get(i));
                    }
                }
                if (id == 2) {
                    List<CommunicationCatalog> list = new ArrayList<CommunicationCatalog>();
                    // System.out.print("1231231" + response.toJSONString());
                    list = JSONObject.parseArray(String.valueOf(response.getJSONArray("info")), CommunicationCatalog.class);
                    // System.out.print(list.toString());
                    CommunicationCatalogDao communicationCatalogDao = ChinaIndustryStandardApplication.instances.getDaoSession().getCommunicationCatalogDao();
                    communicationCatalogDao.deleteAll();
                    for (int i = 0; i < list.size(); i++) {
                        communicationCatalogDao.insert(list.get(i));
                    }
                }
                if (id == 3) {
                    List<SignalCatalog> list = new ArrayList<SignalCatalog>();
                    // System.out.print("1231231" + response.toJSONString());
                    list = JSONObject.parseArray(String.valueOf(response.getJSONArray("info")), SignalCatalog.class);
                    // System.out.print(list.toString());
                    SignalCatalogDao signalCatalogDao = ChinaIndustryStandardApplication.instances.getDaoSession().getSignalCatalogDao();
                    signalCatalogDao.deleteAll();
                    for (int i = 0; i < list.size(); i++) {
                        signalCatalogDao.insert(list.get(i));
                    }
                }


            }
        }, id);
    }


}
