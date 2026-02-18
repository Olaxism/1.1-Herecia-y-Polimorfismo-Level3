package Nivel1.exercise1.classes;

public abstract class Instrument {

    private String name;
    private double price;
    public static String brand;

    static{
        System.out.println("Bloque estatico ejecutado");
        brand = "JBL";
    }

    public Instrument (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void    play();

    @Override
    public String toString() {
        return "\nInstrumento {Nombre= " + getName() +
                ", Precio= " + getPrice() + " euros.}";}
}

