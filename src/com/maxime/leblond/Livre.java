package com.maxime.leblond;

import java.util.Date;

/**
 * Created by duche on 07/02/2017.
 */
public class Livre{
    String titre;
    String Auteur;
    Date dateParussion;
    int prix;
    String Genre;


    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Livre{  " +
                "titre='" + titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                ", dateParussion='" + dateParussion + '\'' +
                ", prix=" + prix +
                ", Genre='" + Genre + '\'' +
                '}';
    }




    public Livre(String titre, String auteur, Date dateParussion, int prix, String genre) {
        this.titre = titre;
        Auteur = auteur;
        this.dateParussion = dateParussion;
        this.prix = prix;
        Genre = genre;
    }

}
