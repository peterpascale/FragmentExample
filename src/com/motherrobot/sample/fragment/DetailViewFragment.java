package com.motherrobot.sample.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class DetailViewFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    Intent launchingIntent = getActivity().getIntent();
	    String content = launchingIntent.getData().toString();

	    View view = (View) inflater.inflate(R.layout.detail_view_content, container, true);
	    ImageView viewer = (ImageView) view.findViewById(R.id.iv_comic);
	    viewer.setBackgroundResource(matchResourceID(content));
	    

	    return view;
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
