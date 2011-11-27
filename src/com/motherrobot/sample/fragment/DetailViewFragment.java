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
		// I should be able to look these up by name, but that wasn't working...
		// ex. getResources().getIdentifier(content, "drawable", getPackageName());
		// So clunky way below, suitable for this example
        if (content.equals("20111024")) {
        	return R.drawable.mt20111024;
        }
        if (content.equals("20111025")) {
        	return R.drawable.mt20111025;
        }
        if (content.equals("20111026")) {
        	return R.drawable.mt20111026;
        }
        if (content.equals("20111027")) {
        	return R.drawable.mt20111027;
        }
        if (content.equals("20111028")) {
        	return R.drawable.mt20111028;
        }
        if (content.equals("20111029")) {
        	return R.drawable.mt20111029;
        }
		return R.drawable.mt20111024;
	}

}
