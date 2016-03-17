package com.aday.aday.ui;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.adapter.VideoHomeAdapter;
import com.aday.aday.model.VideoRankingModel;

/**
 * 视频首界面
 * 
 * @author 余飞
 * 
 */
public class VideoHomePageActivity extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	ImageView iv_menu, iv_spinner;
	RadioGroup radioGroup;
	ListView listView;
	List<VideoRankingModel> data;
	VideoHomeAdapter adapter;
	LinearLayout llayout;
	PopupWindow popupWindow;
	int flog = 0;

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

		radioGroup = (RadioGroup) findViewById(R.id.bottom_radiogroup);
		radioGroup.setOnCheckedChangeListener(this);

		listView = (ListView) findViewById(R.id.lv_commended_daily_listview);
		int height = getWindowManager().getDefaultDisplay().getHeight();
		adapter = new VideoHomeAdapter(getApplicationContext(), data, height-105);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(itemClickListener);

		/*// onCreat的时候，此时没有绘制图形，图形绘制是在onDraw中进行.所以在onCreate方法中获取到的控件高度是为0。
		// 可以注册一个监听，监听view绘制完成之后的高度为多少
		ViewTreeObserver viewTreeObserver = radioGroup.getViewTreeObserver();
		viewTreeObserver.addOnPreDrawListener(new OnPreDrawListener() {
			@Override
			public boolean onPreDraw() {
				Log.i("onPreDraw", "height = " + radioGroup.getHeight());
				return true;
			}
		});*/

		iv_spinner = (ImageView) findViewById(R.id.iv_recommended_daily_spinner);
		iv_spinner.setOnClickListener(this);

	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		data = VideoRankingModel.getData_home();
	}

	/**
	 * 菜单按钮
	 */
	private void menu() {

	}

	/**
	 * 跳转到排行界面
	 */
	private void gotoRank() {
		popupWindow.dismiss();
		Intent intent = new Intent(VideoHomePageActivity.this,
				RankingActivity.class);
		startActivityForResult(intent, 0);
	}

	/**
	 * 跳转到分类界面
	 */
	private void gotoClassify() {
		popupWindow.dismiss();
		Intent intent = new Intent(VideoHomePageActivity.this,
				ClassifyActivity.class);
		startActivityForResult(intent, 0);
	}

	/**
	 * 下拉按钮
	 */
	@SuppressLint("InflateParams") @SuppressWarnings("deprecation")
	private void toSpinner() {
		if (popupWindow == null) {
			View view = getLayoutInflater().inflate(
					R.layout.activity_video_spinner_item, null);
			popupWindow = new PopupWindow(view, LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT, true);
			TextView tv_rank = (TextView) view
					.findViewById(R.id.tv_video_spinner_rank);
			TextView tv_classify = (TextView) view
					.findViewById(R.id.tv_video_spinner_classify);
			tv_rank.setOnClickListener(this);
			tv_classify.setOnClickListener(this);
			popupWindow.setBackgroundDrawable(new BitmapDrawable());
		}
		// 显示位置
		popupWindow.showAsDropDown(iv_spinner);
	}

	OnItemClickListener itemClickListener = new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			Intent intent = new Intent(VideoHomePageActivity.this,
					RankingVideoInformationActivity.class);
			intent.putExtra("position", position);
			startActivityForResult(intent, 0);
		}
	};

	/**
	 * OnClickListener单击事件
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv_recommended_daily_menu:
			menu();
			break;
		case R.id.iv_recommended_daily_spinner:
			toSpinner();
			break;
		case R.id.tv_video_spinner_classify:
			gotoClassify();
			break;
		case R.id.tv_video_spinner_rank:
			gotoRank();
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
