package com.ws.ChinaIndustryStandard;

import android.widget.Button;
import android.widget.ListView;

import com.alibaba.fastjson.JSONObject;
import com.ws.AdapterView.UpdateSQLListAdapter;
import com.ws.GreenDao.CatalogChapter;
import com.ws.GreenDao.CatalogPart;
import com.ws.GreenDao.Paragraph;
import com.ws.GreenDao.Specialities;
import com.ws.GreenDao.gen.CatalogChapterDao;
import com.ws.GreenDao.gen.CatalogPartDao;
import com.ws.GreenDao.gen.ParagraphDao;
import com.ws.GreenDao.gen.SpecialitiesDao;
import com.ws.Base.BaseActivity;
import com.ws.Base.ChinaIndustryStandardApplication;
import com.ws.net.CB;
import com.ws.net.RequestNet;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SoulShan on 2017/10/7.
 */
@EActivity(R.layout.activity_updatesql)
public class UpdateSQLActivity extends BaseActivity {

    @ViewById
    ListView lv_update_sql;
    @ViewById
    Button btn_all_update;

    @Bean
    UpdateSQLListAdapter updateSQLListAdapter;

    private List<Specialities> specialitiesList;//从数据库获取未写

    @AfterViews
    void afterView() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        specialitiesList = ChinaIndustryStandardApplication.instances.getDaoSession().getSpecialitiesDao().loadAll();
        if (!specialitiesList.isEmpty()) {
            updateSQLListAdapter.clear();
            updateSQLListAdapter.appendToList(specialitiesList);
            lv_update_sql.setAdapter(updateSQLListAdapter);
        }
    }


    @Click
    void btn_all_update() {

        RequestNet.updateParagraph(new CB() {
            @Override
            public void fail(JSONObject response) {

            }

            @Override
            public void success(JSONObject response) {
                List<Paragraph> list = new ArrayList<Paragraph>();
                // System.out.print("1231231" + response.toJSONString());
                list = JSONObject.parseArray(String.valueOf(response.getJSONArray("info")), Paragraph.class);
                // System.out.print(list.toString());
                ParagraphDao paragraphDao = ChinaIndustryStandardApplication.instances.getDaoSession().getParagraphDao();
                paragraphDao.deleteAll();
                for (int i = 0; i < list.size(); i++) {
                    paragraphDao.insert(list.get(i));
                }
            }
        });
  /*      RequestNet.updateCatalog(new CB() {
            @Override
            public void fail(JSONObject response) {

            }

            @Override
            public void success(JSONObject response) {
                List<Catalog> list = new ArrayList<Catalog>();
                // System.out.print("1231231" + response.toJSONString());
                list = JSONObject.parseArray(String.valueOf(response.getJSONArray("info")), Catalog.class);
                // System.out.print(list.toString());
                CatalogDao catalogDao = ChinaIndustryStandardApplication.instances.getDaoSession().getCatalogDao();
                catalogDao.deleteAll();
                for (int i =0 ; i <list.size(); i++) {
                    catalogDao.insert(list.get(i));
                }
            }
        });*/
        RequestNet.updateCatalog(new CB() {
            @Override
            public void fail(JSONObject response) {
                System.out.print(response.toJSONString());
            }

            @Override
            public void success(JSONObject response) {
                //System.out.print(response.toJSONString());
                List<CatalogChapter> catalogChapters = new ArrayList<CatalogChapter>();
                List<CatalogPart> catalogParts = new ArrayList<CatalogPart>();
                //System.out.print("1231231");
                catalogChapters = JSONObject.parseArray(String.valueOf(response.getJSONObject("info").getJSONArray("CatalogChapter")), CatalogChapter.class);
                catalogParts = JSONObject.parseArray(String.valueOf(response.getJSONObject("info").getJSONArray("CatalogPart")), CatalogPart.class);
                // System.out.print(list.toString());
                CatalogChapterDao catalogChapterDao = ChinaIndustryStandardApplication.instances.getDaoSession().getCatalogChapterDao();
                CatalogPartDao catalogPartDao = ChinaIndustryStandardApplication.instances.getDaoSession().getCatalogPartDao();
                catalogChapterDao.deleteAll();
                catalogPartDao.deleteAll();
                for (int i = 0; i < catalogChapters.size(); i++) {
                    catalogChapterDao.insert(catalogChapters.get(i));
                    //  System.out.print(catalogChapters.get(i).toString());
                }
                for (int i = 0; i < catalogParts.size(); i++) {
                    catalogPartDao.insert(catalogParts.get(i));
                    //  System.out.print(catalogParts.get(i).toString());
                }
            }
        });

       RequestNet.updateSpecialities(new CB() {
            @Override
            public void fail(JSONObject response) {
                System.out.print("status" + response.getString("status"));
            }

            @Override
            public void success(JSONObject response) {
                List<Specialities> list = new ArrayList<Specialities>();
                // System.out.print("1231231" + response.toJSONString());
                list = JSONObject.parseArray(String.valueOf(response.getJSONArray("info")), Specialities.class);
                // System.out.print(list.toString());
                SpecialitiesDao specialitiesDao = ChinaIndustryStandardApplication.instances.getDaoSession().getSpecialitiesDao();
                specialitiesDao.deleteAll();
                for (int i = 0; i < list.size(); i++) {
                    specialitiesDao.insert(list.get(i));
                }
            }
        });
    }

}
