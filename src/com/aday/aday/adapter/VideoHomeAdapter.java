package com.aday.aday.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.model.VideoRankingModel;
import com.aday.aday.util.TimeUtil;

public class VideoHomeAdapter extends BaseAdapter {

	List<VideoRankingModel> data;
	Context context;
	LayoutInflater inflater;
	int height = -1;

	public VideoHomeAdapter() {

	}

	public VideoHomeAdapter(Context context, List<VideoRankingModel> data) {
		this.data = data;
		this.context = context;
		inflater = LayoutInflater.from(context);
	}

	public VideoHomeAdapter(Context context, List<VideoRankingModel> data,
			int height) {
		this.data = data;
		this.context = context;
		this.inflater = LayoutInflater.from(context);
		this.height = height;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = inflater.inflate(
					R.layout.activity_recommended_daily_item, null);
			holder = new ViewHolder();
			holder.iv_background = (ImageView) convertView
					.findViewById(R.id.iv_recommended_daily_background);
			holder.tv_month = (TextView) convertView
					.findViewById(R.id.tv_recommended_daily_month);
			holder.tv_day = (TextView) convertView
					.findViewById(R.id.tv_recommended_daily_day);
			holder.tv_title = (TextView) convertView
					.findViewById(R.id.tv_recommended_daily_title);
			holder.tv_type = (TextView) convertView
					.findViewById(R.id.tv_recommended_daily_type);
			holder.tv_content = (TextView) convertView
					.findViewById(R.id.tv_recommended_daily_content);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		VideoRankingModel model = (VideoRankingModel) getItem(position);
		holder.tv_month.setText(TimeUtil.getMonthToEnglish(model
				.getRecommendTime()));
		holder.tv_day
				.setText(TimeUtil.getDayToEnglish(model.getRecommendTime()));
		holder.tv_title.setText(model.getName());
		holder.tv_content.setText(model.getContent());
		holder.tv_type.setText(model.getType() + "/"
				+ TimeUtil.getTimeByVideo(model.getTime()));
		
		if (height != -1) {
			holder.iv_background.setMinimumHeight(height);
			//设置item的最低高度
			convertView.setMinimumHeight(height);
		}
		return convertView;
	}

	class ViewHolder {
		ImageView iv_background;
		TextView tv_month, tv_day, tv_title, tv_type, tv_content;
	}

}
