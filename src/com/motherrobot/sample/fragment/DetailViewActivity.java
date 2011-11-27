package com.motherrobot.sample.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class DetailViewActivity extends FragmentActivity {

	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view_fragment);
        
        Intent launchingIntent = getIntent();
        String content = launchingIntent.getData().toString();
     
        DetailViewFragment detailView = (DetailViewFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_detailview);
     
        detailView.updateComic(content);
    }
	
}
