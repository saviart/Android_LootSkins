package com.saviart.skinspace.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter_MainScreen extends FragmentPagerAdapter {
    private  final List<Fragment> fragmentList = new ArrayList<>();
    private  final List<String> FragmentListTitles = new ArrayList<>();

    public Adapter_MainScreen(FragmentManager fm ) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }


@Override
    public  CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
}

public void AddFragment(Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
}

}
