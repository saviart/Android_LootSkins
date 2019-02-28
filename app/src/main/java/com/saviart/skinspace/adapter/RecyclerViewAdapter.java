package com.saviart.skinspace.adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.saviart.skinspace.R;
import com.saviart.skinspace.constructor.Construtor_ListItems;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>{
    private List<Construtor_ListItems> data = new ArrayList<>();
    private Context context;
    private int layout;

    public RecyclerViewAdapter(Context context, int layout, List<Construtor_ListItems> itemsList) {
        this.data = itemsList;
        this.layout = layout;
        context = context;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Construtor_ListItems item = data.get(position);

        holder.nameitem.setText(item.getNameitem());
        holder.desitem.setText(item.getDesitem());
        holder.numbcoin.setText(item.getNumbcoin());
        holder.txtgame.setText(item.getTxtgame());
        holder.imgitem.setImageResource(item.getImgitem());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView txtgame;
        TextView nameitem ;
        TextView desitem;
        TextView numbcoin;
        ImageView imgitem ;
        public ItemViewHolder(View itemView) {
            super(itemView);
         nameitem = (TextView) itemView.findViewById(R.id.nameitem);
         desitem = (TextView) itemView.findViewById(R.id.desitem);
         numbcoin = (TextView)itemView .findViewById(R.id.numbcoin);
         txtgame = (TextView)itemView .findViewById(R.id.txtgame);
         imgitem = (ImageView)itemView .findViewById(R.id.imgitem);

        }
    }
}
