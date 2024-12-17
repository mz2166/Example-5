package com.example.example_5;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.pictures);

    }

    public void left_onclick(View v) {
        if (x == 0) {
            img.setImageResource(R.drawable.pic5);
            x = 4;
        } else if (x == 1) {
            img.setImageResource(R.drawable.pic1);
            x = 0;
        } else if (x == 2) {
            img.setImageResource(R.drawable.pic2);
            x = 1;
        } else if (x == 3) {
            img.setImageResource(R.drawable.pic3);
            x = 2;
        } else if (x == 4) {
            img.setImageResource(R.drawable.pic4);
            x = 3;
        }
    }

    public void right_onclick(View v) {
        if (x == 0) {
            img.setImageResource(R.drawable.pic1);
            x = 1;
        } else if (x == 1) {
            img.setImageResource(R.drawable.pic2);
            x = 2;
        } else if (x == 2) {
            img.setImageResource(R.drawable.pic3);
            x = 3;
        } else if (x == 3) {
            img.setImageResource(R.drawable.pic4);
            x = 4;
        } else if (x == 4) {
            img.setImageResource(R.drawable.pic5);
            x=0;
        }
    }
}