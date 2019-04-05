package com.ws.AdapterView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ws.GreenDao.CatalogChapter;
import com.ws.Base.BaseTemplateAdapter;

import org.androidannotations.annotations.EBean;

/**
 * Created by SoulShan on 2017/10/17.
 */
@EBean
public class CatalogChapterListAdapter extends BaseTemplateAdapter {

    int id =0;

    public CatalogChapterListAdapter(Context context) {
        super(context);
    }

    @Override
    protected View getExView(int position, View convertView, ViewGroup parent) {
        CatalogChapterItemView catalogChapterItemView;
        if (convertView == null) {
            catalogChapterItemView = CatalogChapterItemView_.build(context);
        } else {
            catalogChapterItemView = (CatalogChapterItemView) convertView;
        }
        CatalogChapter catalogChapter = (CatalogChapter) getItem(position);
        catalogChapterItemView.bind(catalogChapter);
        return catalogChapterItemView;
    }

    @Override
    protected void onReachBottom() {

    }

    public void setId(int id) {
        this.id = id;
    }
}
