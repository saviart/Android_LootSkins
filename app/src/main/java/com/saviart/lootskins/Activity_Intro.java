package com.saviart.lootskins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saviart.lootskins.adapter.Adapter_IntroViewPager;
import com.saviart.lootskins.constructor.Constructor_Intro;

import java.util.ArrayList;
import java.util.List;

public class Activity_Intro extends AppCompatActivity {

    private   android.support.v4.view.ViewPager screenPager;
    Adapter_IntroViewPager adapterIntroViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        List<Constructor_Intro> mList = new ArrayList<>();
        mList.add(new Constructor_Intro("Intro1","Destination for Intro 1",R.drawable.img1));
        mList.add(new Constructor_Intro("Intro2","Destination for Intro 2",R.drawable.img2));
        mList.add(new Constructor_Intro("Intro3","Destination for Intro 3",R.drawable.img3));

        //setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        adapterIntroViewPager = new Adapter_IntroViewPager(this,mList);
        screenPager.setAdapter(adapterIntroViewPager);



    }
}
