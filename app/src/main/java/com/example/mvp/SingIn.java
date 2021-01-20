package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SingIn extends AppCompatActivity {
    public EditText name, signInEmail , signInPass;
    public Button btn_singIn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);

        name = findViewById(R.id.name);
        btn_singIn = findViewById(R.id.btn_sing_in);
        signInEmail = findViewById(R.id.sign_in_email);
        signInPass = findViewById(R.id.sign_in_pass);


    }
}