package com.maxime.leblond;

import java.util.Date;

/**
 * Created by duche on 07/02/2017.
 */
public class Bd extends Livre {
    String Dessinateur;

    public Bd(String titre, String auteur, Date dateParussion, int prix, String genre, String dessinateur) {
        super(titre, auteur, dateParussion, prix, genre);
        Dessinateur = dessinateur;
    }

    @Override
    public String toString() {
        super.toString();
        return "Bd{" +
                "titre='" + titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                ", dateParussion='" + dateParussion + '\'' +
                ", prix=" + prix +
                ", Genre='" + Genre + '\'' +
                "Dessinateur='" + Dessinateur + '\'' +
                '}';
    }

}
