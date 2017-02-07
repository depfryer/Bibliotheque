package com.maxime.leblond;

import java.util.Date;

/**
 * Created by duche on 07/02/2017.
 */
public class Bd extends Livre {


    public Bd(String titre, String auteur, Date dateParussion, int prix, String genre, String dessinateur) {
        super(titre, auteur, dateParussion, prix, genre);
        super.setDessinateur(dessinateur) ;
        
    }

    @Override
    public String toString() {
        super.toString();
        return getClass().getName()+" {" +
                "titre='" + titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                ", dateParussion='" + dateParussion + '\'' +
                ", prix=" + prix +
                ", genre='" + genre + '\'' +
                "Dessinateur='" + getDessinateur() + '\'' +
                '}';
    }

}
