package com.motherrobot.sample.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class DetailViewFragment extends Fragment {
	
	private ImageView viewer;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    View view = (View) inflater.inflate(R.layout.detail_view_content, container, true);
	    viewer = (ImageView) view.findViewById(R.id.iv_comic);

	    return view;
	}
	
	public void updateComic(String content) {
	    if (viewer != null) {
	    	viewer.setBackgroundResource(matchResourceID(content));
	    }
	}
	
	private int matchResourceID(String content) {
		return getResources().getIdentifier("mt" + content, "drawable", getActivity().getPackageName());
		
	}

}
