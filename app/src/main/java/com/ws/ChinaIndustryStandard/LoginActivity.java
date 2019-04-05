package com.ws.ChinaIndustryStandard;


import android.widget.Button;
import android.widget.EditText;

import com.ws.Base.BaseActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


/**
 * A login screen that offers login via email/password.
 */
@EActivity(R.layout.activity_login)
public class LoginActivity extends BaseActivity {

    @ViewById
    Button btn_login;
    @ViewById
    EditText et_phone, et_password;

    @AfterViews
    void afterView() {
 /*       int i = 5;
        SpecialitiesDao msgBeanDao = ChinaIndustryStandardApplication.instances.getDaoSession().getSpecialitiesDao();
        Specialities studentMsgBean = new Specialities();
        studentMsgBean.setName("NAME");
        studentMsgBean.setTb("1010");
        studentMsgBean.setCode("2017");
        while(i<=15) {
            studentMsgBean.setId(i);

            msgBeanDao.insert(studentMsgBean);
            i++;
        }*/
    }

    @Click(R.id.btn_login)
    void login() {
        et_phone.getText().toString().trim();
        et_password.getText().toString().trim();
        com.ws.ChinaIndustryStandard.MainActivity_.intent(this).start();
    }

}

