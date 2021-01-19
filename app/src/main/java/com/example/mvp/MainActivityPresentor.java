package com.example.mvp;

import android.widget.Toast;

public class MainActivityPresentor implements loginAction.presntor {

    loginAction.view view;

    public MainActivityPresentor(loginAction.view view) {
        this.view = view;
    }

    @Override
    public void checkInfo(String email, String password) {
        if (email.equals("arman@gmail.com") && password.equals("arman")){
           view.onSuccess("Welocome Arman");
        }else {
            view.onError("Invaild Email or Password");
        }
    }
}
