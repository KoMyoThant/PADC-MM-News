package com.example.pyaesone.myapplication.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.pyaesone.myapplication.R;
import com.example.pyaesone.myapplication.adapters.NewsImagesPagerAdapter;
import com.example.pyaesone.myapplication.adapters.RelativeNewsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by pyaesone on 11/11/17.
 */

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, NewsDetailsActivity.class);

        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this, this);

        NewsImagesPagerAdapter newsImagesPagerAdapter = new NewsImagesPagerAdapter(getApplicationContext());
        vpNewsDetailsImages.setAdapter(newsImagesPagerAdapter);

        // Relative news list
        RecyclerView rvRelativeNews = findViewById(R.id.rv_relative_news);
        rvRelativeNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        RelativeNewsAdapter relativeNewsAdapter = new RelativeNewsAdapter(getApplicationContext());
        rvRelativeNews.setAdapter(relativeNewsAdapter);
    }
}
