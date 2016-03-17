package com.aday.aday.ui;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
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
		
		tv_title = (TextView) findViewById(R.id.tv_video_top_title);
		tv_title.setText("排行");
		
		iv_back = (ImageView) findViewById(R.id.iv_video_top_back);
		iv_back.setOnClickListener(listener);

		listView = (ListView) findViewById(R.id.lv_video_ranking_listview);
		adapter = new RankingAdapter(this,data_week);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(clickListener);
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
	
	/**
	 * 打开视频信息界面
	 * @param position
	 */
	private void openItem(int position) {
		Intent intent = new Intent(RankingActivity.this,RankingVideoInformationActivity.class);
		intent.putExtra("position", position);
		startActivityForResult(intent, 0);
	}
	
	OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.iv_video_top_back:
				finish();
				break;

			default:
				break;
			}
		}
	};
	
	OnItemClickListener clickListener = new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			openItem(position);
		}
	};

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
