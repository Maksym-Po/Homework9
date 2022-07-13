package com.company.car;


public class Engine {
    private String index;
    private float volume;
    private int power;

    public Engine(String index, float volume, int power) {
        this.index = index;
        this.volume = volume;
        this.power = power;
    }

    public Engine() {
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}