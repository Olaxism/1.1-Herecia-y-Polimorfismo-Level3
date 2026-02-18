package Nivel1.exercise1;

import Nivel1.exercise1.classes.Instrument;
import Nivel1.exercise1.classes.PercussionInstrument;
import Nivel1.exercise1.classes.StringedInstrument;
import Nivel1.exercise1.classes.WindInstrument;

public class MainInstrument {

    public static void main(String[] args) {
        System.out.println("Comencemos a tocar");

        PercussionInstrument i1 = new PercussionInstrument("Xilofono", 150.75);
        WindInstrument i2 = new WindInstrument("Fagot", 120.90);
        StringedInstrument i3 = new StringedInstrument("Bajo", 284.99);

        i1.play();
        i3.play();
        i2.play();

        System.out.println("Comprobacion del metodo estatico desde un atributo de la clase." +
                " Solo la MARCA de los intrumentos es un atributo de la clase abstracta. " + Instrument.brand);
    }
}
