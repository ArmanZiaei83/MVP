package com.example.mvp;

import android.content.Context;

public interface SignInGenerator {

    interface view{

        void singedIn(String message);
        void signInError(String message);
    }

    interface singInPresentor{

        void getInfo(String name , String email , String password, Context context);
    }
}
