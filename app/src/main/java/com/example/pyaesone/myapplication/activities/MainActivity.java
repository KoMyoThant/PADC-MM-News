package com.example.pyaesone.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.pyaesone.myapplication.R;
import com.example.pyaesone.myapplication.adapters.NewsAdapter;
import com.example.pyaesone.myapplication.components.EmptyViewPod;
import com.example.pyaesone.myapplication.components.SmartRecyclerView;
import com.example.pyaesone.myapplication.components.SmartScrollListener;
import com.example.pyaesone.myapplication.delegates.NewsItemDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NewsItemDelegate {
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.rv_news)
    SmartRecyclerView rvNews;

    @BindView(R.id.vp_empty_news)
    EmptyViewPod vpEmptyNews;

    private SmartScrollListener mSmartScrollListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this, this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//                drawerLayout.openDrawer(GravityCompat.START);

                Intent intent = LoginRegisterActivity.newIntent(getApplicationContext());
                startActivity(intent);
            }
        });

        vpEmptyNews.setEmptyData("Ha Ha No data");
        rvNews.setEmptyView(vpEmptyNews);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        NewsAdapter newsAdapter = new NewsAdapter(getApplicationContext(), this);
        rvNews.setAdapter(newsAdapter);

        mSmartScrollListener = new SmartScrollListener(new SmartScrollListener.OnSmartScrollListener() {
            @Override
            public void onListEndReach() {
                Snackbar.make(rvNews, "This is all the data for NOW.", Snackbar.LENGTH_LONG).show();
            }
        });

        rvNews.addOnScrollListener(mSmartScrollListener);
    }

    @Override
    public void onTapComment() {

    }

    @Override
    public void onTapSendTo() {

    }

    @Override
    public void onTapFavourite() {

    }

    @Override
    public void onTapStatistics() {

    }

    @Override
    public void onTapNews() {
        Intent intent = new NewsDetailsActivity().newIntent(getApplicationContext());
        startActivity(intent);
    }
}
