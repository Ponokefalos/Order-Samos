package com.tardis.ordersamos;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class Settings {
	
	static public void saveSettings (String saveTarget,boolean savedValue, Context context){
		SharedPreferences pref =PreferenceManager.getDefaultSharedPreferences(context);
		Editor editor = pref.edit();
		editor.putBoolean(saveTarget, savedValue);
		editor.commit();
	}
	static public boolean loadSettings(Context context){
		SharedPreferences pref =PreferenceManager.getDefaultSharedPreferences(context);
		boolean epistrefomenoValue=pref.getBoolean("pressed",true);
		return epistrefomenoValue;
		
				
	}

}
