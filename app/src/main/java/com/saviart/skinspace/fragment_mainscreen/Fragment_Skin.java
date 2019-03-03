package com.saviart.skinspace.fragment_mainscreen;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.saviart.skinspace.R;
import com.saviart.skinspace.adapter.AdapteSkin;
import com.saviart.skinspace.constructor.Construtor_ListItems;
import com.saviart.skinspace.event.OnClickIteml;

import java.util.ArrayList;

public class Fragment_Skin extends Fragment implements OnClickIteml {

    View view;
    RecyclerView ListItems;
    ArrayList<Construtor_ListItems> arrayListItems;
    AdapteSkin adapter;
    private Dialog myDialog;



    public Fragment_Skin() {
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_skin, container, false);
        anhxa();


        adapter = new AdapteSkin(getActivity(), R.layout.format_listitems, arrayListItems,this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        ListItems.setLayoutManager(layoutManager);
        ListItems.setAdapter(adapter);


        // adapter.notifyDataSetChanged();
        myDialog =new Dialog(getContext());

        return view;
    }

    private void anhxa() {
        ListItems = (RecyclerView) view.findViewById(R.id.listviewitems);
        arrayListItems = new ArrayList<>();

        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "XM1014|Blue Spruce", "Minimal Wear", "400", "CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Facoty New", "300", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2, "Tec-9", "Feal Test", "1200", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Facoty New", "4030", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2, "AKM", "Facoty New", "1200", "CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Minimal Wear", "98", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2, "AK-47", "Minimal Wear", "4000", "CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Minimalc", "9700", "CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2, "P2000|Turf", "Minimal Wear", "400", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "SMinimal", "400", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "SG 553|Phantom", "Facoty New", "400", "CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Facoty New", "352", "CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2, "AKM", "Facoty New", "120", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Facoty New", "34", "CS:GO"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2, "AKM", "Facoty New", "4767", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Facoty New", "1235", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample2, "AKM", "Facoty New", "789", "PUBG"));
        arrayListItems.add(new Construtor_ListItems(R.drawable.gunsample, "AKM", "Facoty New", "909", "CS:GO"));


    }


    public void createPopup(Construtor_ListItems data) {
        myDialog.setContentView(R.layout.popup_skins);
        workingDialog(myDialog,data);
        myDialog.show();


    }

    private void workingDialog(final Dialog myDialog, Construtor_ListItems data) {
        ImageView popup_imgitem = (ImageView) myDialog.findViewById(R.id.popup_imgitem);
        popup_imgitem.setImageResource(data.getImgitem());


        ImageView btnClose = (ImageView) myDialog.findViewById(R.id.btn_close_popup);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }

        });

        Button popup_numbcoin = (Button) myDialog.findViewById(R.id.popup_numbcoin);
        popup_numbcoin.setText(data.getNumbcoin());

        Button popup_txtgame = (Button) myDialog.findViewById(R.id.popup_txtgame);
        popup_txtgame.setText(data.getTxtgame());

        TextView popup_nameitem = (TextView) myDialog.findViewById(R.id.popup_nameitem);
        popup_nameitem.setText(data.getNameitem());

        TextView popup_desitem = (TextView) myDialog.findViewById(R.id.popup_desitem);
        popup_desitem.setText(data.getDesitem());

        Animation animstar3 = (Animation) AnimationUtils.loadAnimation(getActivity(),R.anim.animstar3);
        popup_imgitem.startAnimation(animstar3);

       //Code tính năng của popup ở đây.
        Button  popup_btnconfirm = (Button) myDialog.findViewById(R.id.popup_btnconfirm);
        popup_btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"Confirm",Toast.LENGTH_SHORT).show();
                myDialog.dismiss();
            }
        });
    }


    @Override
    public void onClickItem(Construtor_ListItems data) {
        createPopup(data);
    }


}




