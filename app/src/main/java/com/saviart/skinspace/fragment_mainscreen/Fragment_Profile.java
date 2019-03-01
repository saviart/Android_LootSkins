package com.saviart.skinspace.fragment_mainscreen;

import android.content.Context;
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
import com.saviart.skinspace.adapter.RecyclerViewAdapter;
import com.saviart.skinspace.constructor.Construtor_ListItems;

import java.util.ArrayList;

public class Fragment_Profile extends Fragment {
    View view;
    RecyclerView ListItems;
    ArrayList<Construtor_ListItems> arrayListItems;
    RecyclerViewAdapter adapter;



    public Fragment_Profile(){
    }

    @NonNull
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_profile,container,false);
        anhxa();



        adapter = new RecyclerViewAdapter(getActivity(),R.layout.format_listitems,arrayListItems);

       GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);


        ListItems.setLayoutManager(gridLayoutManager);
        ListItems.setAdapter(adapter);
        // adapter.notifyDataSetChanged();

        return view;
    }

    private void anhxa(){
        ListItems = (RecyclerView) view.findViewById(R.id.listviewitems);
        arrayListItems = new ArrayList<>();

        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"XM1014|Blue Spruce","Minimal Wear","400","CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Facoty New","300","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2,"Tec-9","Feal Test","1200","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Facoty New","4030","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2,"AKM","Facoty New","1200","CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Minimal Wear","98","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2,"AK-47","Minimal Wear","4000","CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Minimalc","9700","CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2,"P2000|Turf","Minimal Wear","400","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","SMinimal","400","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"SG 553|Phantom","Facoty New","400","CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Facoty New","352","CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2,"AKM","Facoty New","120","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Facoty New","34","CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2,"AKM","Facoty New","4767","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Facoty New","1235","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2,"AKM","Facoty New","789","PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample,"AKM","Facoty New","909","CS:GO"));







    }




}


