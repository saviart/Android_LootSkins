package com.saviart.skinspace.constructor;

public class Construtor_Profile {
    private int img_trans_item;
    private String name_strans_item,des_trans_item,numb_trans_coin,txt_trans_game;

    public Construtor_Profile(int img_trans_item, String name_strans_item, String des_trans_item, String numb_trans_coin, String txt_trans_game) {
        this.img_trans_item = img_trans_item;
        this.name_strans_item = name_strans_item;
        this.des_trans_item = des_trans_item;
        this.numb_trans_coin = numb_trans_coin;
        this.txt_trans_game = txt_trans_game;
    }

    public int getImg_trans_item() {
        return img_trans_item;
    }

    public void setImg_trans_item(int img_trans_item) {
        this.img_trans_item = img_trans_item;
    }

    public String getName_strans_item() {
        return name_strans_item;
    }

    public void setName_strans_item(String name_strans_item) {
        this.name_strans_item = name_strans_item;
    }

    public String getDes_trans_item() {
        return des_trans_item;
    }

    public void setDes_trans_item(String des_trans_item) {
        this.des_trans_item = des_trans_item;
    }

    public String getNumb_trans_coin() {
        return numb_trans_coin;
    }

    public void setNumb_trans_coin(String numb_trans_coin) {
        this.numb_trans_coin = numb_trans_coin;
    }

    public String getTxt_trans_game() {
        return txt_trans_game;
    }

    public void setTxt_trans_game(String txt_trans_game) {
        this.txt_trans_game = txt_trans_game;
    }
}
