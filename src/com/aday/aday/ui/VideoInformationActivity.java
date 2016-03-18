package com.aday.aday.ui;

import java.io.File;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.model.VideoRankingModel;
import com.aday.aday.util.SDCardUtil;
import com.aday.aday.util.TimeUtil;

public class VideoInformationActivity extends Activity {
	List<VideoRankingModel> data;
	VideoRankingModel model;
	ImageView iv_back;
	TextView tv_title;
	RelativeLayout rlayout_play;

	ImageView iv_background;
	TextView tv_name, tv_type, tv_content, tv_save, tv_share, tv_comment;
	CheckBox cb_like;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_ranking_item);

		initData();

		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		tv_title = (TextView) findViewById(R.id.tv_video_top_title);
		tv_title.setText("排行");

		iv_back = (ImageView) findViewById(R.id.iv_video_top_back);
		iv_back.setOnClickListener(listener);

		rlayout_play = (RelativeLayout) findViewById(R.id.rLayout_video_ranking_item_play);
		rlayout_play.setOnClickListener(listener);

		iv_background = (ImageView) findViewById(R.id.iv_video_ranking_item_imageview);
		tv_name = (TextView) findViewById(R.id.tv_video_ranking_item_title);
		tv_type = (TextView) findViewById(R.id.tv_video_ranking_item_type);
		tv_content = (TextView) findViewById(R.id.tv_video_ranking_item_content);
		tv_share = (TextView) findViewById(R.id.tv_video_ranking_item_share);
		tv_comment = (TextView) findViewById(R.id.tv_video_ranking_item_comment);
		cb_like = (CheckBox) findViewById(R.id.cb_video_ranking_item_like);

		initInformation();
	}

	/**
	 * 设置界面的参数信息
	 */
	private void initInformation() {
		tv_name.setText(model.getName() + "");
		tv_type.setText(model.getType() + "/"
				+ TimeUtil.getTimeByVideo(model.getTime()));
		tv_content.setText(model.getContent() + "");
		tv_share.setText(model.getShare() + "");
		tv_comment.setText(model.getComment() + "");
		cb_like.setText(model.getLike() + "");
	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		data = VideoRankingModel.getData_week();
		int position = getIntent().getExtras().getInt("position", -1);
		if (position != -1) {
			model = data.get(position);
		}
	}

	/**
	 * 播放视频跳转
	 */
	private void playvideo() {
		String[] SDpath = SDCardUtil.getAllSDCardPath(getApplicationContext());
		String videoPath = SDpath[1] + File.separator + "gamelife9.mp4";
		if(new File(videoPath).exists()){
			Uri uri = Uri.parse(videoPath);
			// 调用系统自带的播放器
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "video/mp4");
			startActivity(intent);
		}
	}
	


	OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.iv_video_top_back:
				finish();
				break;
			case R.id.rLayout_video_ranking_item_play:
				playvideo();
				break;
			default:
				break;
			}
		}
	};
}
