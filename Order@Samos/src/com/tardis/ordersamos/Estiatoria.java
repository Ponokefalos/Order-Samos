package com.tardis.ordersamos;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;

public class Estiatoria extends EstiatoriaPopup implements OnClickListener, OnMenuItemClickListener{
	//Context context = getApplicationContext();
	ImageButton ibtnFame;
	ImageButton ibtnEvris;
	ImageButton ibtnKoutala;
	ImageButton ibtnGiro;
	ImageButton ibtnNostos;
	ImageButton ibtnTaz;
	ImageButton ibtnMegaro;
	ImageButton ibtnKouzina;
	ImageButton ibtnVakxos;
	ImageButton ibtnSweet;
	
	/*TextView tvEvrys;
	TextView tvFame;
	TextView tvVakxos;
	TextView tvKouzina;
	TextView tvSweet;
	TextView tvMegaro;
	TextView tvTaz;
	TextView tvKoutala;
	TextView tvGiro;
	TextView tvNostos;
	
	String titlosEvrys;
	String titlosFame;
	String titlosVakxos;
	String titlosKouzina;
	String titlosSweet;
	String titlosMegaro;
	String titlosTaz;
	String titlosKoutala;
	String titlosGiro;
	String titlosNostos;*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estiatoria);
		initialize ();	
		hideBanned();
		
		
	}
	
	
	public void initializeTextViews(){
		
		
	}

	private void hideBanned() {
		// TODO Auto-generated method stub
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
		
		if (chkEvrys){
			View b = findViewById(R.id.ibtnEvris);
			View c = findViewById(R.id.tvEstiatoriaEvrys);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkFame){
			View b = findViewById(R.id.ibtnFame);
			View c = findViewById(R.id.tvEstiatoriaFame);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkKoutala){
			View b = findViewById(R.id.ibtnKoutala);
			View c = findViewById(R.id.tvEstiatoriaKoutala);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkGiro){
			View b = findViewById(R.id.ibtnGiro);
			View c = findViewById(R.id.tvEstiatoriaGiro);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkNostos){
			View b = findViewById(R.id.ibtnNostos);
			View c = findViewById(R.id.tvEstiatoriaNostos);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkMegaro){
			View b = findViewById(R.id.ibtnMegaro);
			View c = findViewById(R.id.tvEstiatoriaMegaro);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkTaz){
			View b = findViewById(R.id.ibtnTaz);
			View c = findViewById(R.id.tvEstiatoriaTaz);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkKouzina){
			View b = findViewById(R.id.ibtnKouzina);
			View c = findViewById(R.id.tvEstiatoriaKouzina);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkVakxos){
			View b = findViewById(R.id.ibtnVakxos);
			View c = findViewById(R.id.tvEstiatoriaVakxos);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		if (chkSweetnSalty){
			View b = findViewById(R.id.ibtnSweet);
			View c = findViewById(R.id.tvEstiatoriaSweet);
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
		}
		
				
	}

	private  void initialize () {
		
		
		
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
		
		ibtnVakxos = (ImageButton) findViewById(R.id.ibtnVakxos);
		ibtnVakxos.setOnClickListener(this);
		
		ibtnSweet = (ImageButton) findViewById(R.id.ibtnSweet);
		ibtnSweet.setOnClickListener(this);
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
			button_id = R.id.ibtnEvris;
		}
		if (v.getId() == R.id.ibtnFame) {
			createPopup(v);
			array_tilefona = R.array.Til_Fame;
			menu = new int [] {R.drawable.fame1,R.drawable.fame2,R.drawable.fame3}; 
			button_id =  R.id.ibtnFame;
			
		}
		else if (v.getId() == R.id.ibtnKoutala) {
			createPopup(v);
			array_tilefona = R.array.Til_Koutala;
			menu = new int [] {R.drawable.koutala1,R.drawable.koutala2,R.drawable.koutala3,
					 R.drawable.koutala4,R.drawable.koutala5,R.drawable.koutala6,R.drawable.koutala7};
			button_id =  R.id.ibtnKoutala;
		}
		else if (v.getId() == R.id.ibtnGiro) {
			createPopup(v);
			array_tilefona = R.array.Til_Giro;
			menu = new int [] {R.drawable.giro1,R.drawable.giro2,R.drawable.giro3,
					 R.drawable.giro4,R.drawable.giro5,R.drawable.giro6};
			button_id =  R.id.ibtnGiro;
		}
		else if (v.getId() == R.id.ibtnNostos) {
			createPopup(v);
			array_tilefona = R.array.Til_Nostos;
			menu = new int [] {R.drawable.nostos1,R.drawable.nostos2,R.drawable.nostos3,
					 R.drawable.nostos4,R.drawable.nostos5,R.drawable.nostos6};
			button_id =  R.id.ibtnNostos;
		}
		else if (v.getId() == R.id.ibtnTaz) {
			createPopup(v);
			array_tilefona = R.array.Til_Taz;
			menu = new int [] {R.drawable.tazmaniac1,R.drawable.tazmaniac2};
			button_id =  R.id.ibtnTaz;
		}
		else if (v.getId() == R.id.ibtnMegaro) {
			createPopup(v);
			array_tilefona = R.array.Til_Megaro;
			menu = new int [] {R.drawable.megaro1,R.drawable.megaro2,R.drawable.megaro3,
					 R.drawable.megaro4,R.drawable.megaro5,R.drawable.megaro6};
			button_id =  R.id.ibtnMegaro;
		}
		else if (v.getId() == R.id.ibtnKouzina) {
			createPopup(v);
			array_tilefona = R.array.Til_Kouzina;
			menu = new int [] {R.drawable.kouzmamas1,R.drawable.kouzmamas2,R.drawable.kouzmamas3,
					 R.drawable.kouzmamas4,R.drawable.kouzmamas5};
			button_id =  R.id.ibtnKouzina;
		}
		else if (v.getId() == R.id.ibtnVakxos) {
			createPopup(v);
			array_tilefona = R.array.Til_Vakxos;
			menu = new int [] {R.drawable.vakxos1,R.drawable.vakxos2,R.drawable.vakxos3,
					 R.drawable.vakxos4,R.drawable.vakxos5};
			button_id =  R.id.ibtnVakxos;
		}
		else if (v.getId() == R.id.ibtnSweet) {
			createPopup(v);
			array_tilefona = R.array.Til_SweetnSalty;
			menu = new int [] {R.drawable.sweet1,R.drawable.sweet2,R.drawable.sweet3,
					 R.drawable.sweet4,R.drawable.sweet5,R.drawable.sweet6};
			button_id =  R.id.ibtnSweet;
		}

	}
}
