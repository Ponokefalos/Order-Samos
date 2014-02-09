package com.tardis.ordersamos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Prosfores extends EstiatoriaPopup {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prosfores);

		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);

		// Listview Group click listener
		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				// Toast.makeText(getApplicationContext(),
				// "Group Clicked " + listDataHeader.get(groupPosition),
				// Toast.LENGTH_SHORT).show();
				return false;
			}
		});

		// Listview Group expanded listener
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + "Click on text to Call",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				
				if (childPosition == 0){//Fame
					setArray_tilefona(R.array.Til_Fame);
					createCallDialog();
				}
				else if (childPosition == 1){//Megaro
					setArray_tilefona(R.array.Til_Megaro);
					createCallDialog();
				}
				else if (childPosition == 2){//Taz
					setArray_tilefona(R.array.Til_Taz);
					createCallDialog();
				}
				else if (childPosition == 3){//Evrys
					setArray_tilefona(R.array.Til_Evrys);
					createCallDialog();
				}
				else if (childPosition == 4){//SweetnSalty
					setArray_tilefona(R.array.Til_SweetnSalty);
					createCallDialog();
				}
				return false;
			}
		});
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Fame");
		listDataHeader.add("Megaro");
		listDataHeader.add("Taz");
		listDataHeader.add("Evrys");
		listDataHeader.add("Sweet & Salty");
		
		// Adding child data
		List<String> Fame = new ArrayList<String>();
		Fame.add(getResources().getString(R.string.prosforaFame));
		
		List<String> Megaro = new ArrayList<String>();
		Megaro.add(getResources().getString(R.string.prosforaMegaro));
		
		List<String> Taz = new ArrayList<String>();
		Taz.add(getResources().getString(R.string.prosforaTaz));

		List<String> Evrys = new ArrayList<String>();
		Evrys.add(getResources().getString(R.string.prosforaEvrys));
		
		List<String> SweetnSalty = new ArrayList<String>();
		SweetnSalty.add(getResources().getString(R.string.prosforaSweet));
		

		listDataChild.put(listDataHeader.get(0), Fame); // Header, Child data
		listDataChild.put(listDataHeader.get(1), Megaro);
		listDataChild.put(listDataHeader.get(2), Taz);
		listDataChild.put(listDataHeader.get(3), Evrys);
		listDataChild.put(listDataHeader.get(4), SweetnSalty);
	}
}
