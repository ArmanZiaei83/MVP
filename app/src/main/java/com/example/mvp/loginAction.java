package com.example.mvp;

import java.lang.ref.SoftReference;

public interface loginAction {

    interface view {
        void onError (String error);
        void onSuccess(String message);
    }
    interface presntor {
        void checkInfo(String email, String password);
    }
}
