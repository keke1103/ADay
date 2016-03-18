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
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.adapter.ClassifyItemAdapter;
import com.aday.aday.model.ClassifyItemModel;

public class ClassifyItemActivity extends Activity {
	ListView listView;
	ImageView iv_back;
	TextView tv_title;
	List<ClassifyItemModel> data;
	ClassifyItemAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_classify_large_item);

		initData();

		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		tv_title = (TextView) findViewById(R.id.tv_video_top_title);
		iv_back = (ImageView) findViewById(R.id.iv_video_top_back);
		tv_title.setOnClickListener(clickListener);
		iv_back.setOnClickListener(clickListener);
		
		listView = (ListView) findViewById(R.id.lv_video_classify_largeItem_listview);
		adapter = new ClassifyItemAdapter(this,data);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(itemClickListener);
	}
	
	/**
	 * 初始化数据
	 */
	private void initData() {
		data = ClassifyItemModel.getData();
	}
	
	OnItemClickListener itemClickListener = new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			Intent intent = new Intent(ClassifyItemActivity.this,VideoInformationActivity.class);
			intent.putExtra("position", position);
			startActivityForResult(intent, 0);
		}
	};
	
	OnClickListener clickListener = new OnClickListener() {
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
}