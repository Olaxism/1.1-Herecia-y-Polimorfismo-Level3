package Nivel2.interfaces;

public interface Camera {

    default void takePic() {
        System.out.println("Se esta haciendo una foto");
    }
}
