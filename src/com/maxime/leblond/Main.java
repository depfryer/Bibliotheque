package com.maxime.leblond;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.printf("yolo");
    Biblio alex = new Biblio();

        int choix;
        do{
            System.out.println("\n\n----MENU----");
            System.out.println("0. Quitter");
            System.out.println("1. ajout Livre");
            System.out.println("2. ajout Bd");
            System.out.println("3. ajout Manga");
            System.out.println("4. Details Livre");

            choix = new Scanner(System.in).nextInt();


            switch(choix){
                case 1:
                    alex.creeLivre("moi","moi","02-08-97",choix,"Fantastique");
                    break;
                case 2:
                    alex.creeBd("mapoi","moi","02-08-97",choix,"Fantastique","pasmoi");
                    break;
                case 3:
                    alex.creeManga("pasmao","moi","02-08-97",choix,"Fantastique","pasmoi");
                    break;
                case 4:
                    System.out.printf( alex.toString());
                    int decide = new Scanner(System.in).nextInt();
                    System.out.printf(alex.details(decide));


            }
        System.out.printf( alex.toString());
        } while(choix != 0);
    }
}
