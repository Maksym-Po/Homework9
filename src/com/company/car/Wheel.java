package com.company.car;

public class Wheel {
    private String name;
    private String volume;
    private int radius;

    public Wheel(String name, String volume, int radius) {
        this.name = name;
        this.volume = volume;
        this.radius = radius;
    }

    public Wheel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
