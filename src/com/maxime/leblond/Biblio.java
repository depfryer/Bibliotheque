package com.maxime.leblond;

import java.util.ArrayList;

/**
 * Created by duche on 07/02/2017.
 */
public class Biblio {
    private ArrayList<Livre> biblio = new ArrayList<Livre>(0) ;


    public void creeLivre(String titre,String auteur,String dateParussion,int prix,String genre){
        this.biblio.add( new Livre(titre,auteur,dateParussion,prix,genre));
    }

    public void creeBd(String titre,String auteur,String dateParussion,int prix,String genre,String dessinateur){
        biblio.add(new Bd( titre, auteur, dateParussion, prix, genre,dessinateur));
    }
    public void creeManga(String titre,String auteur,String dateParussion,int prix,String genre,String dessinateur){
        biblio.add(new Manga( titre, auteur, dateParussion, prix, genre,dessinateur));
    }

    @Override
    public String toString() {
        String nope ="";
        int s =0;
        for (Livre val : biblio) {
            s++;
            nope += s+" . "+val.getTitre()+"\n";
        }
        return "Biblio{\n"+nope+"\n}";
    }

    public String details(int id){
        return biblio.get(id).toString();
    }
}