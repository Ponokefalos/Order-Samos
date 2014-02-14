package com.tardis.ordersamos;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

import com.socialize.ActionBarUtils;
import com.socialize.Socialize;
import com.socialize.entity.Entity;
import com.socialize.ui.actionbar.ActionBarOptions;


public class Ratings extends Activity {

	Entity entity;
	TabHost th;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		 // Call Socialize in onCreate
        Socialize.onCreate(this, savedInstanceState);
        initSocialize();
        initTabHost();
	}
        
	
	private void initTabHost() {
		// TODO Auto-generated method stub
		//dimiourgeia kai arxokopoihsh tou TabHost
				th = (TabHost)findViewById(R.id.tabhost);
				th.setup();//set up the basics
				
				TabSpec specs = th.newTabSpec("tag1");
				specs.setContent(R.id.tab1);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Evrys");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag2");
				specs.setContent(R.id.tab2);//ftoixnoume ta specs gia to 2o tab
				specs.setIndicator("Fame");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag3");
				specs.setContent(R.id.tab3);//ftoixnoume ta specs gia to 3o tab
				specs.setIndicator("Sweet & Salty");//onoma
				th.addTab(specs);
				
				 specs = th.newTabSpec("tag4");
				specs.setContent(R.id.tab4);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Nostos");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag5");
				specs.setContent(R.id.tab5);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Koutala");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag6");
				specs.setContent(R.id.tab6);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Kouzina Mamas");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag7");
				specs.setContent(R.id.tab7);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Giro Giro");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag8");
				specs.setContent(R.id.tab8);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Taz");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag9");
				specs.setContent(R.id.tab9);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Megaro");//onoma
				th.addTab(specs);
				
				specs = th.newTabSpec("tag10");
				specs.setContent(R.id.tab10);//ftoixnoume ta specs gia to 1o tab
				specs.setIndicator("Vakxos");//onoma
				th.addTab(specs);
				
				th.setOnTabChangedListener(new OnTabChangeListener(){
					@Override
					public void onTabChanged(String tabId) {
					    if("tag1".equals(tabId)) {
					    	entity = Entity.newInstance("RateEvrys", "Evrys");
					    }
					    if("tag2".equals(tabId)) {
					    	entity = Entity.newInstance("RateFame", "Fame");
					    }
					    if("tag3".equals(tabId)) {
					    	entity = Entity.newInstance("RateSweet & Salty", "Sweet & Salty");
					    }
					    if("tag4".equals(tabId)) {
					    	entity = Entity.newInstance("RateNostos", "Nostos");
					    }
					    if("tag5".equals(tabId)) {
					    	entity = Entity.newInstance("RateKoutala", "Koutala");
					    }
					    if("tag6".equals(tabId)) {
					    	entity = Entity.newInstance("RateKouzinaMamas", "Kouzina Mamas");
					    }
					    if("tag7".equals(tabId)) {
					    	entity = Entity.newInstance("RateGiroGiro", "Giro Giro");
					    }
					    if("tag8".equals(tabId)) {
					    	entity = Entity.newInstance("RateTaz", "Taz");
					    }
					    if("tag9".equals(tabId)) {
					    	entity = Entity.newInstance("RateMegaro", "Megaro");
					    }
					    if("tag10".equals(tabId)) {
					    	entity = Entity.newInstance("RateVakxos", "Vakxos");
					    } 
					}});
	}

	private void initSocialize() {
		// TODO Auto-generated method stub
		// Create an entity object including a name
        // The Entity object is Serializable, so you could also store the whole
        // object in the Intent
        entity = Entity.newInstance("RateEvrys", "Evrys");
        
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
