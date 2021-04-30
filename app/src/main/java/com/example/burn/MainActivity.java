package com.example.burn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    ImageView imageView,image;
    LottieAnimationView lottieAnimationView;
    private static final int Page_num=3;
    private ViewPager viewPager;
    private ScreenSlideAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.logo);
        image=findViewById(R.id.imageView3);
        lottieAnimationView = findViewById(R.id.lottie);
        viewPager = findViewById(R.id.liquidpager);

        pagerAdapter = new ScreenSlideAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);


        imageView.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        image.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);


       /*new Timer().schedule(new TimerTask()
        {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),loginpage.class));
                finish();
            }
        },2000
        );*/

    }

    private class ScreenSlideAdapter extends FragmentStatePagerAdapter{


        public ScreenSlideAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }



        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    fragmentpage1 tab1=new fragmentpage1();
                    return tab1;
                case 1:
                    fragmentpage2 tab2=new fragmentpage2();
                    return tab2;
                case 2:
                    fragmentpage3 tab3=new fragmentpage3();
                    return tab3;

            }
            return null;
        }

        @Override
        public int getCount() {
            return Page_num;
        }
    }
}


/*<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#3E6866"
    tools:context=".MainActivity">

    <ImageView
        android:layout_width="350dp"
        android:layout_height="400dp"
        android:background="@drawable/finat"
        android:layout_centerInParent="true"
        android:alpha="1"
         />*/