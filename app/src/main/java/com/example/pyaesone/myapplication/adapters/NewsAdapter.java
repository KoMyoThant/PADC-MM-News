package com.example.pyaesone.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pyaesone.myapplication.R;
import com.example.pyaesone.myapplication.delegates.NewsItemDelegate;
import com.example.pyaesone.myapplication.viewholders.NewsViewHolder;

/**
 * Created by pyaesone on 11/4/17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {
    private Context mContext;
    private LayoutInflater mLayoutInflator;
    private NewsItemDelegate mNewsItemDelegate;

    public NewsAdapter(Context context, NewsItemDelegate newsItemDelegate) {
        mLayoutInflator = LayoutInflater.from(context);
        mContext = context;
        mNewsItemDelegate = newsItemDelegate;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView = mLayoutInflator.inflate(R.layout.view_item_news, parent, false);

        return new NewsViewHolder(newsItemView,mNewsItemDelegate);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
