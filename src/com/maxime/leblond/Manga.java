package com.maxime.leblond;

import java.util.Date;

/**
 * Created by duche on 07/02/2017.
 */
public class Manga extends Bd{


    public Manga(String titre, String auteur, Date dateParussion, int prix, String genre, String dessinateur) {
        super(titre, auteur, dateParussion, prix, genre, dessinateur);
    }

    @Override
    public String toString() {
        super.toString();
        return "Manga {" +
                "titre='" + titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                ", dateParussion='" + dateParussion + '\'' +
                ", prix=" + prix +
                ", Genre='" + Genre + '\'' +
                "Dessinateur='" + Dessinateur + '\'' +
                '}';
    }
}
