package com.example.thecoffeehouse.model_adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.bottomNavigation.Cuahang;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import static com.example.thecoffeehouse.R.id.address_coffe_338;

public class Mapitem_adapter implements GoogleMap.InfoWindowAdapter {
    Cuahang context_338;
    public Mapitem_adapter(Cuahang context_338) {
        this.context_338 = context_338;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getInfoContents(Marker marker) {
        LayoutInflater inflater= context_338.getLayoutInflater();
        View view=inflater.inflate(R.layout.map_item,null);
        ImageView imageView=view.findViewById(R.id.img_coffee_338);
        TextView textView=view.findViewById(address_coffe_338);
        imageView.setImageResource(R.drawable.cafe);
        textView.setText("The Coffee House - 48 Cao Thắng");
        return view;
    }
}
