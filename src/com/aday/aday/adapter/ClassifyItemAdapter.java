package com.aday.aday.adapter;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aday.aday.R;
import com.aday.aday.model.ClassifyItemModel;

public class ClassifyItemAdapter extends BaseAdapter {

	List<ClassifyItemModel> data;
	Context context;
	LayoutInflater inflater;

	public ClassifyItemAdapter() {

	}

	public ClassifyItemAdapter(Context context, List<ClassifyItemModel> data) {
		this.data =data;
		this.context = context;
		this.inflater = LayoutInflater.from(context);
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
		if(convertView == null){
			convertView = inflater.inflate(R.layout.activity_video_classify_large_item_item, null);
			holder = new ViewHolder();
			holder.imageView = (ImageView) convertView.findViewById(R.id.iv_video_classify_large_item_item_iamgeview);
			holder.rl_play = (RelativeLayout) convertView.findViewById(R.id.rlayout_video_classify_large_item_item_play);
			holder.tv_title = (TextView) convertView.findViewById(R.id.tv_video_classify_large_item_item_name);
			holder.tv_content = (TextView) convertView.findViewById(R.id.tv_video_classify_large_item_item_content);
			holder.rl_play.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.i("ClassifyItemAdapter", "onClick");
				}
			});
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		ClassifyItemModel model = (ClassifyItemModel) getItem(position);
		holder.imageView.setImageResource(Integer.parseInt(model.getVideoPicture()));
		holder.tv_title.setText(model.getName());
		holder.tv_content.setText(model.getContent());
		return convertView;
	}
	
	class ViewHolder{
		ImageView imageView;
		RelativeLayout rl_play;
		TextView tv_title,tv_content;
	}

}
