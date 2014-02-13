package com.tardis.ordersamos;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;

import com.socialize.ActionBanOptions;
import com.socialize.Socialize;
import com.socialize.entity.Entity;

import com.socialize.ui.actionbar.ActionBarOptions;


public class Ratings extends Activity {

	Entity entity;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Call Socialize in onCreate
        Socialize.onCreate(this, savedInstanceState);
        
		initSocialize();
		
		
		
        
	}

    private void initSocialize() {
    	
        
        // Create an entity object including a name
        // The Entity object is Serializable, so you could also store the whole
        // object in the Intent
        
        entity = Entity.newInstance("RateEvris", "Evris");
        entity = Entity.newInstance("RateVakxos", "Vakxos");
        
        
        
            
        
        
        // Create an options instance to specify your theme
        ActionBarOptions options = new ActionBarOptions();
        // Set the colors for the Action Bar
        options.setStrokeColor(Color.parseColor("#591100")); // The line between the buttons
        options.setAccentColor(Color.parseColor("#ffa229")); // The accent line below the buttons
        options.setFillColor(Color.parseColor("#831400")); // The main color of the buttons
        options.setBackgroundColor(Color.parseColor("#591100")); // The background color seen on the left
        options.setHighlightColor(Color.parseColor("#b05e08")); // The thin highlight line above the buttons
        options.setTextColor(Color.parseColor("#ffba00")); // The text color for all buttons
        
        
        // Wrap your existing view with the action bar.
        // your_layout refers to the resource ID of your current layout.
        android.view.View actionBarWrapped = ActionBarUtils.showActionBar(this,
                R.layout.activity_ratings, entity, options);
 
        // Now set the view for your activity to be the wrapped view.
        setContentView(actionBarWrapped);
		
	}

	@Override
    protected void onPause() {
        super.onPause();
 
        // Call Socialize in onPause
        Socialize.onPause(this);
    }
 
    @Override
    protected void onResume() {
        super.onResume();
 
        // Call Socialize in onResume
        Socialize.onResume(this);
    }
 
    @Override
    protected void onDestroy() {
        // Call Socialize in onDestroy before the activity is destroyed
        Socialize.onDestroy(this);
 
        super.onDestroy();
    }

}
