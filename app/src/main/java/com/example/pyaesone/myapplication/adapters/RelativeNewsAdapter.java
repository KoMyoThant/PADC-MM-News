package com.example.pyaesone.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pyaesone.myapplication.R;
import com.example.pyaesone.myapplication.viewholders.RelativeNewsViewHolder;

/**
 * Created by pyaesone on 11/17/17.
 */

public class RelativeNewsAdapter extends RecyclerView.Adapter {

    private LayoutInflater mLayoutInflater;

    public RelativeNewsAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View relativeNewsItemView = mLayoutInflater.inflate(R.layout.view_item_relative_news, parent, false);

        return new RelativeNewsViewHolder(relativeNewsItemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
