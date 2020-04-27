package com.hitesh.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<items> itemList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, title2, title3;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            title2 = (TextView) view.findViewById(R.id.title2);
            title3 = (TextView) view.findViewById(R.id.title3);
        }
    }


    public RecyclerViewAdapter(List<items> itemList) {
        this.itemList = itemList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recycler_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        items items = itemList.get(position);
        holder.title.setText(items.getTitle());
        holder.title2.setText(items.getGenre());
        holder.title3.setText(items.getYear());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}