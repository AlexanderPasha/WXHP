package com.mannydev.wexhelper.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mannydev.wexhelper.model.Coin;


public abstract class MyViewHolder extends RecyclerView.ViewHolder {
    public MyViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindCoinHolder(Coin coin);
}
