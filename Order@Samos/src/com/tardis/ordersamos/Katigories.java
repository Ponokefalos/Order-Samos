package com.tardis.ordersamos;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

public class Katigories extends Activity{

	AutoCompleteTextView actv;
	ListView listview;
	ArrayList<String> list;
	ArrayAdapter<String> list_view_adapter;//ti tha deiksei mesa sto list_view
	ArrayAdapter<String> auto_adapter;//adapter tou auto-complete... ti tha deiksei mes sto auto-complete
	String search;//einai oti yparxei mesa sto auto-complete kai einai grammeno
	ArrayList<String> titles;//titloi/separators sto listview
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_katigories);
		
		init();//kaleite
				
	}
	
	//initialize variables
	
	private void init(){
				
		//auto complete text view
		actv = (AutoCompleteTextView) findViewById(R.id.atSearch);
		String[] suggestions = {"souvlaki","burger","salates","pites","pitses","sandwich","mageireuta","merides","zumarika"};//mporoume na valoume osa key theloume
		
		listview = (ListView) findViewById(R.id.lvKatigories);
		list = new ArrayList<String>();//arraylist gia na to valei sto adapter tou list view
				
		
		
		//autocomplete
		auto_adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, suggestions);
		actv.setAdapter(auto_adapter);
		
		TextWatcher inputTextWatcher = new TextWatcher() {
		    public void afterTextChanged(Editable s) { 
		        		
		    }
		    public void beforeTextChanged(CharSequence s, int start, int count, int after){
		    }
		    public void onTextChanged(CharSequence s, int start, int before, int count) {
		    	//otan allazi to keimeno kani search

		    	titles = new ArrayList<String>();
		    	search= s.toString();
		    	list = convertArrayList(getAllStrings(search));
				//sort list simfona me tin timi
		    	Collections.sort(list, new Comparator<String>(){// h methodos pairnei mia lista kai ena ena comparator
		    		//kanei override tin methodo compare
					@Override
					public int compare(String s1, String s2) {
						// TODO Auto-generated method stub
						String[] timi1;
						String[] timi2;
						int i = 0;
						try {
							//kanei split molis vrei dolario se 2 metavlites
							timi1 = s1.split("$");
							timi2 = s2.split("$");
							i = timi1[1].compareTo(timi2[1]);//sigrisi 2 timwn analoga pio einai pio megalo
															//kai epistrifei pio einai pio megalo stin methodo compare
						} catch (Exception e) {
							// TODO Auto-generated catch block
							
						}
						
						return i;
					}
		    		
		    	});
		    	//morfopiisi listas se onoma + "\t Τιμή €" + timi
		    	
		    	for (int i=0; i<list.size(); i++){
		    		
		    			
						try {
							String[] sexy = list.get(i).split("\\$");
							list.set(i, sexy[0] + "\t Τιμή €" + sexy[1]);
						} catch (Exception e) {
							
						}
		    		
		    	}
		    	
				//display
		    	//arxikopoiw ton adapter
				list_view_adapter = new ArrayAdapter<String>(getBaseContext(),
						R.layout.customlistviewitem, list);//simple_list_item_1 prokathorismenh emfasi tou android
				listview.setAdapter(list_view_adapter);
				list = new ArrayList<String>();
		    }
		};
		actv.addTextChangedListener(inputTextWatcher);//einai ena listener sto auto-complete analoga me tin epilogi pou kaname
		
		
	}
	

	//get all strings
			private ArrayList<String[]> getAllStrings(String search){
				
				ArrayList<String[]> list = new ArrayList<String[]>();
			
				for (Field field : R.array.class.getDeclaredFields())
				{
				  if (Modifier.isStatic(field.getModifiers()) && !Modifier.isPrivate(field.getModifiers()) && field.getType().equals(int.class))
				  {
				    try//mpainei se try epeidi mporei na min vrei tpt 
				    {
				    	
				    			String name ;
				    	
				    	  		name = field.getName();
				    	  		 
				    	  		if (!name.startsWith("Til_") && name.contains(search)){
				    	  			
				    	  			//check for banned
				    	  			SharedPreferences pref =PreferenceManager.getDefaultSharedPreferences(getBaseContext());
				    	  			
				    	  			boolean chkEvrys = pref.getBoolean("Evrys", false);
				    	  			boolean chkFame = pref.getBoolean("Fame", false);
				    	  			boolean chkKoutala = pref.getBoolean("Koutala", false);
				    	  			boolean chkGiro = pref.getBoolean("Giro", false);
				    	  			boolean chkNostos = pref.getBoolean("Nostos", false);
				    	  			boolean chkMegaro = pref.getBoolean("Megaro", false);
				    	  			boolean chkTaz = pref.getBoolean("Taz", false);
				    	  			boolean chkKouzina = pref.getBoolean("Kouzina", false);
				    	  			boolean chkVakxos = pref.getBoolean("Vakxos", false);
				    	  			boolean chkSweetnSalty = pref.getBoolean("SweetnSalty", false);
				    	  			
				    	  			if (chkEvrys == true && name.contains("Evrys")){}
				    	  			else if (chkFame == true && name.contains("Fame")){}
				    	  			else if (chkKoutala == true && name.contains("Koutala")){}
				    	  			else if (chkGiro == true && name.contains("Guro_Guro")){}
				    	  			else if (chkNostos == true && name.contains("Nostos")){}
				    	  			else if (chkMegaro == true && name.contains("Megaro")){}
				    	  			else if (chkTaz == true && name.contains("Tazmaniac")){}
				    	  			else if (chkKouzina == true && name.contains("Kouzina")){}
				    	  			else if (chkVakxos == true && name.contains("Bakxos")){}
				    	  			else if (chkSweetnSalty == true && name.contains("Sweet_salty")){}
				    	  			else {
						    	  			int id = field.getInt(null);
									        // add to list
									        String[] array =  getResources().getStringArray(id);				        
									        list.add(array);
									        //get title
									        titles.add(field.getName());
				    	  			}
				    	  		}
				    	  	}
						        
				        
				      
				     catch (IllegalArgumentException e)
				    {
				      // ignore
				    } catch (IllegalAccessException e)
				    {
				      // ignore
				    }
				  }
				}
				return list;
			}		
			
	//convert list from string-array se simple string
			private ArrayList<String> convertArrayList (ArrayList<String[]> oldlist){
				
				ArrayList<String> newlist = new ArrayList<String>();
				String [] olindex;
				
				for (int i=0; i<oldlist.size();i++){
					olindex = oldlist.get(i);
					//set title/separator
					newlist.add(titles.get(i));
					for (String j: olindex){
						newlist.add(j);
					}
				}
				return newlist;
			}

			
			
}
