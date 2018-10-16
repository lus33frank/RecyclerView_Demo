package com.frankchang.recyclerview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    // 畫面元件
    private RecyclerView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();    // 畫面元件連結
    }

    // 畫面元件連結
    private void findViews() {
        list = findViewById(R.id.recyclerList);
        list.setHasFixedSize(true);     // 是不是固定大小
        list.setLayoutManager(new LinearLayoutManager(this));   // 內部使用的容器類型
    }

    @Override
    protected void onResume() {
        super.onResume();

        // 設定 RecyclerView
        ItemsAdapter itemsAdapter = new ItemsAdapter(this);
        list.setAdapter(itemsAdapter);
    }
}
