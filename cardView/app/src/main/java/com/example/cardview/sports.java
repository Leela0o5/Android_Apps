package com.example.cardview;

public class sports {
    private String sportname;
    private int sportImg;


    public sports(String sportname,int sportImg) {
        this.sportname = sportname;
        this.sportImg=sportImg;
    }

    public String getSportname() {
        return sportname;
    }

    public void setSportname(String sportname) {
        this.sportname = sportname;
    }

    public int getSportImg() {
        return sportImg;
    }

    public void setSportImg(int sportImg) {
        this.sportImg = sportImg;
    }
}
