package Nivel2.exercise1.classes;

public abstract class Phone {

    private String brand;
    private String model;
    private String number;

    public Phone(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public String call(String numElegido) {
        System.out.println("Llamando al número: " + numElegido);
        return numElegido;
    }

    @Override
    public String toString() {
        return "Telefono [marca= " + getBrand() + ", modelo= " + getModel() + ", numero= " + getNumber() + "]";
    }
}