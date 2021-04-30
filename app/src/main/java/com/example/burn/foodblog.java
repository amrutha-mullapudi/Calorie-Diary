package com.example.burn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;

public class foodblog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodblog);
        configureimageview();
       // configureimageview1();
    }

    /*private void configureimageview1() {
        ImageView image = (ImageView) findViewById(R.id.lunch1);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodblog.this,circularprogress.class);
                startActivity(intent);
            }
        });
    }*/

    private void configureimageview() {
        ImageView image1 = (ImageView) findViewById(R.id.breakfast1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodblog.this,breakfast.class);
                startActivity(intent);
            }
        });
    }
}