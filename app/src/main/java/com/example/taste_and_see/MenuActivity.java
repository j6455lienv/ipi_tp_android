package com.example.taste_and_see;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.taste_and_see.sub_menu.DownActivity;
import com.example.taste_and_see.sub_menu.MapsActivity;
import com.example.taste_and_see.sub_menu.PreferencesActivity;
import com.example.taste_and_see.sub_menu.RecetteActivity;

public class MenuActivity extends Activity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);

    ImageView img1 = findViewById(R.id.menu_img1);
    img1.setOnClickListener(this);

    ImageView img2 = findViewById(R.id.menu_img2);
    img2.setOnClickListener(this);

    ImageView img3 = findViewById(R.id.menu_img3);
    img3.setOnClickListener(this);

    ImageView img4 = findViewById(R.id.menu_img4);
    img4.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {

    if (v.getId() == R.id.menu_img1) {
      Intent intent = new Intent(this, PreferencesActivity.class);
      startActivity(intent);
    }else if (v.getId() == R.id.menu_img2) {
      Intent intent = new Intent(this, RecetteActivity.class);
      startActivity(intent);
    }else if (v.getId() == R.id.menu_img3) {
      Intent intent = new Intent(this, DownActivity.class);
      startActivity(intent);
    } else if (v.getId() == R.id.menu_img4) {
      Intent intent = new Intent(this, MapsActivity.class);
      startActivity(intent);
    } else{
      Toast.makeText(this, "Error cassé !!", Toast.LENGTH_SHORT).show();
    }
  }
}
