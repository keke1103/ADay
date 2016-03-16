package com.aday.aday.ui;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.adapter.RankingAdapter;
import com.aday.aday.model.VideoRankingModel;

/**
 * 排行
 * 
 * @author Administrator
 * 
 */
public class RankingActivity extends Activity {
	ListView listView;
	ImageView iv_back;
	TextView tv_title;
	RadioGroup group;

	TextView tv_week, tv_month, tv_total;

	List<VideoRankingModel> data_week;
	List<VideoRankingModel> data_month;
	List<VideoRankingModel> data_total;
	RankingAdapter adapter;

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
		group = (RadioGroup) findViewById(R.id.rg_video_ranking_radiogroup);
		group.setOnCheckedChangeListener(changeListener);

		listView = (ListView) findViewById(R.id.lv_video_ranking_listview);
		adapter = new RankingAdapter(this,data_week);
		listView.setAdapter(adapter);
	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		data_week = VideoRankingModel.getData_week();
		data_month = VideoRankingModel.getData_month();
		data_total = VideoRankingModel.getData_total();
	}

	/**
	 * 总排行
	 */
	private void toTotal() {
		adapter.setData(data_total);
	}

	/**
	 * 月排行
	 */
	private void toMonth() {
		adapter.setData(data_month);
	}

	/**
	 * 周排行
	 */
	private void toWeek() {
		adapter.setData(data_week);
	}

	OnCheckedChangeListener changeListener = new OnCheckedChangeListener() {
		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch (checkedId) {
			case R.id.rbtn_video_ranking_week:
				toWeek();
				break;
			case R.id.rbtn_video_ranking_month:
				toMonth();
				break;
			case R.id.rbtn_video_ranking_total:
				toTotal();
				break;
			default:
				break;
			}
		}
	};
}
