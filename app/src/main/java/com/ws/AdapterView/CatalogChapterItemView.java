package com.ws.AdapterView;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.ws.GreenDao.CatalogChapter;
import com.ws.GreenDao.CommunicationCatalog;
import com.ws.GreenDao.SignalCatalog;
import com.ws.GreenDao.SupervisionStandardCatalog;
import com.ws.ChinaIndustryStandard.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by SoulShan on 2017/10/17.
 */
@EViewGroup(R.layout.item_catalog)
public class CatalogChapterItemView extends LinearLayout {

    @ViewById
    TextView tv_chapter, tv_part;
    @ViewById
    ListView lv_part;

    public CatalogChapterItemView(Context context) {
        super(context);
    }


    public void bind(SignalCatalog signalCatalog) {
        try {
            tv_chapter.setText(signalCatalog.getChapterid() + "." + signalCatalog.getChapter());
            tv_part.setText(signalCatalog.getPartid() + "." + signalCatalog.getPart());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bind(SupervisionStandardCatalog supervisionStandardCatalog) {
        try {
            tv_chapter.setText(supervisionStandardCatalog.getChapterid() + "." + supervisionStandardCatalog.getChapter());
            tv_part.setText(supervisionStandardCatalog.getPartid() + "." + supervisionStandardCatalog.getPart());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bind(CommunicationCatalog communicationCatalog) {
        try {
            tv_chapter.setText(communicationCatalog.getChapterid() + "." + communicationCatalog.getChapter());
            tv_part.setText(communicationCatalog.getPartid() + "." + communicationCatalog.getPart());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void bind(CatalogChapter catalogChapter) {
        try {
            tv_chapter.setText(catalogChapter.getChapterid() + "." + catalogChapter.getChapter());
           // tv_part.setText(catalogChapter.getPartid() + "." + catalogChapter.getPart());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
