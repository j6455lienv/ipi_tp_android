package com.example.taste_and_see.sub_menu;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.taste_and_see.R;

public class RecetteActivity extends Activity{
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recette);

    RecetteAdapter ra = new RecetteAdapter(this, R.layout.activity_main);

    Recette p1 = new Recette();
    p1.setNom("Crevette");
    p1.setPrix(15.5);
    p1.setImage("plat1");

    Recette p2 = new Recette();
    p2.setNom("Panacotta");
    p2.setPrix(5.0);
    p2.setImage("plat2");

    Recette p3 = new Recette();
    p3.setNom("Porc");
    p3.setPrix(5.0);
    p3.setImage("plat3");

    Recette p4 = new Recette();
    p4.setNom("Poisson");
    p4.setPrix(5.0);
    p4.setImage("plat4");

    Recette p5 = new Recette();
    p5.setNom("Panacotta");
    p5.setPrix(5.0);
    p5.setImage("plat5");

    Recette p6 = new Recette();
    p6.setNom("Autre1");
    p6.setPrix(5.0);
    p6.setImage("plat6");

    Recette p7 = new Recette();
    p7.setNom("Autre2");
    p7.setPrix(5.0);
    p7.setImage("plat7");

    ra.add(p1);
    ra.add(p2);
    ra.add(p3);
    ra.add(p4);
    ra.add(p5);
    ra.add(p6);
    ra.add(p7);

    ListView lv = findViewById(R.id.recette_listView);
    lv.setAdapter(ra);

  }

  //log sur les method de statements
  @Override
  protected void onStart(){
    super.onStart();
    Log.e("STATE","START");
  }

  @Override
  protected void onStop(){
    super.onStop();
    Log.e("STATE","STOP");
  }

  @Override
  protected void onPause(){
    super.onPause();
    Log.e("STATE","PAUSE");
  }

  @Override
  protected void onResume(){
    super.onResume();
    Log.e("STATE","RESUME");
  }

  @Override
  protected void onDestroy(){
    super.onDestroy();
    Log.e("STATE","DESTROY");
  }
}
