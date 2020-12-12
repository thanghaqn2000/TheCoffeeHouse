package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;

public class DoAnFragment extends Fragment {
    private GridView gvmon_338;
    private SanPhamAdapter spadt_338;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_do_an, container, false);

        gvmon_338 = r.findViewById(R.id.gv_mon_338);
        spadt_338 = new SanPhamAdapter(DoAnFragment.this.getActivity(), R.layout.item);
        gvmon_338.setAdapter(spadt_338);
        registerForContextMenu(gvmon_338);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt_338.add(new DoUong(R.drawable.maccasocola, "Macca Phủ Socola", "45.000"));
        spadt_338.add(new DoUong(R.drawable.mitsay, "Mít sấy", "20.000"));
        spadt_338.add(new DoUong(R.drawable.bonglantrungmuoi, "Bông lan trứng muối", "29.000"));
    }
    private void addEvents() {
        gvmon_338.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                final Dialog dialog_338 = new Dialog(DoAnFragment.this.getActivity());
                dialog_338.setContentView(R.layout.dilg_dathang);
                Button btn_confirm_338=dialog_338.findViewById(R.id.btn_confirm_338);
                btn_confirm_338.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Bạn đã đặt hàng thành công!",
                                Toast.LENGTH_LONG).show();
                        dialog_338.cancel();
                    }
                });
                dialog_338.show();
            }
        });

    }
}