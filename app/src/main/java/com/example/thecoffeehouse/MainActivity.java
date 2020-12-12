package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.thecoffeehouse.bottomNavigation.Cuahang;
import com.example.thecoffeehouse.bottomNavigation.Dathang;
import com.example.thecoffeehouse.bottomNavigation.Taikhoan;
import com.example.thecoffeehouse.bottomNavigation.Tintuc;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActionBar toolbar_338;
    private GoogleMap mMap_338;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar_338 = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation_338);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // load the store fragment by default
        loadFragment(new Tintuc());
    }

     private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.tintuc_338:
                    fragment = new Tintuc();
                    loadFragment(fragment);
                    return true;
                case R.id.dathang:
                    fragment = new Dathang();
                    loadFragment(fragment);
                    return true;
                case R.id.cuahang:
                    fragment = new Cuahang();
                   loadFragment(fragment);
                    //openGGmap();
                    return true;
                case R.id.taikhoan:
                    fragment = new Taikhoan();
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container_338, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public void openGGmap(){
        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
        startActivity(intent);
    }
}
