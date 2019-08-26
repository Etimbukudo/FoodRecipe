package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class HomeActivity extends AppCompatActivity {

    RelativeLayout mLayout;
    AnimationDrawable animationDrawable;

    public EditText email_et;
    public EditText password_et;
    public Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLayout = findViewById(R.id.Login_page);
        email_et = findViewById(R.id.editText_email);
        password_et = findViewById(R.id.editText_password);
        login_btn = findViewById(R.id.button_login);

        animationDrawable = (AnimationDrawable) mLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();



        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validation(email_et.getText().toString(), password_et.getText().toString() );
            }
        });
    }

    public void validation(String email_et, String password_et){
        if (email_et.equals("biggiedaddie@gbokocho.com") && password_et.equals("1234")){
            Intent intent = new Intent(HomeActivity.this, MainActivity.class );
            startActivity(intent);
        }
    }}
