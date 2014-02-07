package com.tardis.ordersamos;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
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
import android.widget.Toast;

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
			array_tilefona = R.array.Data_Evrys;
		}
		if (v.getId() == R.id.ibtnFame) {
			createPopup(v);
			
		}
		if (v.getId() == R.id.ibtnKoutala) {
			createPopup(v);
		}
		if (v.getId() == R.id.ibtnGiro) {
			createPopup(v);
		}
		if (v.getId() == R.id.ibtnNostos) {
			createPopup(v);
		}
		if (v.getId() == R.id.ibtnTaz) {
			createPopup(v);
		}
		if (v.getId() == R.id.ibtnMegaro) {
			createPopup(v);
		}
		if (v.getId() == R.id.ibtnKouzina) {
			createPopup(v);
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
	        	
	        	
	        	/*Intent callWhatsUp = new Intent(Intent.ACTION_DIAL);
	        	 String numWhatsUp = "tel:" + tilefona[0];
	        	 callWhatsUp.setData(Uri.parse(numWhatsUp));
	        	  startActivity( callWhatsUp ) ;
	        	return true;*/
	        /*case R.id.vodafone:
	            //...
	        	Intent callVodafone = new Intent(Intent.ACTION_DIAL);
	        	 String numVodafone = "tel:" + tilefona[1];
	        	 callVodafone.setData(Uri.parse(numVodafone));
	        	  startActivity( callVodafone ) ;
	        	return true;
	        case R.id.wind:
	            //...
	        	Intent callWind = new Intent(Intent.ACTION_DIAL);
	        	 String numWind = "tel:" + tilefona[2];
	        	 callWind.setData(Uri.parse(numWind));
	        	  startActivity( callWind ) ;
	        	return true;*/
	        case R.id.ban:
	            //...
	        	return true;
	        case R.id.menu:
	            //...
	        	return true;
	        default:
	        	return false;
	        
	    }
	}

	//create dialog
	public void createCallDialog(){
		new AlertDialog.Builder(this)
	    .setTitle("Delete entry")
        .setItems(array_tilefona, new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
            	   Resources res =  getResources();
            	   String tilefona[] = res.getStringArray(array_tilefona);
            	   callNumber(tilefona[which]);
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
