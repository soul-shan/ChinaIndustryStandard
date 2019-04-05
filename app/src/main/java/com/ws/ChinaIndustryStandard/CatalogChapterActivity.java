package com.ws.ChinaIndustryStandard;

import android.widget.ListView;
import android.widget.TextView;

import com.ws.AdapterView.CatalogChapterListAdapter;
import com.ws.GreenDao.CatalogChapter;
import com.ws.GreenDao.CatalogPart;
import com.ws.GreenDao.gen.CatalogChapterDao;
import com.ws.GreenDao.gen.CatalogPartDao;
import com.ws.Base.BaseActivity;
import com.ws.Base.ChinaIndustryStandardApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * Created by SoulShan on 2017/10/17.
 */
@EActivity(R.layout.activity_catalog)
public class CatalogChapterActivity extends BaseActivity {
    @Extra
    int specialitiesid;
    @Extra
    String specialities_name;
    @ViewById
    TextView tv_title_name;
    @ViewById
    ListView lv_catalog;
    @Bean
    CatalogChapterListAdapter catalogChapterListAdapter;
    List<CatalogChapter> catalogChapterList;

    @AfterViews
    public void afterView() {
        tv_title_name.setText(specialities_name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        catalogChapterList = ChinaIndustryStandardApplication.instances.getDaoSession().getCatalogChapterDao().queryBuilder().where(CatalogChapterDao.Properties.Specialitiesid.eq(specialitiesid)).list();
        if (!catalogChapterList.isEmpty()) {
            catalogChapterListAdapter.clear();
            catalogChapterListAdapter.appendToList(catalogChapterList);
            lv_catalog.setAdapter(catalogChapterListAdapter);
        }
    }

    @ItemClick
    void lv_catalog(CatalogChapter catalogChapter) {
        List<CatalogPart> catalogPartList = ChinaIndustryStandardApplication.instances.getDaoSession().getCatalogPartDao().queryBuilder().where(CatalogPartDao.Properties.Specialitiesid.eq(specialitiesid), CatalogPartDao.Properties.Chapterid.eq(catalogChapter.getChapterid())).list();

        if (catalogPartList.isEmpty()) {
            com.ws.ChinaIndustryStandard.ParagraphActivity_.intent(this).specialitiesid(specialitiesid).chapterid(catalogChapter.getChapterid()).start();
        } else {
            com.ws.ChinaIndustryStandard.CatalogPartActivity_.intent(this).specialitiesid(specialitiesid).chapterid(catalogChapter.getChapterid()).chapter(catalogChapter.getChapter()).start();
        }
    }


}
