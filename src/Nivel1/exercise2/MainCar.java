package Nivel1.exercise2;

import Nivel1.exercise2.classes.Car;

public class MainCar {

    public static void main(String[] args) {

        System.out.println("\nVamos a probar Vehiculos");
        System.out.println("");

        Car v1 = new Car ();
        Car v2 = new Car ();

        v1.acelerate();
        Car.slowDown();
        v2.acelerate();
    }
}