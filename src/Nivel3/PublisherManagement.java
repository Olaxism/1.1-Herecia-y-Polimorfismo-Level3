package Nivel3;

import Nivel3.classes.FootballNews;
import Nivel3.classes.Redactor;
import Nivel3.classes.SportsPublisher;

import java.util.Scanner;

public class PublisherManagement {

    private static SportsPublisher sp = new SportsPublisher();
    private static Scanner sc = new Scanner(System.in);

    private static void introRedactor(){
        System.out.println("---Introducir Redactor---");
        System.out.println("\n Introduzca nombre: ");
        String name = sc.next();

        System.out.println("\n Introduzca DNI: ");
        String dni = sc.next();

        Redactor newRedactor = new Redactor(name, dni);
        sp.addRedactor(newRedactor);

        System.out.println("Nuevo redactor agregado");
    }

    private static void removeRedactor() {
        System.out.println("---Eliminar Redactor---");
        System.out.println("\n Introduzca DNI: ");
        String dni = sc.next();

        boolean found = false;
        for (int i = 0; i < sp.getRedactors().size(); i++) {
            if (sp.getRedactors().get(i).getDni().equalsIgnoreCase(dni)) {
                sp.getRedactors().remove(i);
                System.out.println("Redactor Eliminado");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Este DNI no pertenece a ninguno de nuestro redactores actuales");
        }
    }

    private static void addNewsToRedactor() {
        System.out.println("---Agregar noticia a un Redactor---");
        System.out.println("\nPor favor, teclee número del deporte de la noticia");
        System.out.println("1. Futbol");
        System.out.println("2. Baloncesto");
        System.out.println("3. Tenis");
        System.out.println("4. Formula 1");
        System.out.println("5. Motociclismo");

        int option = sc.nextInt();

        System.out.println("Titulo de la noticia: ");
        String title = sc.next();

        switch (option) {

            case 1:
                System.out.println("Competición: ");
                String competition = sc.next();

                System.out.println("Club: ");
                String club = sc.next();

                System.out.println("Jugador: ");
                String player = sc.next();

            FootballNews newFN = new FootballNews( title,);


        }
    }
}
