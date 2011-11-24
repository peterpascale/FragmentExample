package com.motherrobot.sample.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class DetailViewActivity extends Activity {

	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view_fragment);
        
        Intent launchingIntent = getIntent();
        String content = launchingIntent.getData().toString();
     
        DetailViewFragment detailView = (DetailViewFragment) getFragmentManager()
                .findFragmentById(R.id.fragment_detailview);
     
        detailView.updateComic(content);
    }
	
}
