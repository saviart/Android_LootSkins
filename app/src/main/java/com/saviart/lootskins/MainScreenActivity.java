package com.saviart.lootskins;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.gigamole.navigationtabstrip.NavigationTabStrip;



public class MainScreenActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private NavigationTabStrip mNavigationTabStrip;

    @Override
    public void onBackPressed() {
        initUI();
        setUI();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_mainscreen);

        initUI();
        setUI();

    }

    private void initUI() {
        mViewPager = (ViewPager) findViewById(R.id.vp);
        mNavigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts_center);
        mNavigationTabStrip.setTitles("SKINS", "PROFILE", "EARN","SETTING");




    }

    private void setUI() {
        mViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public boolean isViewFromObject(final View view, final Object object) {
                return view.equals(object);
            }

            @Override
            public void destroyItem(final View container, final int position, final Object object) {
                ((ViewPager) container).removeView((View) object);
            }

            @Override
            public Object instantiateItem(final ViewGroup container, final int position) {
                final View view = new View(getBaseContext());
                container.addView(view);
                return view;
            }
        });
        mNavigationTabStrip.setViewPager(mViewPager, 0);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Fragment_Skin(),"Skins");
        adapter.AddFragment(new Fragment_Profile(),"Profile");
        adapter.AddFragment(new Fragment_Earn(),"Earn");
        adapter.AddFragment(new Fragment_Setting(),"Setting");
        mViewPager =(ViewPager) findViewById(R.id.vp);
        mViewPager.setAdapter(adapter);
    }
}