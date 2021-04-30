package com.example.burn;


import android.widget.ImageView;

public class example_item {
    private String string;
    private int image;
    private String string1;

    public example_item(String string, int image, String string1) {
        this.string = string;
        this.image = image;
        this.string1 = string1;
    }



    public String getStrng() {
        return string;
    }

    public int getImage1() {
        return image;
    }

    public String getString1() {
        return string1;
    }
}
