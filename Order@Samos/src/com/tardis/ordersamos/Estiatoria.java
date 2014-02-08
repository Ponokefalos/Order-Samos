package com.tardis.ordersamos;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class Estiatoria extends Activity implements OnClickListener, OnMenuItemClickListener{
	//Context context = getApplicationContext();
	ImageButton ibtnFame;
	ImageButton ibtnEvris;
	ImageButton ibtnKoutala;
	ImageButton ibtnGiro;
	ImageButton ibtnNostos;
	ImageButton ibtnTaz;
	ImageButton ibtnMegaro;
	ImageButton ibtnKouzina;

	int array_tilefona;
	
	int [] menu; //gia tis ikones tou menu
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estiatoria);
		initialize ();		
	}

	public  void initialize () {
		
		
		
		ibtnFame = (ImageButton) findViewById(R.id.ibtnFame);
		ibtnFame.setOnClickListener(this);
		
		ibtnEvris = (ImageButton) findViewById(R.id.ibtnEvris);
		ibtnEvris.setOnClickListener(this);
		
		ibtnKoutala = (ImageButton) findViewById(R.id.ibtnKoutala);
		ibtnKoutala.setOnClickListener(this);
		
		ibtnGiro = (ImageButton) findViewById(R.id.ibtnGiro);
		ibtnGiro.setOnClickListener(this);
		
		ibtnNostos = (ImageButton) findViewById(R.id.ibtnNostos);
		ibtnNostos.setOnClickListener(this);
		
		ibtnTaz = (ImageButton) findViewById(R.id.ibtnTaz);
		ibtnTaz.setOnClickListener(this);
		
		ibtnMegaro = (ImageButton) findViewById(R.id.ibtnMegaro);
		ibtnMegaro.setOnClickListener(this);
		
		ibtnKouzina = (ImageButton) findViewById(R.id.ibtnKouzina);
		ibtnKouzina.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		//boolean katastasi = Settings.loadSettings(getApplicationContext());

		if (v.getId() == R.id.ibtnEvris) {
			
			/* na paei stin banList meta
			if (katastasi == true) {
				ibEvris.setImageResource(R.drawable.ban);
				Settings.saveSettings("pressed", false, getApplicationContext());
			} else if(katastasi==false){
				ibEvris.setImageResource(R.drawable.tick);
				Settings.saveSettings("pressed", true, getApplicationContext());
			} */
				
			createPopup(v);
			array_tilefona = R.array.Til_Evrys;
			menu = new int [] {R.drawable.evris1,R.drawable.evris2,R.drawable.evris3,
					 R.drawable.evris4,R.drawable.evris5,R.drawable.evris6};
		}
		if (v.getId() == R.id.ibtnFame) {
			createPopup(v);
			array_tilefona = R.array.Til_Fame;
			menu = new int [] {R.drawable.fame1,R.drawable.fame2,R.drawable.fame3}; 
			
		}
		if (v.getId() == R.id.ibtnKoutala) {
			createPopup(v);
			array_tilefona = R.array.Til_Koutala;
			menu = new int [] {R.drawable.koutala1,R.drawable.koutala2,R.drawable.koutala3,
					 R.drawable.koutala4,R.drawable.koutala5,R.drawable.koutala6,R.drawable.koutala7}; 
		}
		if (v.getId() == R.id.ibtnGiro) {
			createPopup(v);
			array_tilefona = R.array.Til_Giro;
			menu = new int [] {R.drawable.giro1,R.drawable.giro2,R.drawable.giro3,
					 R.drawable.giro4,R.drawable.giro5,R.drawable.giro6};
		}
		if (v.getId() == R.id.ibtnNostos) {
			createPopup(v);
			array_tilefona = R.array.Til_Nostos;
			menu = new int [] {R.drawable.nostos1,R.drawable.nostos2,R.drawable.nostos3,
					 R.drawable.nostos4,R.drawable.nostos5,R.drawable.nostos6};
		}
		if (v.getId() == R.id.ibtnTaz) {
			createPopup(v);
			array_tilefona = R.array.Til_Taz;
			menu = new int [] {R.drawable.tazmaniac1,R.drawable.tazmaniac2};
		}
		if (v.getId() == R.id.ibtnMegaro) {
			createPopup(v);
			array_tilefona = R.array.Til_Megaro;
			menu = new int [] {R.drawable.megaro1,R.drawable.megaro2,R.drawable.megaro3,
					 R.drawable.megaro4,R.drawable.megaro5,R.drawable.megaro6};
		}
		if (v.getId() == R.id.ibtnKouzina) {
			createPopup(v);
			array_tilefona = R.array.Til_Kouzina;
			menu = new int [] {R.drawable.kouzmamas1,R.drawable.kouzmamas2,R.drawable.kouzmamas3,
					 R.drawable.kouzmamas4,R.drawable.kouzmamas5};
		}

	}
	
	
	//popup menu
	public void createPopup (View v) {
	    PopupMenu popup = new PopupMenu(this, v);
	    MenuInflater inflater = popup.getMenuInflater();
	    inflater.inflate(R.menu.estiatoria_popup, popup.getMenu());
	    popup.setOnMenuItemClickListener(this);
	    popup.show();
	}
	
	@Override
	public boolean onMenuItemClick(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.call:
	            //...
	        	
	        	createCallDialog();
	        	
	        case R.id.ban:
	            //...
	        	return true;
	        case R.id.menu:
	            //...
	        	startActivity(new Intent("com.tardis.ordersamos.CurlActivity"));
	        	CurlActivity.images = menu ;
	        	
	        	
	        	return true;
	        default:
	        	return false;
	        
	    }
	}

	//create dialog
	public void createCallDialog(){
		new AlertDialog.Builder(this)
	    .setTitle("Call options")
        .setItems(array_tilefona, new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
            	   Resources res =  getResources();
            	   String string[] = res.getStringArray(array_tilefona);
            	   String ari8mos[] = string[which].split(":");
            	   callNumber(ari8mos[1]);
         }
         })
	     .show();
	}
	
	
	//call 
	public void callNumber(String n){
		Intent iCall = new Intent(Intent.ACTION_DIAL);
   	 	String number = "tel:" + n;
   	 	iCall.setData(Uri.parse(number));
   	 	startActivity( iCall ) ;
	}

}
