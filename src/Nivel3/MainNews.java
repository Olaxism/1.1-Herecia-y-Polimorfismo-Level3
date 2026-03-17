package Nivel3;

import Nivel3.classes.*;
import java.util.Scanner;

public class MainNews   {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.println("----REDACCION DE NOTICIAS DEPORTIVAS----");
            System.out.println("\n1. Salir");
            System.out.println("2. Introducir Redactor.");
            System.out.println("3. Eliminar Redactor.");
            System.out.println("4. Introducir noticia a un Redactor.");
            System.out.println("5. Eliminar noticia.");
            System.out.println("6. Mostrar todas las noticias de un Redactor.");
            System.out.println("7. Calcular puntuacion de una noticia.");
            System.out.println("8. Calcular precio de una noticia.");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Tenga buen dia.");
                    break;

                case 2:
                    PublisherManagement.introRedactor();
                    break;

                case 3:
                    PublisherManagement.removeRedactor();
                    break;

                case 4:
                    PublisherManagement.addNewsToRedactor();
                    break;

                case 5:
                    PublisherManagement.removeNewsFromRedactor();
                    break;

                case 6:
                    PublisherManagement.showRedactorAllNews();
                    break;

                case 7:
                    PublisherManagement.totalScoreNews();
                    break;

                case 8:
                    PublisherManagement.totalPriceNews();
                    break;

                default:
                    System.out.println("Opción no valida. Por favor, elija un numero del 1 al 8");
            }

        } while (option != 1);

        sc.close();
    }
}
