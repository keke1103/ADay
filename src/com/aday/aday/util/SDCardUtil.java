package com.aday.aday.util;

import java.lang.reflect.InvocationTargetException;

import android.content.Context;
import android.os.storage.StorageManager;

/**
 * SD卡的操作类
 * 
 * @author 余飞
 * 
 */
public class SDCardUtil {

	/**
	 * 获取手机所有的sd卡根目录，第一条路径默认为手机内置内存路径
	 * 
	 * @param context
	 * @return
	 */
	public static String[] getAllSDCardPath(Context context) {
		StorageManager sm = (StorageManager) context
				.getSystemService(Context.STORAGE_SERVICE);
		// 获取sdcard的路径：外置和内置
		String[] paths = null;
		try {
			//通过反射机制，拿取所有的SD卡路径数组
			paths = (String[]) sm.getClass().getMethod("getVolumePaths", null)
					.invoke(sm, null);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return paths;
	}
}
