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

public class PhoBienFragment extends Fragment {
    private GridView gvmon_338;
    private SanPhamAdapter spadt_338;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon_338 = r.findViewById(R.id.gv_mon_338);
        spadt_338 = new SanPhamAdapter(PhoBienFragment.this.getActivity(), R.layout.item);
        gvmon_338.setAdapter(spadt_338);
        registerForContextMenu(gvmon_338);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt_338.add(new DoUong(R.drawable.luamach, "Cà phê lúa mạch nóng", "69.000"));
        spadt_338.add(new DoUong(R.drawable.mocha, "Mocha", "49.000"));
        spadt_338.add(new DoUong(R.drawable.tadaocamsa, "Trà đào cam sả", "45.000"));
        spadt_338.add(new DoUong(R.drawable.tranchautrang, "Trà sữa trân châu trắng", "45.000"));
        spadt_338.add(new DoUong(R.drawable.macchitatto, "Caramel Macchito", "55.000"));
        spadt_338.add(new DoUong(R.drawable.luamchda, "Lúa mạch đá", "69.000"));
        spadt_338.add(new DoUong(R.drawable.buoimatong, "Trà bưởi mật ong", "70.000"));
        spadt_338.add(new DoUong(R.drawable.camsa, "Trà cam sả", "55.000"));
    }
    private void addEvents() {
        gvmon_338.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                final Dialog dialog_338 = new Dialog(PhoBienFragment.this.getActivity());
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
//        gvmon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
//                dialog.setContentView(R.layout.dhang);
//                dialog.show();
//
//                return true;
//            }
//        });
    }
}