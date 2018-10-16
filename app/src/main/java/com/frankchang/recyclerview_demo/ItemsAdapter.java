package com.frankchang.recyclerview_demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    private final String[] items;
    private Context context;


    // 建構子
    public ItemsAdapter(Context context) {
        this.context = context;
        items = context.getResources().getStringArray(R.array.items);   // 取得陣列資料
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 設定畫面採用 Layout
        View view = LayoutInflater.from(context).inflate(
                android.R.layout.simple_list_item_1, viewGroup, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder itemsViewHolder, int i) {
        final String name = items[i];               // 取值
        itemsViewHolder.nameText.setText(name);     // 塞值

        // 點選動作功能（監聽器）
        itemsViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 顯示選取項目值
                itemClicked(name);
            }
        });
    }

    // 顯示選取項目值
    private void itemClicked(String name) {
        Toast.makeText(context, "選取項目： " + name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        // 回傳資料長度
        return items.length;
    }


    // ViewHolder
    public class ItemsViewHolder extends RecyclerView.ViewHolder {

        // 畫面元件（一列）
        TextView nameText;


        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            // 畫面元件連結
            nameText = itemView.findViewById(android.R.id.text1);
        }

    }

}
