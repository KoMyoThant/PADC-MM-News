package com.example.pyaesone.myapplication.delegates;

/**
 * Created by pyaesone on 11/26/17.
 */

public interface LoginRegisterDelegate {
    void onTapLogin();
    void onTapForgotPassword();
    void onTapToRegister();

    void setScreenTitle(String title);
}
