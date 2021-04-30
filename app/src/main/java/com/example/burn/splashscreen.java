package com.example.burn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class splashscreen extends AppCompatActivity {
    private RecyclerView recyclerView;
    private staticrvadapter staticrv;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        ArrayList<staticrvmodel> list = new ArrayList();
        list.add(new staticrvmodel(R.id.veggie,"Veggies"));
        list.add(new staticrvmodel(R.id.veggie,"Fruits"));
        list.add(new staticrvmodel(R.id.veggie,"Beverages"));
        list.add(new staticrvmodel(R.id.veggie,"Tips"));
        list.add(new staticrvmodel(R.id.veggie,"Health"));
        list.add(new staticrvmodel(R.id.veggie,"T0-DO"));

        recyclerView = findViewById(R.id.recyclerView2);
        staticrv= new staticrvadapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(staticrv);

        txt =  findViewById(R.id.helloadmin);
        Intent intent = getIntent();
        String username = intent.getStringExtra("admin");
        txt.setText(username);
    }



}