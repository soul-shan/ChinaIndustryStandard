
package com.ws.net;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.ws.config.ServerConfig;
import com.ws.rsa.MD5;
import com.ws.rsa.RSA;
import com.ws.util.ShowUtil;

import okhttp3.OkHttpClient;

public class RQ {

/*    private static final boolean debug = true;
    private static OkHttpClient okHttpClient = new OkHttpClient();
    static {
        if (debug) {
            okHttpClient.networkInterceptors().add(new StethoInterceptor());
        }
    }*/
    private static AsyncHttpClient httpClient;

    static {
        httpClient = new AsyncHttpClient();
        httpClient.setTimeout(120000);
    }


    /**
     * 从服务器端获取图片
     *
     * @param imageUrl
     * @param handler
     */

    public static void getImageFromServer(String imageUrl,
                                          FileAsyncHttpResponseHandler handler) {
        httpClient.get(imageUrl, handler);
    }


    /**
     * 通过HashMap对象获取请求的参数字符串
     *
     * @param action  请求的接口动作
     * @param dataMap 请求的参数集合
     * @return 返回编码后的请求参数
     */

    public static String getJsonData(String method, String userid,
                                     Map<String, Object> dataMap) {
        JSONObject dataJson = new JSONObject(dataMap);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("method", method);
        hashMap.put("data", dataJson);
        hashMap.put("userid", userid);
        JSONObject jsonObject = new JSONObject(hashMap);
        String data = "";
        try {
            String objStr = jsonObject.toJSONString();
            ShowUtil.log("client", objStr);
            data = URLEncoder.encode(objStr, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return data;
    }


    /**
     * 提交地址
     *
     * @param url
     * @param data
     * @param cb
     */

    public static void post(String data, AsyncHttpResponseHandler cb) {
        RequestParams params = new RequestParams();
        params.put("data", data);
        params.put("token", getToken(data));
        params.put("system", ServerConfig.system);

        // System.out.println("data:" + data);
        // System.out.println("token:" + getToken(data));
         System.out.println("system:" + ServerConfig.system);
        httpClient.post(ServerConfig.url, params, cb);
    }


    /**
     * 获取加密后的数据签名
     *
     * @param data
     * @return
     */

    public final static String getToken(String data) {
        // 初步想法为先用MD5获取其缩略16个字节的文本。然后执行DSA或者RSA加密，采取公钥和私钥的形式。
        String md5Txt = MD5.md5(data);
        String rsa = RSA.encrypt(md5Txt);
        return rsa;
    }

    // public static void putImagesToServer(BaseActivity baseActivity,
    // String[] keys, String[] imgPath, AsyncHttpResponseHandler cb) {
    // RequestParams params = new RequestParams();
    // for (int i = 0; i < keys.length; i++) {
    // File file = new File(imgPath[i]);
    // try {
    // params.put(keys[i], file);
    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // }
    // }
    // ShowUtil.log("FireCSConfig.imageUrl:", FireCSConfig.uploadImgUrl);
    // httpClient.post(FireCSConfig.uploadImgUrl, params, cb);
    // }
}
