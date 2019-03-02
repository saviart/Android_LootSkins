package com.saviart.skinspace.fragment_mainscreen;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.saviart.skinspace.R;

public class Fragment_Earn extends Fragment {
    View view;
    public Fragment_Earn(Context context){
      //  Toast.makeText(context,"sdfgsdfgdsfg",Toast.LENGTH_LONG).show();
    }


    @NonNull
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_earn,container,false);

        return view;
    }

}
