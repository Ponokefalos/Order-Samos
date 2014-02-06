package com.tardis.ordersamos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Prosfores extends Activity {

	
	TextView tvTitlosProsfores,tvProsfora1,tvProsfora2,tvProsfora3,tvProsfora4;
	String titleProsfores,prosfora1,prosfora2,prosfora3,prosfora4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prosfores);
		
		tvTitlosProsfores = (TextView)findViewById(R.id.tvTitlosProsforas);
		tvProsfora1= (TextView)findViewById(R.id.tvProsfora1);
		tvProsfora2=(TextView) findViewById(R.id.tvProsfora2);
		tvProsfora3=(TextView) findViewById(R.id.tvProsfora3);
		tvProsfora4=(TextView) findViewById(R.id.tvProsfora4);
		
		//title= getResources().getString(R.string.title_Random_Choice);
		titleProsfores=getResources().getString(R.string.title_prosfores);
		prosfora1=getResources().getString(R.string.prosforaFame);
		prosfora2=getResources().getString(R.string.prosforaMegaro);
		prosfora3=getResources().getString(R.string.prosforaSweet);
		prosfora4=getResources().getString(R.string.prosforaTaz);
		
		//tvTitlosProsfores.setText(titleProsfores);
		tvProsfora1.setText(prosfora1);
		tvProsfora2.setText(prosfora2);
		tvProsfora3.setText(prosfora3);
		tvProsfora4.setText(prosfora4);
		
	}

	
	

}
