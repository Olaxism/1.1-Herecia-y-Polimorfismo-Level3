package Nivel1.exercise1.classes;

public class StringedInstrument extends Instrument {

    public StringedInstrument(String name, double price) {
        super (name, price);
    }

    @Override
    public void play() {
        System.out.println("Se esta tocando un intrumento de cuerda");
    }
}
