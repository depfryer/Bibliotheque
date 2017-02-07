package com.maxime.leblond;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
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
                            AjoutDate("Date de parution"),
                            AjoutInt("Prix"),
                            AjoutStr("genre"));
                    break;
                case 2:
                    alex.creeBd(
                            AjoutStr("Titre"),
                            AjoutStr("auteur"),
                            AjoutDate("Date de parution"),
                            AjoutInt("Prix"),
                            AjoutStr("genre"),
                            AjoutStr("Dessinateur"));
                    break;
                case 3:
                    alex.creeManga(AjoutStr("Titre"),
                            AjoutStr("auteur"),
                            AjoutDate("Date de parution"),
                            AjoutInt("Prix"),
                            AjoutStr("genre"),
                            AjoutStr("Dessinateur"));
                    break;
                case 4:
                    System.out.printf( alex.toString());
                    System.out.printf(alex.details(AjoutInt("")));
                    break;
                default:
                    break;

            }
        System.out.printf( alex.toString());
        } while(choix != 0);
    }
    public static String AjoutStr(String demande){
        System.out.printf("\t"+demande+"\n\t -");
        while (true){
            try {
                return  new Scanner(System.in).next();
            }catch (Exception e){
                return AjoutStr(demande);
            }
        }
    }

    public static int AjoutInt(String demande){
        System.out.printf("\t"+demande+"\n\t -");
        while (true){
            try {
                return  new Scanner(System.in).nextInt();
            }catch (Exception e){
                return AjoutInt(demande);
            }
        }
    }

    public static Date AjoutDate(String demande) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mmm/yyyy");
        Date date2=null;
        while (true) {
            try {
                date2 = dateFormat.parse(AjoutStr(demande));
                return date2;
            } catch (Exception e) {
                return AjoutDate(demande);
            }
        }
    }
}
