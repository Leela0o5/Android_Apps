package com.example.volumecalculator;

public class Shape_modalclass {
    private String textview;
    private int imageview;

    public Shape_modalclass(int imageview,String textview) {
        this.textview=textview;
        this.imageview=imageview;
    }

    public String getTextview() {
        return textview;
    }

    public void setTextview(String textview) {
        this.textview = textview;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }
}
