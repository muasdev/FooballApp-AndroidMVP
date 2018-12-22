package com.parepare.muasdev.footballteam;

import android.view.View;

public class ItemClickSupport implements View.OnClickListener {

    private int position;
    private OnItemClick onItemClick;

    public ItemClickSupport(int position, OnItemClick onItemClick) {
        this.position = position;
        this.onItemClick = onItemClick;
    }

    @Override
    public void onClick(View v) {
        onItemClick.onItemClicked(v, position);
    }

    public interface OnItemClick {
        void onItemClicked(View view, int position);
    }
}
