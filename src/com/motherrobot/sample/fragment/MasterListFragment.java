package com.motherrobot.sample.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MasterListFragment extends ListFragment {


	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setListAdapter(ArrayAdapter.createFromResource(
	    		getActivity().getApplicationContext(), 
	    		R.array.strip_dates,
	            R.layout.master_list_item));
	}

	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		final String[] links = getResources().getStringArray(R.array.strip_refs);
		String strip = links[position];

		Intent showStrip = new Intent(getActivity().getApplicationContext(),
			DetailViewActivity.class);
		showStrip.setData(Uri.parse(strip));
		startActivity(showStrip);
	} 
	
}
