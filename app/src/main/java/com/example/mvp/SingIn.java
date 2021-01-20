package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SingIn extends AppCompatActivity implements SignInGenerator.view{

    public EditText name, signInEmail , signInPass;
    public Button btn_singIn ;
    SignInPresentor signInPresentor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);

        name = findViewById(R.id.name);
        btn_singIn = findViewById(R.id.btn_sing_in);
        signInEmail = findViewById(R.id.sign_in_email);
        signInPass = findViewById(R.id.sign_in_pass);

        btn_singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getSignName = name.getText().toString();
                String getSignEmail = signInEmail.getText().toString();
                String getSignPass = signInPass.getText().toString();

                signInPresentor = new SignInPresentor();
                if(TextUtils.isEmpty(getSignEmail) || TextUtils.isEmpty(getSignName) || TextUtils.isEmpty(getSignPass)){
                    signInError("Fill the empty field(s)");
                }else {
                    if (getSignPass.length() > 6){
                        singedIn("Successful");
                        signInPresentor.getInfo(getSignName , getSignEmail , getSignPass);
                    }else {
                        signInError("Password Must be 6 characters or more");
                    }
                }
            }
        });

    }

    @Override
    public void singedIn(String message) {

        Toast.makeText(this , message , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signInError(String message) {

        Toast.makeText(this , message , Toast.LENGTH_LONG).show();
    }
}