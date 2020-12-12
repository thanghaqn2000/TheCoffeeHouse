package com.example.thecoffeehouse.Login;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.thecoffeehouse.R;
public class Login extends AppCompatActivity {
    Button signin_338, signup_338;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        signin_338 = findViewById(R.id.btn_signin_338);
        signin_338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Login has been clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Login.this, SignIn_Activity.class);
                startActivity(intent);
            }
        });
    }
}