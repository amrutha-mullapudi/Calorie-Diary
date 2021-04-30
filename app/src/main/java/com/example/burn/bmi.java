package com.example.burn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.widget.SeekBar.*;

public class bmi extends AppCompatActivity {
    SeekBar sb,sb1;
    TextView tv,tv1,resul;
    Button calculate;
    int x;
    int x1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);



        sb = findViewById(R.id.seekBar);
        tv = findViewById(R.id.stk1);
        sb1 = findViewById(R.id.seekBar1);
        tv1 = findViewById(R.id.stk2);
        resul = findViewById(R.id.result);
        calculate = findViewById(R.id.but1);



        calculate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorbmi();
            }
        });

        sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                tv.setText(progress+" ");
                x=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progres, boolean b) {
                tv1.setText(progres+" ");
                x1=progres;

            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    
    public void calculatorbmi() {
        int f1 = x;
        float floa = f1;
        int f2 = x1;
        float floa1 = f2;
        float f3 = ( floa1 / ((floa/100) * (floa/100)));
        displayBmi(f3,floa,floa1);
    }

    @SuppressLint("DefaultLocale")
    private void displayBmi(float f3,float floa,float floa1) {
        String bmilabel = "";
        if (floa==0 && floa1==0){
            bmilabel = "Invalid";
        }
        else if (f3 < 9) {
            bmilabel = " Severely Underweight ";
        }
        else if ((f3 >= 9) && (f3 <=18.5)){
            bmilabel = " UnderWeight ";
        }
        else if ((f3>18.5) && (f3<=24.9)){
            bmilabel = " Kudos! You are fit. ";
        }
        else if ((f3>=25) && (f3<=29.9)) {
            bmilabel = "Over-Weight";
        }
        else {
            bmilabel = "Obese";
        }

        String number;
        number = String.format("%.2f",f3);
        Float flo = Float.parseFloat(number);
        bmilabel = flo + "\n" + bmilabel;
        resul.setText(bmilabel);
    }
}