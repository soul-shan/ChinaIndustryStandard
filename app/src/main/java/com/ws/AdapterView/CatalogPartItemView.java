package com.ws.AdapterView;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ws.GreenDao.CatalogPart;
import com.ws.ChinaIndustryStandard.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by SoulShan on 2017/10/20.
 */
@EViewGroup(R.layout.item_paragraph)
public class CatalogPartItemView extends LinearLayout {
    @ViewById
    TextView tv_paragraph;

    public CatalogPartItemView(Context context) {
        super(context);
    }

    public void bind(CatalogPart catalogPart) {
        try {
            tv_paragraph.setText(catalogPart.getChapterid() + "." + catalogPart.getPartid() + "." + catalogPart.getPart() );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
