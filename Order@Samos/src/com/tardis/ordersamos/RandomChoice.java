package com.tardis.ordersamos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RandomChoice extends Activity {

	String title,magazi,fagito;
	TextView tvTitlos,tvOnomaMagaziou,tvFagito;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_random_choice);
		//pairnw ta dedomena gia kathe var antistoixa ap to string.xml
		title= getResources().getString(R.string.title_Random_Choice);
		magazi= getResources().getString(R.string.random_magazi);
		fagito=getResources().getString(R.string.random_fagito);
		
		//arxikopoiw ta textviews antistoixa me to xml layout id
		tvTitlos=(TextView)findViewById(R.id.tvTitlosProsforas);
		tvOnomaMagaziou=(TextView)findViewById(R.id.tvOnomaMagaziou);
		tvFagito=(TextView)findViewById(R.id.tvFagito);
		
		//allazw to periexomeno twn textviews me ta periexomena twn metavlitwn pou exw sto string.xml kai dilwsa para panw
		tvTitlos.setText(title);
		tvOnomaMagaziou.setText(magazi);
		tvFagito.setText(fagito);
		
		
		
		
	
	
	
	}

	

}
