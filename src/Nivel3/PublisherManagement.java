package Nivel3;

import Nivel3.classes.*;

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

        Redactor foundRedactor = null;

        do {
            System.out.println("\nIntroduzca el DNI del Redactor quien cubrirá la noticia");
            String dni = sc.next();

            for (int i = 0; i < sp.getRedactors().size(); i++) {
                if (sp.getRedactors().get(i).getDni().equalsIgnoreCase(dni)) {
                    foundRedactor = sp.getRedactors().get(i);
                    System.out.println("Redactor Encontrado");
                    break;
                }
            }
            if (foundRedactor == null) {
                System.out.println("Este DNI no pertenece a ninguno de nuestro redactores actuales");
            }
        }    while (foundRedactor == null);

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

            FootballNews newFN = new FootballNews( title, competition, club, player);
            foundRedactor.addToMyNews(newFN);

            case 2:
                System.out.println("Competición: ");
                String competition2 = sc.next();

                System.out.println("Club: ");
                String club2 = sc.next();

            BasketballNews newBN = new BasketballNews (title, competition2, club2);
            foundRedactor.addToMyNews(newBN);

            case 3:
                System.out.println("Competición: ");
                String competition3 = sc.next();

                System.out.println("Jugadores: ");
                String players = sc.next();

            TenisNews newTN = new TenisNews (title, competition3, players);
            foundRedactor.addToMyNews(newTN);

            case 4:
                System.out.println("Escuderia: ");
                String squad = sc.next();

            F1News newF1N = new F1News (title, squad);
            foundRedactor.addToMyNews(newF1N);

            case 5:
                System.out.println("Equipo: ");
                String team = sc.next();

            MotoNews newMN = new MotoNews (title, team);
            foundRedactor.addToMyNews(newMN);

        }

        System.out.println("Noticia agregada a Redactor: " + foundRedactor.getName());
    }

    private static void removeNewsFromRedactor() {
        System.out.println("---Eliminar Noticia de un Redactor---");

        Redactor foundRedactor = null;

        do {
            System.out.println("\nIntroduzca el DNI del Redactor");
            String dni = sc.next();

            for (int i = 0; i < sp.getRedactors().size(); i++) {
                if (sp.getRedactors().get(i).getDni().equalsIgnoreCase(dni)) {
                    foundRedactor = sp.getRedactors().get(i);
                    System.out.println("Redactor Encontrado");
                    break;
                }
            }
            if (foundRedactor == null) {
                System.out.println("Este DNI no pertenece a ninguno de nuestro redactores actuales");
            }

        }while (foundRedactor == null);

        News foundNews = null;

        do {
            System.out.println("\n Por favor, Introduzca el titulo de la noticia que desea eliminar: ");
            String title = sc.next();

            for (News n : foundRedactor.getMyNews()) {
                if ( n.getTitle().equalsIgnoreCase(title)) {
                     foundNews = n;
                     break;
                }
            }

            if (foundNews == null) {

                System.out.println("No se encontró ninguna noticia con este titular.");
                System.out.println("Intentelo de nuevo.");
            }

        } while (foundNews == null);

        foundRedactor.removeNews(foundNews.getTitle());
        System.out.println("\nNoticia con titulo " + foundNews.getTitle() +
                " ha sido eliminada del Redactor: " + foundRedactor.getName());

    }

    private static void showRedactorAllNews() {
        System.out.println("---Mostrar todas las noticias de un Redactor---");

        Redactor foundRedactor = null;

        do {
            System.out.println("\nIntroduzca el DNI del Redactor");
            String dni = sc.next();

            for (int i = 0; i < sp.getRedactors().size(); i++) {
                if (sp.getRedactors().get(i).getDni().equalsIgnoreCase(dni)) {
                    foundRedactor = sp.getRedactors().get(i);
                    System.out.println("Redactor Encontrado");
                    break;
                }
            }
            if (foundRedactor == null) {
                System.out.println("Este DNI no pertenece a ninguno de nuestro redactores actuales");
            }
        }    while (foundRedactor == null);

        System.out.println("Estas son todas las noticias que estan bajo el Redactor: " + foundRedactor.getName());
        System.out.println(foundRedactor.getMyNews());

        }

    private static void totalScoreNews() {
        System.out.println("---Mostrar puntuación de una noticia---");

        Redactor foundRedactor = null;

        do {
            System.out.println("\nIntroduzca el DNI del Redactor que tiene la noticia");
            String dni = sc.next();

            for (int i = 0; i < sp.getRedactors().size(); i++) {
                if (sp.getRedactors().get(i).getDni().equalsIgnoreCase(dni)) {
                    foundRedactor = sp.getRedactors().get(i);
                    System.out.println("Redactor Encontrado");
                    break;
                }
            }
            if (foundRedactor == null) {
                System.out.println("Este DNI no pertenece a ninguno de nuestro redactores actuales");
            }
        }    while (foundRedactor == null);

        News foundNews = null;

        do {
            System.out.println("\n Por favor, Introduzca el titulo de la noticia: ");
            String title = sc.next();

            for (News n : foundRedactor.getMyNews()) {
                if ( n.getTitle().equalsIgnoreCase(title)) {
                    foundNews = n;
                    break;
                }
            }

            if (foundNews == null) {

                System.out.println("No se encontró ninguna noticia con este titular.");
                System.out.println("Intentelo de nuevo.");
            }

        } while (foundNews == null);

        System.out.println("La puntuacion total de la noticia con titulo: " + foundNews.getTitle() + " es: ");
        System.out.println(foundNews.getScore());

    }

    private static void totalPriceNews() {
        System.out.println("---Mostrar precio de una noticia---");

        Redactor foundRedactor = null;

        do {
            System.out.println("\nIntroduzca el DNI del Redactor que tiene la noticia");
            String dni = sc.next();

            for (int i = 0; i < sp.getRedactors().size(); i++) {
                if (sp.getRedactors().get(i).getDni().equalsIgnoreCase(dni)) {
                    foundRedactor = sp.getRedactors().get(i);
                    System.out.println("Redactor Encontrado");
                    break;
                }
            }
            if (foundRedactor == null) {
                System.out.println("Este DNI no pertenece a ninguno de nuestro redactores actuales");
            }
        }    while (foundRedactor == null);

        News foundNews = null;

        do {
            System.out.println("\n Por favor, Introduzca el titulo de la noticia: ");
            String title = sc.next();

            for (News n : foundRedactor.getMyNews()) {
                if ( n.getTitle().equalsIgnoreCase(title)) {
                    foundNews = n;
                    break;
                }
            }

            if (foundNews == null) {

                System.out.println("No se encontró ninguna noticia con este titular.");
                System.out.println("Intentelo de nuevo.");
            }

        } while (foundNews == null);

        System.out.println("El precio total de la noticia con titulo: " + foundNews.getTitle() + " es: ");
        System.out.println(foundNews.getPrice());
    }
}
