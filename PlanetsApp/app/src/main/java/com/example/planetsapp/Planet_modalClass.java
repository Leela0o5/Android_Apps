package com.example.planetsapp;

public class Planet_modalClass {
    private String planetname;
    private String mooon;

    private int planetImage;

    public Planet_modalClass(String planetname,String moon,int planetImage) {
        this.planetname = planetname;
        this.mooon=moon;
        this.planetImage=planetImage;
    }

    public String getPlanetname() {
        return planetname;
    }

    public void setPlanetname(String planetname) {
        this.planetname = planetname;
    }

    public String getMooon() {
        return mooon;
    }

    public void setMooon(String mooon) {
        this.mooon = mooon;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}

