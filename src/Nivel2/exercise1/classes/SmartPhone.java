package Nivel2.exercise1.classes;

import Nivel2.exercise1.interfaces.Camera;
import Nivel2.exercise1.interfaces.Watch;

public class SmartPhone extends Phone implements Camera, Watch {

    public SmartPhone(String marca, String modelo, String numero) {
        super (marca, modelo, numero);
    }

    @Override
    public String toString() {
        return "Smartphone [Marca= " + getBrand()
                + ", Modelo= " + getModel() + ", Numero= " + getNumber() + "]";
    }

}
