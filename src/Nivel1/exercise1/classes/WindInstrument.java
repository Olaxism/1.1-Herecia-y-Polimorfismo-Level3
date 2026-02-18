package Nivel1.exercise1.classes;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, double price) {
        super (name, price);
    }

    @Override
    public void play() {
        System.out.println("Se esta tocando un intrumento de cuerda");
    }
}
