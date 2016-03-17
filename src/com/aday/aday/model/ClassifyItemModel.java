package com.aday.aday.model;

import java.util.ArrayList;
import java.util.List;

import com.aday.aday.R;

/**
 * 分类的item数据对象
 * 
 * @author Administrator
 * 
 */
public class ClassifyItemModel {
	private String name;
	private String videoPath;
	private String videoPicture;
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public String getVideoPicture() {
		return videoPicture;
	}

	public void setVideoPicture(String videoPicture) {
		this.videoPicture = videoPicture;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取数据
	 * 
	 * @return
	 */
	public static List<ClassifyItemModel> getData() {
		List<ClassifyItemModel> data = new ArrayList<ClassifyItemModel>();
		ClassifyItemModel model;

		model = new ClassifyItemModel();
		model.name = "#冲浪";
		model.videoPath = "";
		model.videoPicture = ""+R.drawable.classify_item_1;
		model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
		data.add(model);
		
		model = new ClassifyItemModel();
		model.name = "#冲浪";
		model.videoPath = "";
		model.videoPicture = ""+R.drawable.classify_item_2;
		model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
		data.add(model);
		
		model = new ClassifyItemModel();
		model.name = "#冲浪";
		model.videoPath = "";
		model.videoPicture = ""+R.drawable.classify_item_3;
		model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
		data.add(model);
		
		model = new ClassifyItemModel();
		model.name = "#冲浪";
		model.videoPath = "";
		model.videoPicture = ""+R.drawable.classify_item_4;
		model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
		data.add(model);
		
		model = new ClassifyItemModel();
		model.name = "#冲浪";
		model.videoPath = "";
		model.videoPicture = ""+R.drawable.classify_item_5;
		model.content = "我是测试数据！我是测试数据！我是测试数据！我是测试数据！我是测试数据！";
		data.add(model);
		
		return data;
	}

}
