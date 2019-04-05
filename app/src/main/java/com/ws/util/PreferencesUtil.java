package com.ws.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * @author ws
 * @version 1.0
 * @date 2015年3月13日 17:11:51
 * @promise 数据存储工具
 */
public class PreferencesUtil {
	/*
	 * 写入数据 int String long float boolean
	 */
	public static void write(Context context, String filename, String k,
			String v) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		Editor editor = preferences.edit();
		editor.putString(k, v);
		editor.commit();
	}

	public static void write(Context context, String filename, String k, int v) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		Editor editor = preferences.edit();
		editor.putInt(k, v);
		editor.commit();
	}

	public static void write(Context context, String filename, String k, float v) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		Editor editor = preferences.edit();
		editor.putFloat(k, v);
		editor.commit();
	}

	public static void write(Context context, String filename, String k, long v) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		Editor editor = preferences.edit();
		editor.putLong(k, v);
		editor.commit();
	}

	public static void write(Context context, String filename, String k,
			boolean v) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		Editor editor = preferences.edit();
		editor.putBoolean(k, v);
		editor.commit();
	}

	/*
	 * 读取数据 int String long float boolean
	 */
	public static String read(Context context, String filename, String key,
			String defValue) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		return preferences.getString(key, defValue);
	}

	public static int read(Context context, String filename, String key,
			int defValue) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		return preferences.getInt(key, defValue);
	}

	public static boolean read(Context context, String filename, String key,
			boolean defValue) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		return preferences.getBoolean(key, defValue);
	}

	public static float read(Context context, String filename, String key,
			float defValue) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		return preferences.getFloat(key, defValue);
	}

	public static long read(Context context, String filename, String key,
			long defValue) {
		SharedPreferences preferences = context.getSharedPreferences(filename,
				Context.MODE_PRIVATE);
		return preferences.getLong(key, defValue);
	}

	/*
	 * 移除一个键值对
	 */
	public static void remove(Context context, String fileName, String k) {
		SharedPreferences preferences = context.getSharedPreferences(fileName,
				Context.MODE_PRIVATE);
		Editor editor = preferences.edit();
		editor.remove(k);
		editor.commit();
	}

	/*
	 * 清除所有键值对
	 */
	public static void clean(Context context, String fileName) {
		SharedPreferences preferences = context.getSharedPreferences(fileName,
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = preferences.edit();
		editor.clear();
		editor.commit();
	}
}
