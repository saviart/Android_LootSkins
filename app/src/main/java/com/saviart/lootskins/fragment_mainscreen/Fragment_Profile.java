package com.saviart.lootskins.fragment_mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.support.annotation.NonNull;

import com.saviart.lootskins.R;

public class Fragment_Profile extends Fragment {
    View view;
    public Fragment_Profile(){

    }

    @NonNull
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_profile,container,false);
        return view;
    }

}
