package Nivel2.exercise1.interfaces;

public interface Watch {

    default void alarm() {
        System.out.println("Está sonando la alarma");
    }
}

