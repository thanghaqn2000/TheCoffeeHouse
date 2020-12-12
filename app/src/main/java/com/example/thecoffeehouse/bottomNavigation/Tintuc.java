package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.Information;
import com.example.thecoffeehouse.Notify;
import com.example.thecoffeehouse.R;

public class Tintuc extends Fragment implements View.OnClickListener {

    ImageView img1_338, img2_338;
    RelativeLayout rl1_338, rl2_338, rl3_338;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_navigation_tintuc, container, false);
        img1_338 = root.findViewById(R.id.imageNotify_338);
        img1_338.setOnClickListener(this);
        img2_338 = root.findViewById(R.id.imageAdd_338);
        img2_338.setOnClickListener(this);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                open();
//            }
//        });

        rl1_338 = root.findViewById(R.id.relativeTichdiem_338);
        rl2_338 = root.findViewById(R.id.relativeDathang_338);
        rl3_338 = root.findViewById(R.id.relativeCoupon_338);
        rl1_338.setOnClickListener(this);
        rl2_338.setOnClickListener(this);
        rl3_338.setOnClickListener(this);

//        rl1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick(v);
//            }
//        });
//
//        rl2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               inflater.inflate(R.layout.fragment_navigation_dathang,container,false);
//
//            }
//        });
//
//        rl3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick(v);
//            }
//        });

        return root;
    }

//    public void open() {
//        Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
//        startActivity(dsp);
//    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify_338) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd_338) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.relativeTichdiem_338) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang_338) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeCoupon_338) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
    }


}