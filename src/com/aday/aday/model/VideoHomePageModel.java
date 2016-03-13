package com.aday.aday.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private String logo;
	private int like;
	private int like2;
	private int comment;

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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getLike2() {
		return like2;
	}

	public void setLike2(int like2) {
		this.like2 = like2;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	/**
	 * 获取测试数据
	 * 
	 * @return
	 */
	public static List<VideoHomePageModel> getData() {
		List<VideoHomePageModel> data = new ArrayList<VideoHomePageModel>();
		VideoHomePageModel model;
		for (int i = 0; i < 10; i++) {
			model = new VideoHomePageModel();
			model.setContent("我是测试文本内容======>" + i + "号数据！");
			model.setTime(new Date().getTime());
			model.setTitle("我是测试标题======>" + i + "号数据！");
			model.setType("科幻电影");
			model.setVideoTime(1000 * 60 * 2 + 1000 * 30);
			model.setLogo(android.R.color.holo_blue_dark + "");
			model.setLike((i+10)*101);
			model.setLike2((i+10)*101);
			model.setComment((i+10)*101);
			data.add(model);
		}
		return data;
	}
}
