package Nivel2.interfaces;

public interface Watch {

    default void alarm() {
        System.out.println("Está sonando la alarma");
    }
}

