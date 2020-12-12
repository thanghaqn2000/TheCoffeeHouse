package com.example.thecoffeehouse.model_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.thecoffeehouse.R;

public class SanPhamAdapter extends ArrayAdapter<DoUong> {
    Activity context_338;
    int resource_338;

    public SanPhamAdapter(@NonNull Activity context_338, int resource_338) {
        super(context_338, resource_338);
        this.context_338 = context_338;
        this.resource_338 = resource_338;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context_338.getLayoutInflater();
        View customView = inflater.inflate(this.resource_338, null);
        ImageView imghinh = customView.findViewById(R.id.imghinh_338);
        TextView txtten = customView.findViewById(R.id.txtten_338);
        TextView txtgia = customView.findViewById(R.id.txtgia_338);
        DoUong sp = getItem(position);
        imghinh.setImageResource(sp.getHinh_338());
        txtten.setText(sp.getTen_338());
        txtgia.setText(sp.getGia_338() + "đ");
        return customView;
    }
}