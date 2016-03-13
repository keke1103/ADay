package com.aday.aday.util;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 时间操作类，用于将时间转换成相应的格式
 * 
 * @author 余飞
 * 
 */
public class TimeUtil {

	/**
	 * 获取该时间的英文月份
	 * 
	 * @param time
	 * @return 英文的月份
	 */
	public static String getMonthToEnglish(long time) {
		Date date = new Date(time);
		SimpleDateFormat format = new SimpleDateFormat("MMM", Locale.ENGLISH);
		return format.format(date);
	}

	/**
	 * 获取该时间的英文日数
	 * 
	 * @param time
	 * @return 英文的日数
	 */
	public static String getDayToEnglish(long time) {
		Date date = new Date(time);
		SimpleDateFormat format = new SimpleDateFormat("d", Locale.ENGLISH);
		return format.format(date);
	}

	/**
	 * 获取该时间的 指定时长格式 mm'ss"
	 * 
	 * @param time
	 * @return
	 */
	@SuppressLint("SimpleDateFormat") 
	public static String getTimeByVideo(long time) {
		Date date = new Date(time);
		SimpleDateFormat format = new SimpleDateFormat("mm:ss");
		return format.format(date);
	}

}
