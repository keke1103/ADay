package com.aday.aday.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.model.VideoHomePageModel;
import com.aday.aday.util.TimeUtil;

/**
 * 视频播放信息界面
 * 
 * @author 余飞
 * 
 */
public class VideoMessageActivity extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	ImageView iv_return, iv_play;
	TextView tv_month, tv_day, tv_title, tv_type, tv_content;

	CheckBox cb_like, cb_like2, cb_comment, cb_save;

	VideoHomePageModel data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_message);

		initData();

		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		tv_month = (TextView) findViewById(R.id.tv_video_message_month);
		tv_day = (TextView) findViewById(R.id.tv_video_message_day);
		tv_title = (TextView) findViewById(R.id.tv_video_message_title);
		tv_type = (TextView) findViewById(R.id.tv_video_message_type);
		tv_content = (TextView) findViewById(R.id.tv_video_message_content);
		tv_month.setText(TimeUtil.getMonthToEnglish(data.getTime()));
		tv_day.setText(TimeUtil.getDayToEnglish(data.getTime()));
		tv_title.setText(data.getTitle());
		tv_type.setText(data.getType());
		tv_content.setText(data.getContent());

		iv_return = (ImageView) findViewById(R.id.iv_video_message_return);
		iv_play = (ImageView) findViewById(R.id.iv_video_message_play);
		iv_return.setOnClickListener(this);
		iv_play.setOnClickListener(this);

		cb_like = (CheckBox) findViewById(R.id.cb_video_message_like);
		cb_like2 = (CheckBox) findViewById(R.id.cb_video_message_like2);
		cb_comment = (CheckBox) findViewById(R.id.cb_video_message_comment);
		cb_save = (CheckBox) findViewById(R.id.cb_video_message_save);
		cb_like.setOnCheckedChangeListener(this);
		cb_like2.setOnCheckedChangeListener(this);
		cb_comment.setOnCheckedChangeListener(this);
		cb_save.setOnCheckedChangeListener(this);
		cb_like.setText(data.getLike() + "");
		cb_like2.setText(data.getLike2() + "");
		cb_comment.setText(data.getComment() + "");
	}

	private void initData() {
		// 获取传递的position
		int position = getIntent().getIntExtra("position", -1);
		if (position != -1) {
			// 获取传递的对象
			data = VideoHomePageModel.getData().get(position);
		}
	}

	/**
	 * save
	 * 
	 * @param isChecked
	 */
	private void cb_save(boolean isChecked) {
		if (isChecked) {

		} else {

		}
	}

	/**
	 * comment
	 * 
	 * @param isChecked
	 */
	private void cb_comment(boolean isChecked) {
		if (isChecked) {
			cb_comment.setText(data.getComment() + 1 + "");
		} else {
			cb_comment.setText(data.getComment() - 1 + "");
		}
	}

	/**
	 * like2
	 * 
	 * @param isChecked
	 */
	private void cb_like2(boolean isChecked) {
		if (isChecked) {
			cb_like2.setText(data.getLike2() + 1 + "");
		} else {
			cb_like2.setText(data.getLike2() - 1 + "");
		}
	}

	/**
	 * like
	 * 
	 * @param isChecked
	 */
	private void cb_like(boolean isChecked) {
		if (isChecked) {
			cb_like.setText(data.getLike() + 1 + "");
		} else {
			cb_like.setText(data.getLike() - 1 + "");
		}
	}

	/**
	 * 播放跳转
	 */
	private void play() {
		Intent intent = new Intent(VideoMessageActivity.this,
				VideoHomePageActivity.class);
		startActivity(intent);
	}

	/**
	 * 返回跳转
	 */
	private void back() {
		Intent intent = new Intent(VideoMessageActivity.this,
				VideoHomePageActivity.class);
		startActivity(intent);
	}

	/**
	 * OnClickListener监听事件
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv_video_message_return:
			back();
			break;
		case R.id.iv_video_message_play:
			play();
			break;
		default:
			break;
		}
	}

	/**
	 * onCheckedChangedListener监听事件
	 * 
	 * @param buttonView
	 * @param isChecked
	 */
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		switch (buttonView.getId()) {
		case R.id.cb_video_message_like:
			cb_like(isChecked);
			break;
		case R.id.cb_video_message_like2:
			cb_like2(isChecked);
			break;
		case R.id.cb_video_message_comment:
			cb_comment(isChecked);
			break;
		case R.id.cb_video_message_save:
			cb_save(isChecked);
			break;
		default:
			break;
		}
	}

}
