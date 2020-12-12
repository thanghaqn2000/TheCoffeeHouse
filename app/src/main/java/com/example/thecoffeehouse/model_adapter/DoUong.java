package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong implements Serializable {
    private int hinh_338;
    private String ten_338;
    private String gia_338;
    public int getHinh_338() {
        return hinh_338;
    }
    public ImageView setHinh(int hinh) {
        this.hinh_338 = hinh;
        return null;
    }

    public String getTen_338() {
        return ten_338;
    }

    public void setTen_338(String ten_338) {
        this.ten_338 = ten_338;
    }

    public String getGia_338() {
        return gia_338;
    }

    public void setGia_338(String gia_338) {
        this.gia_338 = gia_338;
    }

    public DoUong(int hinh_338, String ten_338, String gia_338) {
        this.hinh_338 = hinh_338;
        this.ten_338 = ten_338;
        this.gia_338 = gia_338;
    }

    public DoUong() {
    }
}
