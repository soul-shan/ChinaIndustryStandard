
package com.ws.net;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.ws.GreenDao.Specialities;

import java.util.HashMap;


public class RequestNet {

	public static void login(String username, String password,
							 AsyncHttpResponseHandler cb) {

	}
	/**
	* 更新 书目
	* */
	public static void updateSpecialities(AsyncHttpResponseHandler cb) {
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		String json = RQ.getJsonData("updateSpecialities", "", dataMap);
		RQ.post(json, cb);
	}
	/**
	 * 更新 书籍，通过id
	 * */
	public static void updateCatalogBySpecialitiesId(AsyncHttpResponseHandler cb,int id){
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("id",id);
		String json = RQ.getJsonData("updateCatalogBySpecialitiesId", "", dataMap);
		RQ.post(json, cb);
	}
	/**
	 * 更新 书籍，通过id
	 * */
	public static void updateParagraphBySpecialitiesId(AsyncHttpResponseHandler cb,int id){
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("id",id);
		String json = RQ.getJsonData("updateParagraphBySpecialitiesId", "", dataMap);
		RQ.post(json, cb);
	}

	/**
	 * 更新 书籍，通过id
	 * */
	public static void updateParagraph(AsyncHttpResponseHandler cb){
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		String json = RQ.getJsonData("updateParagraph", "", dataMap);
		RQ.post(json, cb);
	}
	public static void updateCatalog(AsyncHttpResponseHandler cb){
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		String json = RQ.getJsonData("updateCatalog", "", dataMap);
		RQ.post(json, cb);
	}

}
