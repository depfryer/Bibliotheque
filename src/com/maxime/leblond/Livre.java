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
    String genre;
    String dessinateur;
    Bdd base = Bdd.getInstance();

    public String getTitre() {
        return titre;
    }

    public String getDessinateur() {
        return dessinateur;
    }

    public void setDessinateur(String dessinateur) {
        this.dessinateur = dessinateur;
    }

    @Override
    public String toString() {
        return "Livre{  " +
                "titre='" + titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                ", dateParussion='" + dateParussion + '\'' +
                ", prix=" + prix +
                ", genre='" + genre + '\'' +
                '}';
    }




    public Livre(String titre, String auteur, Date dateParussion, int prix, String genre) {
        this.titre = titre;
        Auteur = auteur;
        this.dateParussion = dateParussion;
        this.prix = prix;
        this.genre = genre;
    }

}
