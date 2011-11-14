package com.motherrobot.sample.fragment;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;


public class MasterListActivity extends ListActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.strip_dates, R.layout.master_list_view));
        final String[] links = getResources().getStringArray(R.array.strip_refs);

        getListView().setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                String strip = links[position];
                Intent showStrip = new Intent(getApplicationContext(),
                        DetailViewActivity.class);
                showStrip.setData(Uri.parse(strip));
                startActivity(showStrip);
            }
        });
    }
}