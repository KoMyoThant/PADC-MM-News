package com.example.pyaesone.myapplication.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.pyaesone.myapplication.activities.MainActivity;
import com.example.pyaesone.myapplication.delegates.NewsItemDelegate;

/**
 * Created by pyaesone on 11/4/17.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {
    private NewsItemDelegate mDelegate;

    public NewsViewHolder(View itemView, NewsItemDelegate newsItemDelegate) {
        super(itemView);
        mDelegate = newsItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDelegate.onTapNews();
            }
        });
    }
}
