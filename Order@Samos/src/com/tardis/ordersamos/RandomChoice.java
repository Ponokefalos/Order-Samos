package com.tardis.ordersamos;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class RandomChoice extends Activity {

	String title,magazi,fagito;
	TextView tvTitlos,tvOnomaMagaziou,tvFagito;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_random_choice);
		//pairnw ta dedomena gia kathe var antistoixa ap to string.xml
		title= getResources().getString(R.string.title_Random_Choice);
		magazi= getResources().getString(R.string.random_magazi);
		fagito=getResources().getString(R.string.random_fagito);
		
		//arxikopoiw ta textviews antistoixa me to xml layout id
		tvTitlos=(TextView)findViewById(R.id.tvTitlosProsforas);
		tvOnomaMagaziou=(TextView)findViewById(R.id.tvOnomaMagaziou);
		tvFagito=(TextView)findViewById(R.id.tvFagito);
		
		//allazw to periexomeno twn textviews me ta periexomena twn metavlitwn pou exw sto string.xml kai dilwsa para panw
		tvTitlos.setText(title);
		tvOnomaMagaziou.setText(magazi);
		tvFagito.setText(fagito);
		
		//-----------------------------------------------------------------------------------------------
		
		Resources res = getResources();
		//dimiourgeia tis Listas gia ola ta estiatoria
		ArrayList<String[]> bakxos=new ArrayList<String[]>();
		ArrayList<String[]> evrys=new ArrayList<String[]>();
		ArrayList<String[]> sweet=new ArrayList<String[]>();
		ArrayList<String[]> koutala=new ArrayList<String[]>();
		ArrayList<String[]> kouzina=new ArrayList<String[]>();
		ArrayList<String[]> megaro=new ArrayList<String[]>();
		ArrayList<String[]> taz=new ArrayList<String[]>();
		ArrayList<String[]> fame=new ArrayList<String[]>();
		ArrayList<String[]> giro=new ArrayList<String[]>();
		ArrayList<String[]> nostos=new ArrayList<String[]>();
		
		 ArrayList<ArrayList> epiloges = new ArrayList<ArrayList>();
		
		bakxos.add(res.getStringArray(R.array.Bakxos_orektika));
		bakxos.add(res.getStringArray(R.array.Bakxos_merides));
		bakxos.add(res.getStringArray(R.array.Bakxos_burger));
		bakxos.add(res.getStringArray(R.array.Bakxos_mageireuta));
		bakxos.add(res.getStringArray(R.array.Bakxos_pites));
		bakxos.add(res.getStringArray(R.array.Bakxos_salates));
		bakxos.add(res.getStringArray(R.array.Bakxos_souvlista));
		bakxos.add(res.getStringArray(R.array.Bakxos_sandwich));
		
		evrys.add(res.getStringArray(R.array.Evrys_burger));
		evrys.add(res.getStringArray(R.array.Evrys_omeletes));
		evrys.add(res.getStringArray(R.array.Evrys_orektika));
		evrys.add(res.getStringArray(R.array.Evrys_piata));
		evrys.add(res.getStringArray(R.array.Evrys_pites));
		evrys.add(res.getStringArray(R.array.Evrys_pitses));
		evrys.add(res.getStringArray(R.array.Evrys_salates));
		evrys.add(res.getStringArray(R.array.Evrys_submarine_sandwich));
		evrys.add(res.getStringArray(R.array.Evrys_zumarika));
		
		sweet.add(res.getStringArray(R.array.Sweet_salty_burger));
		sweet.add(res.getStringArray(R.array.Sweet_salty_club_sandwich));
		sweet.add(res.getStringArray(R.array.Sweet_salty_hot_dog));
		sweet.add(res.getStringArray(R.array.Sweet_salty_krepes_almures));
		sweet.add(res.getStringArray(R.array.Sweet_salty_krepes_glukes));
		sweet.add(res.getStringArray(R.array.Sweet_salty_merides));
		sweet.add(res.getStringArray(R.array.Sweet_salty_salates));
		
		koutala.add(res.getStringArray(R.array.Koutala_club_sandwich));
		koutala.add(res.getStringArray(R.array.Koutala_mezedes));
		koutala.add(res.getStringArray(R.array.Koutala_orektika));
		koutala.add(res.getStringArray(R.array.Koutala_pizza));
		koutala.add(res.getStringArray(R.array.Koutala_salates));
		koutala.add(res.getStringArray(R.array.Koutala_snitsel));
		koutala.add(res.getStringArray(R.array.Koutala_souvlaki));
		koutala.add(res.getStringArray(R.array.Koutala_yarika));
		koutala.add(res.getStringArray(R.array.Koutala_zumarika));
		
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_aloifes));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_burger));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_kupriakes_pites));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_mageireuta));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_orektika));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_pites));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_pitses));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_salates));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_souvles));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_thganies));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_yhta));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_ywmakia));
		kouzina.add(res.getStringArray(R.array.Kouzina_ths_mamas_zumarika));
		
		megaro.add(res.getStringArray(R.array.Megaro_pitses));
		megaro.add(res.getStringArray(R.array.Megaro_salates));
		megaro.add(res.getStringArray(R.array.Megaro_zumarika));
		
		taz.add(res.getStringArray(R.array.Tazmaniac_burger));
		taz.add(res.getStringArray(R.array.Tazmaniac_faghta));
		taz.add(res.getStringArray(R.array.Tazmaniac_krepes_almures));
		taz.add(res.getStringArray(R.array.Tazmaniac_krepes_glukes));
		taz.add(res.getStringArray(R.array.Tazmaniac_prwina));
		taz.add(res.getStringArray(R.array.Tazmaniac_sandwich));
		taz.add(res.getStringArray(R.array.Tazmaniac_steak_sandwich));
		
		fame.add(res.getStringArray(R.array.Fame_burger));
		fame.add(res.getStringArray(R.array.Fame_krepes_almures));
		fame.add(res.getStringArray(R.array.Fame_krepes_glukes));
		fame.add(res.getStringArray(R.array.Fame_merides));
		fame.add(res.getStringArray(R.array.Fame_omeletes));
		fame.add(res.getStringArray(R.array.Fame_orektika));
		fame.add(res.getStringArray(R.array.Fame_pites));
		fame.add(res.getStringArray(R.array.Fame_pitses));
		fame.add(res.getStringArray(R.array.Fame_salates));
		fame.add(res.getStringArray(R.array.Fame_sandwich));
		fame.add(res.getStringArray(R.array.Fame_spesialite));
		fame.add(res.getStringArray(R.array.Fame_vafles));
		fame.add(res.getStringArray(R.array.Fame_xwris_pita));
		fame.add(res.getStringArray(R.array.Fame_yhta));
		fame.add(res.getStringArray(R.array.Fame_zumarika));
		
		nostos.add(res.getStringArray(R.array.Nostos_mageireuta));
		nostos.add(res.getStringArray(R.array.Nostos_omeletes));
		nostos.add(res.getStringArray(R.array.Nostos_orektika));
		nostos.add(res.getStringArray(R.array.Nostos_peinirli));
		nostos.add(res.getStringArray(R.array.Nostos_pitses));
		nostos.add(res.getStringArray(R.array.Nostos_salates));
		nostos.add(res.getStringArray(R.array.Nostos_tortelini));
		nostos.add(res.getStringArray(R.array.Nostos_yhta));
		nostos.add(res.getStringArray(R.array.Nostos_zumarika));
		
		giro.add(res.getStringArray(R.array.Guro_Guro_oloi_merides));
		giro.add(res.getStringArray(R.array.Guro_Guro_oloi_orektika));
		giro.add(res.getStringArray(R.array.Guro_Guro_oloi_pites));
		giro.add(res.getStringArray(R.array.Guro_Guro_oloi_poikilies));
		giro.add(res.getStringArray(R.array.Guro_Guro_oloi_salates));
		giro.add(res.getStringArray(R.array.Guro_Guro_oloi_souvles));
		
				
		
		
		epiloges.add(bakxos);
		epiloges.add(nostos);
		epiloges.add(giro);
		epiloges.add(fame);
		epiloges.add(koutala);
		epiloges.add(kouzina);
		epiloges.add(megaro);
		epiloges.add(evrys);
		epiloges.add(sweet);
		epiloges.add(taz);
		//estiatorio=new ArrayList<String[]>();
		int randEpiloges = (int) (Math.random()*10);
		int randEstiatorio = (int) (Math.random()*10);
		
		
		
		
		
		String [] Arhs=bakxos.get(1);
		Toast.makeText(getBaseContext(), Arhs[1],Toast.LENGTH_SHORT ).show();
		
			
		//dimiourgia listas Epilogwn
		
		 
	
	
	}

	

}
