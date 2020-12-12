package com.example.thecoffeehouse.bottomNavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.tablayout.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Dathang extends Fragment {

    private TabLayout mTabLayout_338;
    private ViewPager mViewPager_338;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_navigation_dathang, container, false);
        mTabLayout_338 = r.findViewById(R.id.tab_layout_338);
        mViewPager_338 = r.findViewById(R.id.view_pager_338);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager_338.setAdapter(viewPagerAdapter);
        mTabLayout_338.setupWithViewPager(mViewPager_338);
        return r;
    }

}