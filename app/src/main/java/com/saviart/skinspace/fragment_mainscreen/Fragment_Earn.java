package com.saviart.skinspace.fragment_mainscreen;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.saviart.skinspace.R;
import com.saviart.skinspace.adapter.Adapter_RcvEarn;
import com.saviart.skinspace.constructor.Construtor_LastEarning;

import java.util.ArrayList;

public class Fragment_Earn extends Fragment {
    View view;
    Button btn_fyberwall;
    Button btn_tapjoywall;
    Button btn_adscendwall;
    Button btn_fybervideo1;
    Button btn_fybervideo2;
    LinearLayout layout_fyberwall;
    LinearLayout layout_tapjoywall;
    LinearLayout layout_adscendwall;
    LinearLayout layout_fybervideo1;
    LinearLayout layout_fybervideo2;

    RecyclerView ListItems;
    ArrayList<Construtor_LastEarning> arrayListItems;
    Adapter_RcvEarn adapter;






    public Fragment_Earn(Context context){
      //  Toast.makeText(context,"sdfgsdfgdsfg",Toast.LENGTH_LONG).show();
    }

    @NonNull
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_earn,container,false);
        anhxa();
        adapter = new Adapter_RcvEarn(getActivity(), arrayListItems);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        ListItems.setLayoutManager(layoutManager);
        ListItems.setAdapter(adapter);




        btn_fyberwall = (Button) view.findViewById(R.id.btn_fyberwall);
        btn_tapjoywall = (Button) view.findViewById(R.id.btn_tapjoywall);
        btn_adscendwall = (Button) view.findViewById(R.id.btn_adscendwall);
        btn_fybervideo1 = (Button) view.findViewById(R.id.btn_fybervideo1);
        btn_fybervideo2 = (Button) view.findViewById(R.id.btn_fybervideo2);
        layout_fyberwall = (LinearLayout) view.findViewById(R.id.layout_fyberwall);
        layout_tapjoywall = (LinearLayout) view.findViewById(R.id.layout_tapjoywall);
        layout_adscendwall = (LinearLayout) view.findViewById(R.id.layout_adscendwall);
        layout_fybervideo1 = (LinearLayout) view.findViewById(R.id.layout_fybervideo1);
        layout_fybervideo2 = (LinearLayout) view.findViewById(R.id.layout_fybervideo2);


        click_btnfyberwall();
        click_btntapjoywall();
        click_btnadscendwall();
        click_btnfybervideo1();
        click_btnfybervideo2();
        click_layout_fyberwall();
        click_layout_tapjoywall();
        click_layout_adscendwall();
        click_layout_fybervideo1();
        click_layout_fybervideo2();

        return view;
    }

    private void click_layout_fybervideo2() {
        layout_fybervideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm Fyber video 2",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_layout_fybervideo1() {
        layout_fybervideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm Fyber video 1",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_layout_adscendwall() {
        layout_adscendwall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm adscend wall",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_layout_tapjoywall() {
        layout_tapjoywall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm Tapjoy wall",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_layout_fyberwall() {
        layout_fyberwall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm Fyber wall",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_btnfybervideo2() {
        btn_fybervideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm fyber video 2",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_btnfybervideo1() {
        btn_fybervideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm fyber video 1",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_btnadscendwall() {
        btn_adscendwall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm adscend wall",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void click_btntapjoywall() {
        btn_tapjoywall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm Tapjoy wall",Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void click_btnfyberwall() {
        btn_fyberwall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"đã bấm Fyber wall",Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void anhxa() {

        ListItems = (RecyclerView) view.findViewById(R.id.rvearnitems);
        arrayListItems = new ArrayList<>();
        arrayListItems.add(new Construtor_LastEarning("Fyber wall","2019-03-15 19:02:32","50"));
        arrayListItems.add(new Construtor_LastEarning("Tapjoy wall","2019-03-14 05:02:32","120"));
        arrayListItems.add(new Construtor_LastEarning("Tapjoy wall","2019-03-23 12:02:32","530"));
        arrayListItems.add(new Construtor_LastEarning("Tapjoy wall","2019-03-03 10:02:32","630"));
        arrayListItems.add(new Construtor_LastEarning("Tapjoy wall","2019-01-18 17:02:32","1100"));
        arrayListItems.add(new Construtor_LastEarning("Fyber wall","2019-03-19 15:02:32","330"));



        //Thêm item từ database code ở đây, còn anh làm thế nào gọi được database thì kệ mẹ anh =))))))


    }

}
