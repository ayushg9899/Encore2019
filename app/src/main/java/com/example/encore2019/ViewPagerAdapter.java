package com.example.encore2019;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        schedule_fagment demofragment = new schedule_fagment();
        i = i+1;
        Bundle bundle = new Bundle();
        bundle.putString("message","Fragment :"+i);
        demofragment.setArguments(bundle);
        return demofragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        position= position + 1;
        return "DAY "+position;

    }
}
