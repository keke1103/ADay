package com.aday.aday.ui;

import com.aday.aday.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 分类
 * 
 * @author 余飞
 * 
 */
public class ClassifyActivity extends Activity {

	ImageView iv_back;
	TextView tv_title;
	GridView gridView;
	TextView tv_cy, tv_lx, tv_jq, tv_ms, tv_dm, tv_ss, tv_yd, tv_dw;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_classify);

		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		tv_cy = (TextView) findViewById(R.id.tv_classify_cy);
		tv_lx = (TextView) findViewById(R.id.tv_classify_lx);
		tv_jq = (TextView) findViewById(R.id.tv_classify_jq);
		tv_ms = (TextView) findViewById(R.id.tv_classify_ms);
		tv_dm = (TextView) findViewById(R.id.tv_classify_dm);
		tv_ss = (TextView) findViewById(R.id.tv_classify_ss);
		tv_yd = (TextView) findViewById(R.id.tv_classify_yd);
		tv_dw = (TextView) findViewById(R.id.tv_classify_dw);
		tv_cy.setOnClickListener(clickListener);
		tv_lx.setOnClickListener(clickListener);
		tv_jq.setOnClickListener(clickListener);
		tv_ms.setOnClickListener(clickListener);
		tv_dm.setOnClickListener(clickListener);
		tv_ss.setOnClickListener(clickListener);
		tv_yd.setOnClickListener(clickListener);
		tv_dw.setOnClickListener(clickListener);

		iv_back = (ImageView) findViewById(R.id.iv_video_top_back);
		iv_back.setOnClickListener(clickListener);

		tv_title = (TextView) findViewById(R.id.tv_video_top_title);
		tv_title.setText(R.string.classify);
	}

	OnClickListener clickListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(ClassifyActivity.this,
					ClassifyItemActivity.class);
			switch (v.getId()) {
			case R.id.tv_classify_cy:
				startActivityForResult(intent, 0);
				break;
			case R.id.tv_classify_lx:
				startActivityForResult(intent, 0);
				break;
			case R.id.tv_classify_jq:
				startActivityForResult(intent, 0);
				break;
			case R.id.tv_classify_ms:
				startActivityForResult(intent, 0);
				break;
			case R.id.tv_classify_dm:
				startActivityForResult(intent, 0);
				break;
			case R.id.tv_classify_ss:
				startActivityForResult(intent, 0);
				break;
			case R.id.tv_classify_yd:
				startActivityForResult(intent, 0);
				break;
			case R.id.tv_classify_dw:
				startActivityForResult(intent, 0);
				break;
			case R.id.iv_video_top_back:
				finish();
				break;
			default:
				break;
			}
		}
	};

}
