package com.aday.aday.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 排行的视频信息model
 * 
 * @author 余飞
 * 
 */
public class VideoRankingModel {
	private String name;
	private String type;
	private long time;
	private String content;
	private int like;
	private int share;
	private int comment;
	private String videoPath;
	private int playQuantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getShare() {
		return share;
	}

	public void setShare(int share) {
		this.share = share;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public int getPlayQuantity() {
		return playQuantity;
	}

	public void setPlayQuantity(int playQuantity) {
		this.playQuantity = playQuantity;
	}

	/**
	 * 获取数据
	 * @return
	 */
	public static List<VideoRankingModel> getData() {
		List<VideoRankingModel> data = new ArrayList<VideoRankingModel>();
		VideoRankingModel model;

		for (int i = 0; i < 8; i++) {
			model = new VideoRankingModel();
			model.name = "你所遗忘的童年";
			model.type = "#记录";
			model.time = 1000 * 60 * 12 + 1000 * 31;
			model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
			model.like = 998;
			model.comment = 123;
			model.share = 444;
			model.videoPath = "";
			model.playQuantity = (int)(Math.random()*2000);
		}

		return data;
	}
}
