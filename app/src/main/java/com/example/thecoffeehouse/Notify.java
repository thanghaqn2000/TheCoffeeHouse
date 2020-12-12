package com.example.thecoffeehouse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Notify extends AppCompatActivity {

    ImageView imgClose_338, img_338;
    Button bt_338;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notify_action);

        imgClose_338 = findViewById(R.id.imageClose_338);
        imgClose_338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        bt_338 = findViewById(R.id.button_338);
        bt_338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        img_338 = findViewById(R.id.image);
        img_338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    void open() {
        Intent view_338 = new Intent(Notify.this, MainActivity.class);
        startActivity(view_338);
    }

    public void openDialog() {
        ExampleDialog exampleDialog_338 = new ExampleDialog();
        exampleDialog_338.show(getSupportFragmentManager(), "example dialog");
    }
}
