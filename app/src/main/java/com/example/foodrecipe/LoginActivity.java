package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.foodrecipe.model.RecipeList;

public class LoginActivity extends AppCompatActivity {

    RelativeLayout mLayout;

    public EditText email_et;
    public EditText password_et;
    public Button login_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLayout = findViewById(R.id.Login_page);
        email_et = findViewById(R.id.editText_email);
        password_et = findViewById(R.id.editText_password);
        login_btn = findViewById(R.id.button_login);





        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validation(email_et.getText().toString(), password_et.getText().toString() );
            }
        });
    }

    public void validation(String email_et, String password_et){
        if (email_et.equals("biggiedaddie@gbokocho.com") && password_et.equals("1234")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class );
            startActivity(intent);
        }
    }
    }


