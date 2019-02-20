package com.saviart.lootskins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private   android.support.v4.view.ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Test1","dhfalkfjajfaslkjf",R.drawable.img1));
        mList.add(new ScreenItem("Test2","dhfalkfjajfaslkjf",R.drawable.img2));
        mList.add(new ScreenItem("Test3","dhfalkfjajfaslkjf",R.drawable.img3));

        //setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);



    }
}
