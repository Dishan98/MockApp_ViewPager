package com.example.mockapp_viewpager;

import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class IntroAdapter extends FragmentPagerAdapter {
    public IntroAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            default: return IntroFragment.newInstance(Color.parseColor("#FFFFFF"),position);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
