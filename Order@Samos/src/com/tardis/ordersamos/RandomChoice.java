package com.tardis.ordersamos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RandomChoice extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_random_choice);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.random_choice, menu);
		return true;
	}

}
