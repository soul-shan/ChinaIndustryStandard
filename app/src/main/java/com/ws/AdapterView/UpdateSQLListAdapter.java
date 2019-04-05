package com.ws.AdapterView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ws.GreenDao.Specialities;
import com.ws.Base.BaseTemplateAdapter;

import org.androidannotations.annotations.EBean;

/**
 * Created by SoulShan on 2017/10/10.
 */
@EBean
public class UpdateSQLListAdapter extends BaseTemplateAdapter<Specialities> {

    public UpdateSQLListAdapter(Context context) {
        super(context);
    }

    @Override
    protected View getExView(int position, View convertView, ViewGroup parent) {
        UpdateSQLItemView updateSQLItemView;
        if (convertView == null) {
            updateSQLItemView = UpdateSQLItemView_.build(context);
        } else {
            updateSQLItemView = (UpdateSQLItemView) convertView;
        }
        Specialities specialities =getItem(position);
        updateSQLItemView.bind(specialities);
        return updateSQLItemView;
    }

    @Override
    protected void onReachBottom() {

    }
}
