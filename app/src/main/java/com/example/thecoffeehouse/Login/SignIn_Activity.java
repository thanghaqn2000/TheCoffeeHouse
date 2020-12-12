package com.example.thecoffeehouse.Login;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.R;
public class SignIn_Activity extends AppCompatActivity {
    Button signin_338;
    EditText edtemail_338, edtpassword_338;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);
        edtemail_338 =(EditText) findViewById(R.id.edtSDT_338);
        edtpassword_338 =(EditText) findViewById(R.id.edtPassword_338);
        signin_338 =(Button) findViewById(R.id.btn_signin_338);
        signin_338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
    }
    private void ControlButton() {
        if (edtemail_338.getText().length() != 0 && edtpassword_338.getText().length() != 0) {
            if (edtemail_338.getText().toString().equals("0916890776") && edtpassword_338.getText().toString().equals("1")) {
                Toast.makeText(SignIn_Activity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                //chuyen giua cac giao dien vói nhau
                Intent intent = new Intent(SignIn_Activity.this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(SignIn_Activity.this, "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(SignIn_Activity.this, "Hãy nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }
}