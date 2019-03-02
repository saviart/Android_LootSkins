package com.saviart.skinspace.fragment_mainscreen;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.Toast;

import com.saviart.skinspace.Activity_MainScreen;
import com.saviart.skinspace.R;
import com.saviart.skinspace.adapter.AdapterRcvProfile;

import com.saviart.skinspace.constructor.Construtor_Profile;

import java.util.ArrayList;

public class Fragment_Profile extends Fragment {
    View view;
    RecyclerView ListItems;
    ArrayList<Construtor_Profile> arrayListItems;
    AdapterRcvProfile adapter;
    Button btn_getmore;
    Button btn_invite;
    Button btn_signout;
    Button btn_share;

    public Fragment_Profile() {
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_profile, container, false);
        anhxa();
        adapter = new AdapterRcvProfile(getActivity(), arrayListItems);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        ListItems.setLayoutManager(layoutManager);
        ListItems.setAdapter(adapter);
        // adapter.notifyDataSetChanged();


        clickbtn_getmore();
        clickbtn_invite();
        clickbtn_share();
        clickbtn_signout();
        return view;
    }


    private void clickbtn_signout() {
        btn_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm signout",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void clickbtn_share() {
        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm share",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void clickbtn_invite() {
        btn_invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm invite",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void  clickbtn_getmore() {
        btn_getmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment();
            }
        });
    }

    private void changeFragment() {
//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.fragment_one, AFragment.newInstance());
//        transaction.commit();
      Activity_MainScreen.main.selectIndex(2);


    }


    private void anhxa() {
        btn_share = (Button) view.findViewById(R.id.btn_share);
        btn_signout = (Button) view.findViewById(R.id.btn_signout);
        btn_invite = (Button) view.findViewById(R.id.btn_invite);
        btn_getmore = (Button) view.findViewById(R.id.btn_getmore);
        ListItems = (RecyclerView) view.findViewById(R.id.rvtransitems);
        arrayListItems = new ArrayList<>();
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample, "AKM", "Facoty New", "1235", "PENDING"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample2, "AKM", "Facoty New", "789", "SUCCESS"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample, "AKM", "Facoty New", "9092", "SUCCESS"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample, "AKM", "Facoty New", "1235", "SUCCESS"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample2, "AKM", "Facoty New", "789", "SUCCESS"));
        arrayListItems.add(new Construtor_Profile(R.drawable.gunsample, "AKM", "Facoty New", "9092", "SUCCESS"));

        //Thêm item từ database code ở đây


    }


}


