package com.ws.util;

import android.content.Context;
import android.widget.Toast;

public class ShowUtil {

	/**
	 * @Log.v() VERBOSE 黑色
	 * @Log.d() DEBUG 蓝色
	 * @Log.i() INFO 绿色
	 * @Log.w() WARN 橙色
	 * @Log.e() ERROR 红色
	 */
	/**
	 * @ToastShort
	 * */
	public static void ToastShort(Context context, String msg) {
		Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}

	/**
	 * @ToastLong
	 * */
	public static void ToastLong(Context context, String msg) {
		Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
	}

	/**
	 * @Systemout
	 * */
	public static void SysPrintOut(String str) {
		System.out.println(str);
	}

	public static final void log(String txt) {
		System.out.println("default:" + txt);
	}

	public static final void log(String tag, String txt) {
		System.out.println(tag + ":" + txt);
	}
}
