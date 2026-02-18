package Nivel1.exercise2.classes;

public class Car  {

    private static final String brand = "Toyota";
    private static String model;
    private final double power;
    private static String slowDown;
    private String acelerate;

    public Car () {
        this.power = 90.0;
    }

    public static String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public static String slowDown() {
        System.out.println("El vehiculo esta frenando");
        return slowDown;
    }

    public String acelerate() {
        System.out.println("El vehiculo esta acelerando");
        return acelerate;
    }

    @Override
    public String toString() {
        return "Vehiculo marca Toyota [Modelo= " + getModel()
                + "potencia= " + power + "]";
    }
}

