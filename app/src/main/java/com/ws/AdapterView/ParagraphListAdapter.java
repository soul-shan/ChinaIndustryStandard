
package com.ws.AdapterView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ws.GreenDao.Paragraph;
import com.ws.Base.BaseTemplateAdapter;

import org.androidannotations.annotations.EBean;


/**
 * Created by SoulShan on 2017/10/20.
 */

@EBean
public class ParagraphListAdapter extends BaseTemplateAdapter {


    public ParagraphListAdapter(Context context) {
        super(context);
    }

    @Override
    protected View getExView(int position, View convertView, ViewGroup parent) {
        ParagraphItemView paragraphItemView;
        if (convertView == null) {
            paragraphItemView = ParagraphItemView_.build(context);
        } else {
            paragraphItemView = (ParagraphItemView) convertView;
        }

            Paragraph paragraph = (Paragraph) getItem(position);
            paragraphItemView.bind(paragraph);
    /*    CatalogPart catalogPart = (CatalogPart) getItem(position);
        paragraphItemView.bind(catalogPart);*/
        return paragraphItemView;
    }

    @Override
    protected void onReachBottom() {

    }

}
