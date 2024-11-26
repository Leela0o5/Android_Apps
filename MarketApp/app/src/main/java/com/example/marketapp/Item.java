package com.example.marketapp;
//modal class
public class Item {
    private int ItemImg;
    private String ItemName;
    private String ItemDesp;

    public Item(int itemImg,String ItemName,String ItemDesp) {
       this.ItemImg = itemImg;
        this.ItemDesp=ItemDesp;
        this.ItemName=ItemName;
    }

    public int getItemImg() {
        return ItemImg;
    }

    public void setItemImg(int itemImg) {
        ItemImg = itemImg;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemDesp() {
        return ItemDesp;
    }

    public void setItemDesp(String itemDesp) {
        ItemDesp = itemDesp;
    }
}
