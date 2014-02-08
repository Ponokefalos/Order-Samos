package com.tardis.ordersamos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Prosfores extends Activity {

	
	TextView tvTitlosProsfores,tvFameProsfora,tvMegaroProsfora,tvSweetProsfora,tvTazProsfora,tvEvrysProsfora;
	String titleProsfores,prosfora1,prosfora2,prosfora3,prosfora4,prosfora5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prosfores);
		
		tvTitlosProsfores = (TextView)findViewById(R.id.tvTitlosProsforas);
		tvFameProsfora= (TextView)findViewById(R.id.tvProsforaFame);
		tvMegaroProsfora=(TextView) findViewById(R.id.tvMegaroProsfora);
		tvSweetProsfora=(TextView) findViewById(R.id.tvSweetProsfora);
		tvTazProsfora=(TextView) findViewById(R.id.tvTazProsfora);
		tvEvrysProsfora=(TextView)findViewById(R.id.tvEvrysProsfora);
		
		//title= getResources().getString(R.string.title_Random_Choice);
		titleProsfores=getResources().getString(R.string.title_prosfores);
		prosfora1=getResources().getString(R.string.prosforaFame);
		prosfora2=getResources().getString(R.string.prosforaMegaro);
		prosfora3=getResources().getString(R.string.prosforaSweet);
		prosfora4=getResources().getString(R.string.prosforaTaz);
		prosfora5=getResources().getString(R.string.prosforaEvrys);//prepei na simplirwsw tin prosfora tou 
		
		//tvTitlosProsfores.setText(titleProsfores);
		tvFameProsfora.setText(prosfora1);
		tvMegaroProsfora.setText(prosfora2);
		tvSweetProsfora.setText(prosfora3);
		tvTazProsfora.setText(prosfora4);
		
	}

	
	

}
