package com.tardis.ordersamos;

import android.app.Activity;
import android.content.Intent;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estiatoria);
		initialize ();
		
		
		// AlertDialog.Builder builder = AlertDialog.Builder(this);
		
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
	        case R.id.whatsup:
	            //...
	        	Intent callEvrysWhatsUp = new Intent(Intent.ACTION_DIAL);
	        	 String numEvrysWhatsUp = "tel:" + "6981898054";
	        	 callEvrysWhatsUp.setData(Uri.parse(numEvrysWhatsUp));
	        	  startActivity( callEvrysWhatsUp ) ;
	        	return true;
	        case R.id.vodafone:
	            //...
	        	Intent callEvrysVodafone = new Intent(Intent.ACTION_DIAL);
	        	 String numEvrysVodafone = "tel:" + "6944416858";
	        	 callEvrysVodafone.setData(Uri.parse(numEvrysVodafone));
	        	  startActivity( callEvrysVodafone ) ;
	        	return true;
	        case R.id.wind:
	            //...
	        	Intent callEvrysWind = new Intent(Intent.ACTION_DIAL);
	        	 String numEvrysWind = "tel:" + "6938775152";
	        	 callEvrysWind.setData(Uri.parse(numEvrysWind));
	        	  startActivity( callEvrysWind ) ;
	        	return true;
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
	


}
