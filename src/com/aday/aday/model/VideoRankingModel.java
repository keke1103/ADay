package com.aday.aday.model;

import java.util.ArrayList;
import java.util.List;

import com.aday.aday.R;

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
	private String background;
	private String logo;
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

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * 获取数据
	 * 
	 * @return
	 */
	public static List<VideoRankingModel> getData_week() {
		List<VideoRankingModel> data = new ArrayList<VideoRankingModel>();
		VideoRankingModel model;
		String[] pic_week = { R.drawable.video_week1 + "",
				R.drawable.video_week2 + "", R.drawable.video_week3 + "",
				R.drawable.video_week4 + "", R.drawable.video_week5 + ""};

		for (int i = 0; i < pic_week.length; i++) {
			model = new VideoRankingModel();
			model.name = "你所遗忘的童年";
			model.type = "#记录";
			model.time = 1000 * 60 * 12 + 1000 * 31;
			model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
			model.like = 998;
			model.comment = 123;
			model.share = 444;
			model.videoPath = "";
			model.playQuantity = (int) (Math.random() * 2000);
			model.background = "";
			model.logo = pic_week[i];
		}

		return data;
	}
	
	/**
	 * 获取数据
	 * 
	 * @return
	 */
	public static List<VideoRankingModel> getData_month() {
		List<VideoRankingModel> data = new ArrayList<VideoRankingModel>();
		VideoRankingModel model;
		String[] pic_month = { R.drawable.video_month_1 + "",
				R.drawable.video_month_2 + "", R.drawable.video_month_3 + "",
				R.drawable.video_month_4 + "", R.drawable.video_month_5 + ""};

		for (int i = 0; i < pic_month.length; i++) {
			model = new VideoRankingModel();
			model.name = "你所遗忘的童年";
			model.type = "#记录";
			model.time = 1000 * 60 * 12 + 1000 * 31;
			model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
			model.like = 998;
			model.comment = 123;
			model.share = 444;
			model.videoPath = "";
			model.playQuantity = (int) (Math.random() * 2000);
			model.background = "";
			model.logo = pic_month[i];
		}

		return data;
	}
	
	/**
	 * 获取数据
	 * 
	 * @return
	 */
	public static List<VideoRankingModel> getData_total() {
		List<VideoRankingModel> data = new ArrayList<VideoRankingModel>();
		VideoRankingModel model;
		String[] pic_total = { R.drawable.video_total_1 + "",
				R.drawable.video_total_2 + "", R.drawable.video_total_3 + "",
				R.drawable.video_total_4 + "", R.drawable.video_total_5 + ""};

		for (int i = 0; i < pic_total.length; i++) {
			model = new VideoRankingModel();
			model.name = "你所遗忘的童年";
			model.type = "#记录";
			model.time = 1000 * 60 * 12 + 1000 * 31;
			model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
			model.like = 998;
			model.comment = 123;
			model.share = 444;
			model.videoPath = "";
			model.playQuantity = (int) (Math.random() * 2000);
			model.background = "";
			model.logo = pic_total[i];
		}

		return data;
	}
}
