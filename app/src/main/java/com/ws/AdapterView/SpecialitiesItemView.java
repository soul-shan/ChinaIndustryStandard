package com.ws.AdapterView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ws.GreenDao.Specialities;
import com.ws.ChinaIndustryStandard.R;

@EViewGroup(R.layout.item_specialities)
public class SpecialitiesItemView extends LinearLayout {
    @ViewById
    TextView tv_name, tv_tb, tv_code;

    public SpecialitiesItemView(Context context) {
        super(context);
    }

    public void bind(Specialities specialities) {
        try {
            tv_name.setText(specialities.getName());
            tv_tb.setText(specialities.getTb());
            tv_code.setText(specialities.getCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
