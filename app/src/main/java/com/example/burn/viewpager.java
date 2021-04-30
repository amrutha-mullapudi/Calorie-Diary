package com.example.burn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class viewpager extends AppCompatActivity {

        ViewPager viewPager;
        adapterclass adapter;
        List<modelview> model;
        Integer[] colors = null;
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        model = new ArrayList<>();
        model.add(new modelview(R.drawable.brekfast, "Breakfast", "You should eat a hearty breakfast to boost your energy and mental focus in the morning."));
        model.add(new modelview(R.drawable.lunch1, "Lunch", "You should eat a hearty lunch to boost your energy and mental focus in the morning."));
        model.add(new modelview(R.drawable.dinner, "Dinner", "You should eat a hearty dinner to boost your energy and mental focus in the morning."));
        model.add(new modelview(R.drawable.other, "Other", "You should eat a other foods too,to boost your energy and mental focus in the morning."));

        adapter = new adapterclass(model, this);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(100, 0, 100, 0);

        Integer[] colour = {getResources().getColor(R.color.breakfast),
                getResources().getColor(R.color.lunch),
                getResources().getColor(R.color.dinner),
                getResources().getColor(R.color.other),
        };
        colors = colour;
        viewPager.setOffscreenPageLimit(500);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() - 1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset, colors[position], colors[position + 1]
                            )
                    );
                } else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }


        });
    }
}
