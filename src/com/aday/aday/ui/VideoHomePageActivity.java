package com.aday.aday.ui;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.aday.aday.R;
import com.aday.aday.adapter.ViewHomePageListviewAdapter;
import com.aday.aday.model.VideoHomePageModel;

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
	List<VideoHomePageModel> data;
	ViewHomePageListviewAdapter adapter;
	LinearLayout llayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recommended_daily);

		initData();

		initView();
	}

	/**
	 * 初始化界面
	 * 
	 * @param height
	 */
	@SuppressWarnings("deprecation")
	private void initView() {
		iv_menu = (ImageView) findViewById(R.id.iv_recommended_daily_menu);
		iv_menu.setOnClickListener(this);

		radioGroup = (RadioGroup) findViewById(R.id.bottom_radiogroup_home);
		radioGroup.setOnCheckedChangeListener(this);

		int height = getWindowManager().getDefaultDisplay().getHeight();
		int height_llayout = radioGroup.getHeight();
		Log.i("height=" + height, "height_llayout=" + height_llayout);

		listView = (ListView) findViewById(R.id.lv_commended_daily_listview);
		adapter = new ViewHomePageListviewAdapter(this, data, height
				- height_llayout);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(VideoHomePageActivity.this,
						VideoMessageActivity.class);
				intent.putExtra("position", position);
				startActivity(intent);
			}
		});

	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		data = VideoHomePageModel.getData();
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
		// Intent intent;
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
