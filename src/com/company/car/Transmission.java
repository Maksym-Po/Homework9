package com.company.car;

public class Transmission {
    private String brand;
    private String index;
    private int gear;

    public Transmission(String brend, String index, int gear) {
        this.brand = brend;
        this.index = index;
        this.gear = gear;
    }

    public Transmission() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrend(String brend) {
        this.brand = brand;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
