package com.saviart.lootskins;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.support.annotation.NonNull;

public class Fragment_Skin extends Fragment {
View view;
public Fragment_Skin(){
}


@NonNull
@Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
    view = inflater.inflate(R.layout.skin_fragment,container,false);
    return view;
}

}
