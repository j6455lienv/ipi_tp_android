package com.example.taste_and_see.sub_menu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.taste_and_see.R;

public class RecetteAdapter extends ArrayAdapter<Recette> {
  public RecetteAdapter(@NonNull Context c, int resource) {
    super(c, resource);
  }

  public View getView(int position, View convertView, ViewGroup parent) {
    Button b = new Button(this.getContext());
    Recette r = this.getItem(position);
    b.setText(r.getNom());
    LayoutInflater li = LayoutInflater.from(this.getContext());

    View v = li.inflate(R.layout.recette_list_item, null);

    TextView txt = v.findViewById(R.id.list_item_name);
    TextView txt2 = v.findViewById(R.id.list_item_price);
    ImageView img = v.findViewById(R.id.list_item_img);

    txt.setText(r.getNom());
    txt2.setText(r.getPrix() + " €");
    int resId = getResourceId(r.getImage(), "drawable");
    img.setImageResource(resId);
    return v;
  }

  private int getResourceId(String pVariableName, String pResourcename) {
    try {
      return this.getContext().getResources().getIdentifier(pVariableName, pResourcename, this.getContext().getPackageName());
    } catch (Exception e) {
      e.printStackTrace();
      return -1;
    }
  }
}

