package com.example.pyaesone.myapplication.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.pyaesone.myapplication.R;
import com.example.pyaesone.myapplication.delegates.LoginRegisterDelegate;
import com.example.pyaesone.myapplication.fragments.LoginFragment;
import com.example.pyaesone.myapplication.fragments.RegisterFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by pyaesone on 11/26/17.
 */

public class LoginRegisterActivity extends AppCompatActivity implements LoginRegisterDelegate{
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, LoginRegisterActivity.class);

        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        ButterKnife.bind(this, this);
        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {           // not reach when rotating screen ( reach in initial state )
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, LoginFragment.newInstance()).commit();
        }
    }

    @Override
    public void onTapLogin() {

    }

    @Override
    public void onTapForgotPassword() {

    }

    @Override
    public void onTapToRegister() {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                .replace(R.id.fl_container, RegisterFragment.newInstance())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void setScreenTitle(String title) {
        ActionBar actionBar = getSupportActionBar();

        if (title != null) {
            actionBar.setTitle(title);
        }
    }
}
