package com.frankchang.recyclerview_demo;

public class Items {

    // 變數
    private String itemName;


    public Items() {
        // 空建構子
    }

    // 建構子
    public Items(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
