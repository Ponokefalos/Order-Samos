package com.tardis.ordersamos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;

public class MainMenu extends Activity implements OnClickListener {
	//dilwsi antikeimenwn twn antistoixwn ImageButtons sto xml
	ImageButton ibInfo, ibEstiatoria , ibKatigories, ibBanList, ibRandomChoice, ibProsfores, ibRatings;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	
		getActionBar().hide();
		
	

}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}
