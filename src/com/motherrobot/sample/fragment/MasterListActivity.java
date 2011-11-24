package com.motherrobot.sample.fragment;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;


public class MasterListActivity extends Activity implements MasterListFragment.OnListItemSelectedListener {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the fragment as the content
        // A regular layout, and layout-land version exists
        setContentView(R.layout.master_list_fragment);        
    }
	

	@Override
	public void onListItemSelected(String comicID) {
		
		// Load the Fragment in an activity if its not present,
		// otherwise just update the fragment.
		DetailViewFragment detailView = (DetailViewFragment) getFragmentManager()
			.findFragmentById(R.id.fragment_detailview);
		 
		if (detailView == null || !detailView.isInLayout()) {
			Intent showContent = new Intent(getApplicationContext(),
					DetailViewActivity.class);
			showContent.setData(Uri.parse(comicID));
			startActivity(showContent);
		} else {
			detailView.updateComic(comicID);
		}
	}
	
}