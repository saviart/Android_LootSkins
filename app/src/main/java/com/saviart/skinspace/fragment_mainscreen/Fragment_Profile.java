package com.saviart.skinspace.fragment_mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.support.annotation.NonNull;

import com.saviart.skinspace.R;
import com.saviart.skinspace.adapter.AdapterRcvProfile;

import com.saviart.skinspace.constructor.Construtor_Profile;

import java.util.ArrayList;

public class Fragment_Profile extends Fragment {
    View view;
    RecyclerView ListItems;
    ArrayList<Construtor_Profile> arrayListItems;
    AdapterRcvProfile adapter;



    public Fragment_Profile(){
    }

    @NonNull
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_profile,container,false);
        anhxa();



        adapter = new AdapterRcvProfile(getActivity(),arrayListItems);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);


        ListItems.setLayoutManager(layoutManager);
        ListItems.setAdapter(adapter);
        // adapter.notifyDataSetChanged();

        return view;
    }

    private void anhxa(){
        ListItems = (RecyclerView) view.findViewById(R.id.rvtransitems);
        arrayListItems = new ArrayList<>();

//
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample,"AKM","Facoty New","1235","PUBG"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample2,"AKM","Facoty New","789","PUBG"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample,"AKM","Facoty New","909","CS:GO"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample,"AKM","Facoty New","1235","PUBG"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample2,"AKM","Facoty New","789","PUBG"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample,"AKM","Facoty New","909","CS:GO"));






    }




}


