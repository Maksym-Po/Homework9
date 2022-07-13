package com.company.car;

public class Car {

    private String marka;
    private String model;
    private int year;
    private Engine engine;
    private Transmission transmission;
    private Wheel[] wheels;

    public Car(String marka, String model, int year) {
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheel[] getWheel() {
        return wheels;
    }

    public void setWheel(Wheel[] wheels) {
        this.wheels = wheels;
    }
}
