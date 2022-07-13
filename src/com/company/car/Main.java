package com.company.car;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine("1q13w", 2.0f, 200);
        Transmission transmission = new Transmission("asin", "12l7", 8);

        Wheel dunlop1 = new Wheel("Dunlop", "265/50", 19);
        Wheel dunlop2 = new Wheel("Dunlop", "265/50", 19);
        Wheel dunlop3 = new Wheel("Dunlop", "265/50", 19);
        Wheel dunlop4 = new Wheel("Dunlop", "265/50", 19);
        //Wheel[]wheels={dunlop3,dunlop1,dunlop4,dunlop2}
        Car car;
        car = new Car("bmw", "x3", 2022);
        car.setEngine(engine);
        car.setTransmission(transmission);
        car.setWheel(new Wheel[]{dunlop3, dunlop1, dunlop4, dunlop2});
    }

}