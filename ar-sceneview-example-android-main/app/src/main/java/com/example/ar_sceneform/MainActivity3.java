package com.example.ar_sceneform;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    // Method to open MainActivity2
    public void openMain2(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }

    // Method to open a website
    public void openMain4(View view) {
        startActivity(new Intent(this, ArActivity.class));
    }

}

