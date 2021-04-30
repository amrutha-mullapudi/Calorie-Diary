package com.example.burn;

public class modelview {
    private int image;
    private String title;
    private String textbox;

    public modelview(int image, String title, String textbox) {
        this.image = image;
        this.title = title;
        this.textbox = textbox;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getTextbox() {
        return textbox;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTextbox(String textbox) {
        this.textbox = textbox;
    }
}
