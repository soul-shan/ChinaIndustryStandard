package com.ws.ChinaIndustryStandard;

import android.widget.ListView;
import android.widget.TextView;

import com.ws.AdapterView.ParagraphListAdapter;
import com.ws.GreenDao.Paragraph;
import com.ws.GreenDao.gen.ParagraphDao;
import com.ws.Base.BaseActivity;
import com.ws.Base.ChinaIndustryStandardApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * Created by SoulShan on 2017/10/19.
 */
@EActivity(R.layout.activity_paragraph)
public class ParagraphActivity extends BaseActivity {
    @Extra
    int specialitiesid, chapterid, partid;
    @Extra
    String part;
    @ViewById
    ListView lv_paragraph;
    @ViewById
    TextView tv_title_name;
    @Bean
    ParagraphListAdapter paragraphListAdapter;

    List<Paragraph> paragraphList;

    @AfterViews
    public void afterView() {
        // tv_title_name.setText(part);
    }

    @Override
    protected void onResume() {
        super.onResume();

        paragraphList = ChinaIndustryStandardApplication.instances.getDaoSession().getParagraphDao().queryBuilder().where(ParagraphDao.Properties.Specialitiesid.eq(specialitiesid), ParagraphDao.Properties.Chapterid.eq(chapterid), ParagraphDao.Properties.Partid.eq(partid)).list();
        if (!paragraphList.isEmpty()) {
            paragraphListAdapter.clear();
            paragraphListAdapter.appendToList(paragraphList);
            lv_paragraph.setAdapter(paragraphListAdapter);
        }

    }
}
