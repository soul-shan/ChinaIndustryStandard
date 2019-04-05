
package com.ws.net;

import java.net.URLDecoder;

import com.alibaba.fastjson.JSONObject;
import com.loopj.android.http.TextHttpResponseHandler;
import com.ws.Base.BaseActivity;

public abstract class CB extends TextHttpResponseHandler {
    private BaseActivity activity;


    /**
     * 使用该构造方法，出现错误将不会提示弹出信息
     */

    public CB() {
    }

    public CB(BaseActivity activity) {
        this.activity = activity;
    }


    @Override
    public void onStart() {

        super.onStart();
        // if (activity != null) {
        // activity.showProgressDialog();
        // }

    }

    private void finish() {

	/*	 if (activity != null) {
         activity.hideProgressDialog();
		 }*/

    }

    public abstract void fail(JSONObject response);

    @Override
    public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, String responseString, Throwable throwable) {
        finish();

    }

    @Override
    public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, String responseString) {
        finish();

        try {
            responseString = URLDecoder.decode(responseString, "utf-8");

            JSONObject response = JSONObject.parseObject(responseString.trim());
            int error = response.getIntValue("error");
            if (error == 0) {
                success(response);
            } else {
                String errorMsg = response.getString("msg");
                if (activity != null) {
                    // activity.showToast(error + ":" + errorMsg);
                    // activity.showToastConfirm(errorMsg);
                }
                fail(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract void success(JSONObject response);

}
