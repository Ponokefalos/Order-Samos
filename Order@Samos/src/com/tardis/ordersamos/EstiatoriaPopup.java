package com.tardis.ordersamos;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class EstiatoriaPopup extends Activity implements OnMenuItemClickListener{

	protected int [] menu;
	protected int array_tilefona;
	protected int button_id;
	protected int isbanned;
	//
	public void createPopup (View v) {
	    PopupMenu popup = new PopupMenu(this, v);
	    MenuInflater inflater = popup.getMenuInflater();
	    inflater.inflate(R.menu.estiatoria_popup, popup.getMenu());
	    popup.setOnMenuItemClickListener(this);
	    popup.show();
	}
	
	public void setMenu(int[] menu) {
		this.menu = menu;
	}

	public void setArray_tilefona(int array_tilefona) {
		this.array_tilefona = array_tilefona;
	}
	
	@Override
	public boolean onMenuItemClick(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.call:
	            //...
	        	createCallDialog();
	        case R.id.ban:
	            //...
	        	//e3afanizi to koumpi
	        	View b = findViewById(button_id);
	        	b.setVisibility(View.GONE);
	        	//vriski to check button tu estiatoriu sta preferences
	        	String checkbuttonid = null;
	        	
	        	if (button_id == R.id.ibtnEvris){
	        		checkbuttonid = "Evrys";
	        	}
	        	else if (button_id == R.id.ibtnFame){
	        		checkbuttonid = "Fame";
	        	}
	        	else if (button_id == R.id.ibtnKoutala){
	        		checkbuttonid = "Koutala";
	        	}
	        	else if (button_id == R.id.ibtnGiro){
	        		checkbuttonid = "Giro";
	        	}
	        	else if (button_id == R.id.ibtnNostos){
	        		checkbuttonid = "Nostos";
	        	}
	        	else if (button_id == R.id.ibtnMegaro){
	        		checkbuttonid = "Megaro";
	        	}
	        	else if (button_id == R.id.ibtnTaz){
	        		checkbuttonid = "Taz";
	        	}
	        	else if (button_id == R.id.ibtnKouzina){
	        		checkbuttonid = "Kouzina";
	        	}
	        	else if (button_id == R.id.ibtnVakxos){
	        		checkbuttonid = "Vakxos";
	        	}
	        	else if (button_id == R.id.ibtnSweet){
	        		checkbuttonid = "Sweet";
	        	}

	   
	        	
	        	//8eti tin timi tu sigkekrimenu checkbutton se banned = true
	        	SharedPreferences pref =PreferenceManager.getDefaultSharedPreferences(getBaseContext());
	        	Editor edit = pref.edit();
	        	edit.putBoolean(checkbuttonid, true);
	        	edit.commit();
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
		
		
		//call number
		public void callNumber(String n){
			Intent iCall = new Intent(Intent.ACTION_DIAL);
	   	 	String number = "tel:" + n;
	   	 	iCall.setData(Uri.parse(number));
	   	 	startActivity( iCall ) ;
		}
}
