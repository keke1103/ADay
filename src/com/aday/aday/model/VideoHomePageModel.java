package com.aday.aday.model;

/**
 * 视频首页每日推荐的数据对象
 * 
 * @author 余飞
 *
 */
public class VideoHomePageModel {
	private long time;
	private String title;
	private String type;
	private long videoTime;
	private String content;

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getVideoTime() {
		return videoTime;
	}

	public void setVideoTime(long videoTime) {
		this.videoTime = videoTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
