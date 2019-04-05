package com.ws.ChinaIndustryStandard;

import android.widget.ListView;
import android.widget.TextView;

import com.ws.AdapterView.CatalogPartListAdapter;
import com.ws.GreenDao.CatalogPart;
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
public class CatalogPartActivity extends BaseActivity {


    @Extra
    int specialitiesid, chapterid;
    @Extra
    String chapter;
    @ViewById
    TextView tv_title_name;
    @ViewById
    ListView lv_catalog;
    @Bean
    CatalogPartListAdapter catalogPartListAdapter;

    List<CatalogPart> catalogPartList;

    @AfterViews
    public void afterView() {
        tv_title_name.setText(chapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        catalogPartList = ChinaIndustryStandardApplication.instances.getDaoSession().getCatalogPartDao().queryBuilder().where(CatalogPartDao.Properties.Specialitiesid.eq(specialitiesid), CatalogPartDao.Properties.Chapterid.eq(chapterid)).list();
        if (!catalogPartList.isEmpty()) {
            catalogPartListAdapter.clear();
            catalogPartListAdapter.appendToList(catalogPartList);
            lv_catalog.setAdapter(catalogPartListAdapter);
        }
    }

    @ItemClick
    void lv_catalog(CatalogPart catalogPart) {


        com.ws.ChinaIndustryStandard.ParagraphActivity_.intent(this).specialitiesid(specialitiesid).chapterid(chapterid).partid(catalogPart.getPartid()).part(catalogPart.getPart()).start();

    }


}
