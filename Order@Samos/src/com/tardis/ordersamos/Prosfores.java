package com.tardis.ordersamos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Prosfores extends Activity {

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
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(
						getApplicationContext(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();
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
		Fame.add("Παραγγελία από 15€-20€ Δώρο 1 Coca-Cola 0.5lt \n Με 2 οικογενειακές  πίτσες Δώρο 1 Coca-Cola 0.5lt \n Παραγγελία πάνω από 20€ Δώρο 1  Coca-Cola1.5lt ή 1 Σαλάτα του σεφ ή 1Κρέπασοκολάτα");
		

		List<String> Megaro = new ArrayList<String>();
		Megaro.add("Με αγορά 3 ειδών (πίτσα, πεϊνερλί, καλτσόνε ζυμαρικά ) Δώρο 1  Σαλάτα του σεφ ή  1 αναψυκτικό 1.5lt\n Έκπτωση για ΑΜΕΑ 20%");
		

		List<String> Taz = new ArrayList<String>();
		Taz.add("Όλα τα φαγητά (νερό+αναψυκτικό+ψωμί) 6,80");

		List<String> Evrys = new ArrayList<String>();
		Evrys.add("not yet");
		
		List<String> SweetnSalty = new ArrayList<String>();
		SweetnSalty.add("Με 3 αλμυρές κρέπες Δώρο 1 Κρέπα σοκολάτα-μπισκότοή  1  Coca-Cola 500ml \n Με 4 αλμυρές κρέπες Δώρο 1 Coca-Cola 1.5lt");
		

		listDataChild.put(listDataHeader.get(0), Fame); // Header, Child data
		listDataChild.put(listDataHeader.get(1), Megaro);
		listDataChild.put(listDataHeader.get(2), Taz);
		listDataChild.put(listDataHeader.get(3), Evrys);
		listDataChild.put(listDataHeader.get(4), SweetnSalty);
	}
}
