package com.alamatcs.faiyaz.lostandfind;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ImageAdapter extends ArrayAdapter {
	Activity context;
	List<LostFindBean> items;
	boolean[] arrows;
	int layoutId;
	int textId;
	int imageId;

	ImageAdapter(Activity context, int layoutId, int textId, int imageId,
				 List<LostFindBean> items, boolean[] arrows) {
		super(context, layoutId, items);
		this.context = context;
		this.items = items;
		this.arrows = arrows;
		this.layoutId = layoutId;
		this.textId = textId;
		this.imageId = imageId;
}

	public View getView(int pos, View convertView, ViewGroup parent){
		Log.d("Test",items.get(pos).getContact_name());
		LayoutInflater inflater=context.getLayoutInflater();
		View row=inflater.inflate(layoutId, null);
		TextView label=(TextView)row.findViewById(textId);
		label.setText(items.get(pos).getContact_name());
		if (arrows[pos])
		{
			ImageView icon=(ImageView)row.findViewById(imageId);
			icon.setImageResource(R.mipmap.ic_launcher);
		}
		return(row);
		}
}