package com.aday.aday.adapter;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.model.VideoHomePageModel;
import com.aday.aday.util.TimeUtil;

/**
 * 每日推荐的listview适配器
 * 
 * @author 余飞
 * 
 */
public class ViewHomePageListviewAdapter extends BaseAdapter {

	List<VideoHomePageModel> data;
	Context context;
	LayoutInflater inflater;
	int height;

	public ViewHomePageListviewAdapter() {

	}

	public ViewHomePageListviewAdapter(Context context, List<VideoHomePageModel> data, int height) {
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

	@SuppressLint("InflateParams")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.activity_recommended_daily_item, null);
			holder = new ViewHolder();
			holder.tv_month = (TextView) convertView.findViewById(R.id.tv_recommended_daily_month);
			holder.tv_day = (TextView) convertView.findViewById(R.id.tv_recommended_daily_day);
			holder.tv_title = (TextView) convertView.findViewById(R.id.tv_recommended_daily_title);
			holder.tv_type = (TextView) convertView.findViewById(R.id.tv_recommended_daily_type);
			holder.tv_content = (TextView) convertView.findViewById(R.id.tv_recommended_daily_content);
			holder.iv_play = (ImageView) convertView.findViewById(R.id.iv_recommended_daily_play);
			holder.llayout_logo = (LinearLayout) convertView.findViewById(R.id.llayout_recommended_daily_logo);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		VideoHomePageModel model = (VideoHomePageModel) getItem(position);

		holder.tv_month.setText(TimeUtil.getMonthToEnglish(model.getTime()));
		holder.tv_day.setText(TimeUtil.getDayToEnglish(model.getTime()));
		holder.tv_title.setText(model.getTitle());
		holder.tv_type.setText(model.getType() + "/" + TimeUtil.getTimeByVideo(model.getVideoTime()));
		holder.tv_content.setText(model.getContent());
		holder.llayout_logo.setBackgroundResource(Integer.parseInt(model.getLogo()));
		convertView.setMinimumHeight(height);
		return convertView;
	}

	class ViewHolder {
		TextView tv_month, tv_day, tv_title, tv_type, tv_content;
		ImageView iv_play;
		LinearLayout llayout_logo;
	}
}
