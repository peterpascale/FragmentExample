package com.motherrobot.sample.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MasterListFragment extends ListFragment {

	private OnListItemSelectedListener listItemSelectedListener;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setListAdapter(ArrayAdapter.createFromResource(
	    		getActivity().getApplicationContext(), 
	    		R.array.strip_dates,
	            R.layout.master_list_item));
	    
	    listItemSelectedListener = (OnListItemSelectedListener) getActivity();
	}

	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		final String[] links = getResources().getStringArray(R.array.strip_refs);
		String strip = links[position];
		listItemSelectedListener.onListItemSelected(strip);
	} 

	
	public interface OnListItemSelectedListener {
	    public void onListItemSelected(String comicID);
	}

}
