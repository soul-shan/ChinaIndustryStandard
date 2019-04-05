
package com.ws.AdapterView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ws.GreenDao.CatalogPart;
import com.ws.Base.BaseTemplateAdapter;

import org.androidannotations.annotations.EBean;


/**
 * Created by SoulShan on 2017/10/20.
 */

@EBean
public class CatalogPartListAdapter extends BaseTemplateAdapter {

    int id =3;

    public CatalogPartListAdapter(Context context) {
        super(context);
    }

    @Override
    protected View getExView(int position, View convertView, ViewGroup parent) {
        CatalogPartItemView catalogPartItemView;
        if (convertView == null) {
            catalogPartItemView =CatalogPartItemView_.build(context);
        } else {
            catalogPartItemView = (CatalogPartItemView) convertView;
        }
        CatalogPart catalogPart = (CatalogPart) getItem(position);
        catalogPartItemView.bind(catalogPart);
        return catalogPartItemView;
    }

    @Override
    protected void onReachBottom() {

    }
    public void setId(int id) {
        this.id = id;
    }
}
