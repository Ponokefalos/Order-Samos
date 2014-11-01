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
import android.text.format.Time;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

public class EstiatoriaPopup extends Activity implements OnMenuItemClickListener{

	protected int [] menu;
	protected int array_tilefona;
	protected int button_id;
	protected int text_id;
	protected int isbanned;
		
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
	    int itemId = item.getItemId();
		if (itemId == R.id.call) {
			//...
			createCallDialog();
			return true;
		} else if (itemId == R.id.ban) {
			//...
			//e3afanizi to koumpi
			View b = findViewById(button_id);
			b.setVisibility(View.GONE);
			View t = findViewById(text_id);
			t.setVisibility(View.GONE);
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
				checkbuttonid = "SweetnSalty";
			}
			//8eti tin timi tu sigkekrimenu checkbutton se banned = true
			SharedPreferences pref =PreferenceManager.getDefaultSharedPreferences(getBaseContext());
			Editor edit = pref.edit();
			edit.putBoolean(checkbuttonid, true);
			edit.commit();
			return true;
		} else if (itemId == R.id.menu) {
			//...
			startActivity(new Intent("com.tardis.ordersamos.CurlActivity"));
			CurlActivity.images = menu ;
			return true;
		} else {
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
			
			checkIfOpen();
			
		}
		public void checkIfOpen(){
			//set now
			Time now = new Time();
			now.setToNow();
			
			Time ora1 = new Time();
			ora1.setToNow();
			
			Time ora2 = new Time();
			ora2.setToNow();
			
			Time mera = new Time();
			mera.setToNow();
			
			if (array_tilefona == R.array.Til_Evrys){
				//apo
				ora1.hour = 13;
				//mexri
				//nextday
				
				ora2.hour = 1;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				
				mera.weekDay = 1;//deftera
			}
			else if (array_tilefona == R.array.Til_Fame){
				//apo
				
				ora1.hour = 12;
				//mexri
				//nextday
				
				ora2.hour = 1;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_Giro){
				//apo
				
				ora1.hour = 12;
				//mexri
				//nextday
				
				ora2.hour = 23;
				ora2.minute = 30;
				
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_Koutala){
				//apo
				
				ora1.hour = 13;
				//mexri
				//nextday
				
				ora2.hour = 0;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_Kouzina){
				//apo
				
				ora1.hour = 12;
				//mexri
				//nextday
				
				ora2.hour = 0;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_Megaro){
				//apo
				
				ora1.hour = 13;
				//mexri
				//nextday
				
				ora2.hour = 0;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_Nostos){
				//apo
				
				ora1.hour = 14;
				//mexri
				//nextday
				
				ora2.hour = 0;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_SweetnSalty){
				//apo
				
				ora1.hour = 16;
				//mexri
				//nextday
				
				ora2.hour = 5;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_Taz){
				//apo
				
				ora1.hour = 8;
				//mexri
				//nextday
				
				ora2.hour = 0;
				ora2 = allagi_meras(ora2);
				//mera pu ine klista
				mera.weekDay = 7;
			}
			else if (array_tilefona == R.array.Til_Vakxos){
				//apo
				
				ora1.hour = 12;
				//mexri				
				
				ora2.hour = 23;
				//mera pu ine klista
				mera.weekDay = 7;
			}
			
			
			
			
			
			//emfanizi toast an ine klisto to estiatorio
			if (Time.compare(now,ora1)<0 || Time.compare(now,ora2)>0 ||now.weekDay==mera.weekDay){
				Toast.makeText(getBaseContext(), "To estiatorio einai kleisto", Toast.LENGTH_LONG).show();
			}
			
		}
		
		//call number
		public void callNumber(String n){
			Intent iCall = new Intent(Intent.ACTION_DIAL);
	   	 	String number = "tel:" + n;
	   	 	iCall.setData(Uri.parse(number));
	   	 	startActivity( iCall ) ;
		}
		
		public Time allagi_meras (Time t){
			if (t.monthDay+1 > t.getActualMaximum(Time.MONTH_DAY)){
				t.monthDay = 1;
				//minas++
				if (t.month+1 > t.getActualMaximum(Time.MONTH)){
					t.month = 1;
					t.year++;
				}else {
					t.month ++;
				}
			}else{
				t.monthDay++;
			}
			return t;
		}
}
