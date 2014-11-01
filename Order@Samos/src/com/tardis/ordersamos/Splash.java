package com.tardis.ordersamos;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		getActionBar().hide();
		Thread timer = new Thread(){
			   public void run(){
			    try{
			     //kathisterei gia 4 sec kai meta anoigei to main menu
			     sleep(6000);
			     
			    }catch (InterruptedException e){
			     e.printStackTrace();
			    }finally{
			     Intent openMainMenu = new Intent("com.tardis.ordersamos.MainMenu");
			     startActivity(openMainMenu);
			    }
			   }
			  };
			  timer.start();
	
	
	}


}
