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

            choix = AjoutInt("");


            switch(choix){
                case 1:
                    alex.creeLivre(AjoutStr("Titre"),
                            AjoutStr("auteur"),
                            AjoutStr("Date de parution"),
                            AjoutInt("Prix"),
                            AjoutStr("Genre"));
                    break;
                case 2:
                    alex.creeBd(
                            AjoutStr("Titre"),
                            AjoutStr("auteur"),
                            AjoutStr("Date de parution"),
                            AjoutInt("Prix"),
                            AjoutStr("Genre"),
                            AjoutStr("Dessinateur"));
                    break;
                case 3:
                    alex.creeManga(AjoutStr("Titre"),
                            AjoutStr("auteur"),
                            AjoutStr("Date de parution"),
                            AjoutInt("Prix"),
                            AjoutStr("Genre"),
                            AjoutStr("Dessinateur"));
                    break;
                case 4:
                    System.out.printf( alex.toString());

                    System.out.printf(alex.details(AjoutInt("")));


            }
        System.out.printf( alex.toString());
        } while(choix != 0);
    }
    public static String AjoutStr(String demande){
        System.out.printf("\t"+demande+"\n\t -");
        return  new Scanner(System.in).next();
    }

    public static int AjoutInt(String demande){
        System.out.printf("\t"+demande+"\n\t -");
        return  new Scanner(System.in).nextInt();
    }
}
