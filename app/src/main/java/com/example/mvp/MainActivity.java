package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp.loginAction.view;

public class MainActivity extends AppCompatActivity implements view {

    public EditText email, password;
    MainActivityPresentor mainActivityPresentor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        Button loginBtn = (Button) findViewById(R.id.btn_login);

        mainActivityPresentor = new MainActivityPresentor(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getEmail = email.getText().toString();
                String getPassword = password.getText().toString();

                if (TextUtils.isEmpty(getEmail) || TextUtils.isEmpty(getPassword)){
                    onError("Fill the empty feild(s)");
                }else {
                    onSuccess("Loged in, Welcome");
                    mainActivityPresentor.checkInfo(getEmail , getPassword);
                }
            }
        });

    }

    @Override
    public void onError(String error) {
        Toast.makeText(this , error , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(String message) {
        Toast.makeText(this , message , Toast.LENGTH_SHORT).show();
    }
}