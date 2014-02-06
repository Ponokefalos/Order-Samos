package com.tardis.ordersamos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Estiatoria extends Activity implements OnClickListener {
	//Context context = getApplicationContext();
	ImageButton ibEvris;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estiatoria);
		ibEvris = (ImageButton) findViewById(R.id.ibtnEvris);
		ibEvris.setOnClickListener(this);
		// AlertDialog.Builder builder = AlertDialog.Builder(this);
		//2comment
		
	}

	//

	@Override
	public void onClick(View v) {
		boolean katastasi = Settings.loadSettings(getApplicationContext());

		if (v.getId() == R.id.ibtnEvris) {
			// na paei stin banList meta
			if (katastasi == true) {
				ibEvris.setImageResource(R.drawable.ban);
				Settings.saveSettings("pressed", false, getApplicationContext());
			} else if(katastasi==false){
				ibEvris.setImageResource(R.drawable.tick);
				Settings.saveSettings("pressed", true, getApplicationContext());
			}
		}

	}

}
