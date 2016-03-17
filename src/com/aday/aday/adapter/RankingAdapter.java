package com.aday.aday.adapter;

import java.util.List;

import com.aday.aday.R;
import com.aday.aday.model.VideoRankingModel;
import com.aday.aday.util.TimeUtil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RankingAdapter extends BaseAdapter {

	List<VideoRankingModel> data;
	Context context;
	LayoutInflater inflater;

	public RankingAdapter() {

	}

	public RankingAdapter(Context context, List<VideoRankingModel> data) {
		this.data = data;
		this.context = context;
		this.inflater = LayoutInflater.from(context);
	}
	
	public void setData(List<VideoRankingModel> data){
		this.data = data;
		this.notifyDataSetChanged();
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

	@SuppressLint("InflateParams") @Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = inflater.inflate(
					R.layout.activity_video_ranking_item, null);
			holder = new ViewHolder();
			holder.imageView = (ImageView) convertView
					.findViewById(R.id.iv_video_ranking_item_iamgeview);
			holder.tv_title = (TextView) convertView
					.findViewById(R.id.tv_video_ranking_item_title);
			holder.tv_type = (TextView) convertView
					.findViewById(R.id.tv_video_ranking_item_type);
			holder.tv_num = (TextView) convertView
					.findViewById(R.id.tv_video_ranking_item_num);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		VideoRankingModel model = (VideoRankingModel) getItem(position);
		holder.imageView.setImageResource(Integer.parseInt(model.getLogo()));
		holder.tv_title.setText(model.getName());
		holder.tv_num.setText(position + 1 + "");
		holder.tv_type.setText(model.getType() + "/"
				+ TimeUtil.getTimeByVideo(model.getTime()));
		return convertView;
	}

	class ViewHolder {
		ImageView imageView;
		TextView tv_title, tv_type, tv_num;
	}
}
