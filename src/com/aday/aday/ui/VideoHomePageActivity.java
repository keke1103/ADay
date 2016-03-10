package com.aday.aday.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.aday.aday.R;

/**
 * 视频首界面
 * 
 * @author 余飞
 * 
 */
public class VideoHomePageActivity extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	ImageView iv_menu;
	RadioGroup radioGroup;
	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recommended_daily);

		initData();

		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		iv_menu = (ImageView) findViewById(R.id.iv_recommended_daily_menu);
		iv_menu.setOnClickListener(this);

		radioGroup = (RadioGroup) findViewById(R.id.bottom_radiogroup);
		radioGroup.setOnCheckedChangeListener(this);
		
		listView = (ListView) findViewById(R.id.lv_commended_daily_listview);
		
	}

	/**
	 * 初始化数据
	 */
	private void initData() {

	}

	/**
	 * 菜单按钮
	 */
	private void menu() {
		
	}

	/**
	 * OnClickListener单击事件
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv_recommended_daily_menu:
			menu();
			break;

		default:
			break;
		}
	}

	/**
	 * OnCheckedChangedListener监听事件
	 */
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
//		Intent intent;
		switch (checkedId) {
		case R.id.bottom_rbtn_reading:
			
			break;
		case R.id.bottom_rbtn_music:

			break;
		case R.id.bottom_rbtn_video:
			
			break;

		default:
			break;
		}
	}
}
