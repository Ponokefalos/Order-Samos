package com.tardis.ordersamos;

import java.util.ArrayList;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class RandomChoice extends EstiatoriaPopup implements OnClickListener {

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
		fagito= getResources().getString(R.string.random_fagito);
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
		ibRandBut.setOnClickListener(this);
		
		ibCall = (ImageButton) findViewById(R.id.ibtnCall);
		ibCall.setOnClickListener(this);

		// -----------------------------------------------------------------------------------------------
		
		
		//arxikopoiisi TextView pou provalei to tixaio fagito 
		tvProvalomeniTixaiEpilogi = (TextView)findViewById(R.id.tvProvalomeniTixaiaEpilogi);
		
		
		
		//----------------------------------------------------------------------------------------------------
		Resources res = getResources();

		//0-7
		taPantaOla.add(res.getStringArray(R.array.Bakxos_orektika));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_merides));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_burger));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_mageireuta));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_pites));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_salates));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_souvlista));
		taPantaOla.add(res.getStringArray(R.array.Bakxos_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Evrys_burger));//8-16
		taPantaOla.add(res.getStringArray(R.array.Evrys_omeletes));
		taPantaOla.add(res.getStringArray(R.array.Evrys_orektika));
		taPantaOla.add(res.getStringArray(R.array.Evrys_piata));
		taPantaOla.add(res.getStringArray(R.array.Evrys_pites));
		taPantaOla.add(res.getStringArray(R.array.Evrys_pitses));
		taPantaOla.add(res.getStringArray(R.array.Evrys_salates));
		taPantaOla.add(res.getStringArray(R.array.Evrys_submarine_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Evrys_zumarika));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_burger));//17-23
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_club_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_hot_dog));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_krepes_almures));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_krepes_glukes));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_merides));
		taPantaOla.add(res.getStringArray(R.array.Sweet_salty_salates));
		taPantaOla.add(res.getStringArray(R.array.Koutala_club_sandwich));//24-32
		taPantaOla.add(res.getStringArray(R.array.Koutala_mezedes));
		taPantaOla.add(res.getStringArray(R.array.Koutala_orektika));
		taPantaOla.add(res.getStringArray(R.array.Koutala_pizza));
		taPantaOla.add(res.getStringArray(R.array.Koutala_salates));
		taPantaOla.add(res.getStringArray(R.array.Koutala_snitsel));
		taPantaOla.add(res.getStringArray(R.array.Koutala_souvlaki));
		taPantaOla.add(res.getStringArray(R.array.Koutala_yarika));
		taPantaOla.add(res.getStringArray(R.array.Koutala_zumarika));
		taPantaOla.add(res.getStringArray(R.array.Kouzina_ths_mamas_aloifes));//33-45
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
		taPantaOla.add(res.getStringArray(R.array.Megaro_pitses));//46-48
		taPantaOla.add(res.getStringArray(R.array.Megaro_salates));
		taPantaOla.add(res.getStringArray(R.array.Megaro_zumarika));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_burger));//49-55
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_faghta));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_krepes_almures));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_krepes_glukes));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_prwina));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Tazmaniac_steak_sandwich));
		taPantaOla.add(res.getStringArray(R.array.Fame_burger));//56-70
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
		taPantaOla.add(res.getStringArray(R.array.Nostos_mageireuta));//71-79
		taPantaOla.add(res.getStringArray(R.array.Nostos_omeletes));
		taPantaOla.add(res.getStringArray(R.array.Nostos_orektika));
		taPantaOla.add(res.getStringArray(R.array.Nostos_peinirli));
		taPantaOla.add(res.getStringArray(R.array.Nostos_pitses));
		taPantaOla.add(res.getStringArray(R.array.Nostos_salates));
		taPantaOla.add(res.getStringArray(R.array.Nostos_tortelini));
		taPantaOla.add(res.getStringArray(R.array.Nostos_yhta));
		taPantaOla.add(res.getStringArray(R.array.Nostos_zumarika));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_merides));//80-85
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_orektika));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_pites));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_poikilies));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_salates));
		taPantaOla.add(res.getStringArray(R.array.Guro_Guro_oloi_souvles));

		
	}

	@Override
	public void onClick(View v) {
		int randoma = 0;

		

		if (v.getId() == R.id.ibtnRandom) {

			randoma = (int) (Math.random() * (85) + 1);
			String[] epilegmenospinakas = taPantaOla.get(randoma);
			int x = epilegmenospinakas.length;

			int randomb = (int) (Math.random() * (x) + 1);
			emfanisi = epilegmenospinakas[randomb-1];
			//diaxorismos onomatos-timis
							
					try {
						String[] d = emfanisi.split("\\$");
						emfanisi = d[0] + "\t Τιμή €" + d[1];
					} catch (Exception e) {
						Toast.makeText(getBaseContext(), "error", Toast.LENGTH_SHORT).show();
					}
				
				
					
				
			
			tvProvalomeniTixaiEpilogi.setText(emfanisi);
			
			//emfanisi onomatos estiatoriu
			if (randoma>=0 && randoma<=7){
				tvOnomaMagaziou.setText("Βάκχος");
				setArray_tilefona(R.array.Til_Vakxos);
			}
			else if (randoma>=8 && randoma<=16){
				tvOnomaMagaziou.setText("Evrys");
				setArray_tilefona(R.array.Til_Evrys);
			}
			else if (randoma>=17 && randoma<=23){
				tvOnomaMagaziou.setText("Sweet & Salty");
				setArray_tilefona(R.array.Til_SweetnSalty);
			}
			else if (randoma>=24 && randoma<=32){
				tvOnomaMagaziou.setText("Κουτάλα του μάγειρα");
				setArray_tilefona(R.array.Til_Koutala);
			}
			else if (randoma>=33 && randoma<=45){
				tvOnomaMagaziou.setText("Κουζίνα της μαμμάς");
				setArray_tilefona(R.array.Til_Kouzina);
			}
			else if (randoma>=46 && randoma<=48){
				tvOnomaMagaziou.setText("Μέγαρο");
				setArray_tilefona(R.array.Til_Megaro);
			}
			else if (randoma>=49 && randoma<=55){
				tvOnomaMagaziou.setText("Ταζ");
				setArray_tilefona(R.array.Til_Taz);
			}
			else if (randoma>=56 && randoma<=70){
				tvOnomaMagaziou.setText("Fame");
				setArray_tilefona(R.array.Til_Fame);
			}
			else if (randoma>=71 && randoma<=79){
				tvOnomaMagaziou.setText("Nostos");
				setArray_tilefona(R.array.Til_Nostos);
			}
			else if (randoma>=80 && randoma<=85){
				tvOnomaMagaziou.setText("Γύρο Γύρο");
				setArray_tilefona(R.array.Til_Giro);
			}
			
			
		} else if (v.getId() == R.id.ibtnCall) {
			createCallDialog();
		}

	}

}
