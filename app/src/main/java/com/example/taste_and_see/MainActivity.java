package com.example.taste_and_see;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button but = findViewById(R.id.connect);
    but.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {

    EditText login = findViewById(R.id.login);
    EditText password = findViewById(R.id.password);

    if (login.getText().toString().equals("julien")
            && password.getText().toString().equals("julien")) {
      Intent intent = new Intent(this, MenuActivity.class);
      startActivity(intent);
    } else {
      Toast.makeText(this, "Login/Mdp incorrect", Toast.LENGTH_LONG).show();
    }
  }
}
