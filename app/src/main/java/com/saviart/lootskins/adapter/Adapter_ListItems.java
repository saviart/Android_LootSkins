package com.saviart.lootskins.adapter;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.saviart.lootskins.R;
import com.saviart.lootskins.constructor.Construtor_ListItems;

import java.util.List;

public class Adapter_ListItems extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Construtor_ListItems> ItemsList;


    public Adapter_ListItems( Context context, int layout, List<Construtor_ListItems> itemsList) {
        this.context = context;
        this.layout = layout;
        ItemsList = itemsList;
    }

    @Override
    public int getCount() {
        return ItemsList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);
        //ánh xạ

        TextView nameitem = (TextView) convertView.findViewById(R.id.nameitem);
        TextView desitem = (TextView) convertView.findViewById(R.id.desitem);
        TextView numbcoin = (TextView) convertView.findViewById(R.id.numbcoin);
        TextView txtgame = (TextView) convertView.findViewById(R.id.txtgame);
        ImageView imgitem = (ImageView) convertView.findViewById(R.id.imgitem);


// gán giá trị

     Construtor_ListItems Construtor_ListItems = ItemsList.get(position);



        nameitem.setText(Construtor_ListItems.getNameitem());
        desitem.setText(Construtor_ListItems.getDesitem());
        numbcoin.setText(Construtor_ListItems.getNumbcoin());
        txtgame.setText(Construtor_ListItems.getTxtgame());
        imgitem.setImageResource(Construtor_ListItems.getImgitem());


        return convertView;
    }
}
