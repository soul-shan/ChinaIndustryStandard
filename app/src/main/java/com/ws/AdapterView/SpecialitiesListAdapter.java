package com.ws.AdapterView;

import org.androidannotations.annotations.EBean;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ws.GreenDao.Specialities;
import com.ws.Base.BaseTemplateAdapter;


@EBean
public class SpecialitiesListAdapter extends BaseTemplateAdapter<Specialities> {

    public SpecialitiesListAdapter(Context context) {
        super(context);
    }

    @Override
    protected View getExView(int position, View convertView, ViewGroup parent) {
        SpecialitiesItemView specialitiesItemView;
        if (convertView == null) {
            specialitiesItemView = SpecialitiesItemView_.build(context);
        } else {
            specialitiesItemView = (SpecialitiesItemView) convertView;
        }
        Specialities specialities =getItem(position);
        specialitiesItemView.bind(specialities);
        return specialitiesItemView;
    }

    @Override
    protected void onReachBottom() {

    }

}
