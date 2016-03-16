package com.aday.aday.ui;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.model.VideoRankingModel;

/**
 * 排行
 * @author Administrator
 *
 */
public class RankingActivity extends Activity{
	ListView listView;
	ImageView iv_back;
	TextView tv_title;
	
	TextView tv_week,tv_month,tv_total;
	
	List<VideoRankingModel> data;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_ranking);
		
		initData();
		
		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		listView = (ListView) findViewById(R.id.lv_video_ranking_listview);
	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		data = VideoRankingModel.getData();
	}
}
