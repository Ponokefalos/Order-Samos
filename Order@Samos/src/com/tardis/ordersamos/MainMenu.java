package com.tardis.ordersamos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainMenu extends Activity implements OnClickListener {
	//dilwsi antikeimenwn twn antistoixwn ImageButtons sto xml
	ImageButton ibEstiatoria , ibKatigories, ibBanList, ibRandomChoice, ibProsfores, ibRatings;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	
		ibEstiatoria = (ImageButton)findViewById(R.id.ibtnEstiatoria);
		ibKatigories = (ImageButton)findViewById(R.id.ibtnKatigories);
		ibBanList = (ImageButton)findViewById(R.id.ibtnBanList);
		ibRandomChoice = (ImageButton)findViewById(R.id.ibtnRandomChoice);
		ibProsfores = (ImageButton)findViewById(R.id.ibtnProsfores);
		ibRatings = (ImageButton)findViewById(R.id.ibtnRatings);
		
		ibEstiatoria.setOnClickListener(this);
		ibBanList.setOnClickListener(this);
		ibKatigories.setOnClickListener(this);
		ibRatings.setOnClickListener(this);
		ibProsfores.setOnClickListener(this);
		ibRandomChoice.setOnClickListener(this);
		
		//Settings.saveSettings("pressed", true, getApplicationContext());
	}
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId()==R.id.ibtnEstiatoria){
			startActivity(new Intent("com.tardis.ordersamos.Estiatoria"));
		}
		else if (v.getId()==R.id.ibtnKatigories){
			startActivity(new Intent("com.tardis.ordersamos.Katigories"));
		}
		else if (v.getId()==R.id.ibtnBanList){
			startActivity(new Intent("com.tardis.ordersamos.BanList"));
		}
		else if (v.getId()==R.id.ibtnRandomChoice){
			startActivity(new Intent("com.tardis.ordersamos.RandomChoice"));
		}
		else if (v.getId()==R.id.ibtnProsfores){
			startActivity(new Intent("com.tardis.ordersamos.Prosfores"));
		}
		else if (v.getId()==R.id.ibtnRatings){
			startActivity(new Intent("com.tardis.ordersamos.Ratings"));
		}
	}

	

}
