package com.example.mvp;

public class MainActivityPresentor implements loginAction.presntor {

    loginAction.view view;

    public MainActivityPresentor(loginAction.view view) {
        this.view = view;
    }

    @Override
    public void checkInfo(String email, String password) {
        
    }
}
