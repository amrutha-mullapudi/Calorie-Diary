package com.example.burn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import static com.example.burn.R.id.button_add;

public class breakfast extends AppCompatActivity {
    private RecyclerView myrecycler;
    private RecyclerView.Adapter myadapter;
    private RecyclerView.LayoutManager mylayout;
    private ImageButton plus;
    private EditText add_text;
    private SearchView mysearch;
    //private foodviehmodel foodviehmodel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        final ArrayList<example_item> exampleList = new ArrayList<>();

        exampleList.add(new example_item("Apple",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Orange",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Idli",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Poha",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Cereal",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Toast",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Milk",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Banana",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Pesarattu",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Bread",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Poached Egg",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Peanut Butter",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Avacado",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Bacon",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Berries",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Coffee",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Burrito",R.drawable.breakfastemoji,"30 calories"));
        exampleList.add(new example_item("Omlette",R.drawable.breakfastemoji,"30 calories"));

        plus = findViewById(button_add);
        add_text = (EditText) findViewById(R.id.breakedit);
        mysearch = (SearchView) findViewById(R.id.search1);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = add_text.getText().toString();
                additem(name);
            }

            private void additem(String name) {
                exampleList.add(new example_item(name,R.drawable.breakfastemoji,"30 calories"));
            }
        });


    }


}
