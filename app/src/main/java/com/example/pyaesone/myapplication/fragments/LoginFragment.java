package com.example.pyaesone.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pyaesone.myapplication.R;
import com.example.pyaesone.myapplication.delegates.LoginRegisterDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by pyaesone on 11/26/17.
 */

public class LoginFragment extends Fragment {

    private LoginRegisterDelegate mLoginRegisterDelegate;

    public static LoginFragment newInstance() {
        LoginFragment loginFragment = new LoginFragment();

        return loginFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View loginView = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, loginView);

        return loginView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mLoginRegisterDelegate = (LoginRegisterDelegate) context;
    }

    @OnClick(R.id.btn_to_register)
    public void onTapToRegister(View view) {
        mLoginRegisterDelegate.onTapToRegister();
    }

    @Override
    public void onStart() {
        super.onStart();
        mLoginRegisterDelegate.setScreenTitle("Login");
    }
}
