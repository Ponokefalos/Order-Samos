package com.tardis.ordersamos;

import java.util.ArrayList;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;


public class RandomChoice extends Activity implements OnClickListener {

	String title, magazi, fagito;
	TextView tvTitlos, tvOnomaMagaziou, tvFagito,tvProvalomeniTixaiEpilogi;
	ImageButton ibRandBut, ibCall;
	ArrayList<String[]> taPantaOla = new ArrayList<String[]>();
	String emfanisi;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_random_choice);
		// pairnw ta dedomena gia kathe var antistoixa ap to string.xml
		title = getResources().getString(R.string.title_Random_Choice);
		magazi = getResources().getString(R.string.random_magazi);
		fagito = getResources().getString(R.string.random_fagito);

		// arxikopoiw ta textviews antistoixa me to xml layout id
		tvTitlos = (TextView) findViewById(R.id.tvTitlosProsforas);
		tvOnomaMagaziou = (TextView) findViewById(R.id.tvOnomaMagaziou);
		tvFagito = (TextView) findViewById(R.id.tvFagito);

		// allazw to periexomeno twn textviews me ta periexomena twn metavlitwn
		// pou exw sto string.xml kai dilwsa para panw
		tvTitlos.setText(title);
		tvOnomaMagaziou.setText(magazi);
		tvFagito.setText(fagito);
		// ----------------------------------------------------------------------------------------------

		ibRandBut = (ImageButton) findViewById(R.id.ibtnRandom);
		ibCall = (ImageButton) findViewById(R.id.ibtnCall);
		ibRandBut.setOnClickListener(this);
		ibCall.setOnClickListener(this);

		// -----------------------------------------------------------------------------------------------
		
		
		//arxikopoiisi TextView pou provalei to tixaio fagito 
		tvProvalomeniTixaiEpilogi = (TextView)findViewById(R.id.tvProvalomeniTixaiaEpilogi);
		
		
		
		//----------------------------------------------------------------------------------------------------
		Resources res = getResources();

		taPantaOla.add(res.getStringArray(R.array.Bakxos_orektika));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_merides));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_burger));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_mageireuta));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_pites));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_salates));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_souvlista));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_sandwich));

		taPantaOla.add(res.getStringArray(R.array.Evrys_burger));
		taPantaOla.add(res.getStringArray(R.array.Evrys_omeletes));
		taPantaOla.add(res.getStringArray(R.array.Evrys_orektika));
		taPantaOla.add(res.getStringArray(R.array.Evrys_piata));
		taPantaOla.add(res.getStringArray(R.array.Evrys_pites));
		taPantaOla.add(res.getStringArray(R.array.Evrys_pitses));
		taPantaOla.add(res.getStringArray(R.array.Evrys_salates));
		taPantaOla.add(res.getStringArray(R.array.Evrys_submarine_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Evrys_zumarika));

		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_burger));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_club_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_hot_dog));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_krepes_almures));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_krepes_glukes));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_merides));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_salates));

		taPantaOla.add(res.getStringArray(R.array.Koutala_club_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Koutala_mezedes));
		taPantaOla.add(res.getStringArray(R.array.Koutala_orektika));
		taPantaOla.add(res.getStringArray(R.array.Koutala_pizza));
		taPantaOla.add(res.getStringArray(R.array.Koutala_salates));
		taPantaOla.add(res.getStringArray(R.array.Koutala_snitsel));
		taPantaOla.add(res.getStringArray(R.array.Koutala_souvlaki));
		taPantaOla.add(res.getStringArray(R.array.Koutala_yarika));
		taPantaOla.add(res.getStringArray(R.array.Koutala_zumarika));

		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_aloifes));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_burger));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_kupriakes_pites));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_mageireuta));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_orektika));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_pites));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_pitses));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_salates));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_souvles));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_thganies));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_yhta));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_ywmakia));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_zumarika));

		taPantaOla.add(res.getStringArray(R.array.Megaro_pitses));
		taPantaOla.add(res.getStringArray(R.array.Megaro_salates));
		taPantaOla.add(res.getStringArray(R.array.Megaro_zumarika));

		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_burger));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_faghta));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_krepes_almures));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_krepes_glukes));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_prwina));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_steak_sandwich));

		taPantaOla.add(res.getStringArray(R.array.Fame_burger));
		taPantaOla.add(res.getStringArray(R.array.Fame_krepes_almures));
		taPantaOla.add(res.getStringArray(R.array.Fame_krepes_glukes));
		taPantaOla.add(res.getStringArray(R.array.Fame_merides));
		taPantaOla.add(res.getStringArray(R.array.Fame_omeletes));
		taPantaOla.add(res.getStringArray(R.array.Fame_orektika));
		taPantaOla.add(res.getStringArray(R.array.Fame_pites));
		taPantaOla.add(res.getStringArray(R.array.Fame_pitses));
		taPantaOla.add(res.getStringArray(R.array.Fame_salates));
		taPantaOla.add(res.getStringArray(R.array.Fame_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Fame_spesialite));
		taPantaOla.add(res.getStringArray(R.array.Fame_vafles));
		taPantaOla.add(res.getStringArray(R.array.Fame_xwris_pita));
		taPantaOla.add(res.getStringArray(R.array.Fame_yhta));
		taPantaOla.add(res.getStringArray(R.array.Fame_zumarika));

		taPantaOla.add(res.getStringArray(R.array.Nostos_mageireuta));
		taPantaOla.add(res.getStringArray(R.array.Nostos_omeletes));
		taPantaOla.add(res.getStringArray(R.array.Nostos_orektika));
		taPantaOla.add(res.getStringArray(R.array.Nostos_peinirli));
		taPantaOla.add(res.getStringArray(R.array.Nostos_pitses));
		taPantaOla.add(res.getStringArray(R.array.Nostos_salates));
		taPantaOla.add(res.getStringArray(R.array.Nostos_tortelini));
		taPantaOla.add(res.getStringArray(R.array.Nostos_yhta));
		taPantaOla.add(res.getStringArray(R.array.Nostos_zumarika));

		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_merides));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_orektika));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_pites));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_poikilies));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_salates));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_souvles));

		
	}

	@Override
	public void onClick(View v) {
		

		

		if (v.getId() == R.id.ibtnRandom) {

			int randoma = (int) (Math.random() * (85) + 1);
			String[] epilegmenospinakas = taPantaOla.get(randoma);
			int x = epilegmenospinakas.length;

			int randomb = (int) (Math.random() * (x) + 1);
			emfanisi = epilegmenospinakas[randomb-1];
			tvProvalomeniTixaiEpilogi.setText(emfanisi);
			
		} else if (v.getId() == R.id.ibtnCall) {

		}

	}

}
