package com.maxime.leblond;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.maxime.leblond.Main.AjoutStr;

/**
 * Created by duche on 07/02/2017.
 */
public class Biblio {
    private ArrayList<Livre> biblio = new ArrayList<Livre>(0) ;


    public void creeLivre(String titre, String auteur, Date dateParussion, int prix, String genre){
        this.biblio.add( new Livre(titre,auteur,dateParussion,prix,genre));
    }

    public void creeBd(String titre, String auteur, Date dateParussion, int prix, String genre, String dessinateur){
        biblio.add(new Bd( titre, auteur, dateParussion, prix, genre,dessinateur));
    }
    public void creeManga(String titre, String auteur, Date dateParussion, int prix, String genre, String dessinateur){
        biblio.add(new Manga( titre, auteur, dateParussion, prix, genre,dessinateur));
    }

    @Override
    public String toString() {
        String nope ="";
        int s =0;
        for (Livre val : biblio) {

            nope += s+" . "+val.getTitre()+"\n";
            s++;
        }
        return "\nBiblio{\n"+nope+"\n}";
    }

    public String details(int id){
        return biblio.get(id).toString();
    }

    public Livre Dernierlivre(){
       return biblio.get(biblio.size()-1);
    }

    public void RecupLivre(Bdd base){
        ResultSet livre=null;
        try{
            livre = base.RecupBdd();

            while (livre.next()){

                switch (livre.getObject(2).toString()){
                    case "Livre":
                        creeLivre(livre.getObject(3).toString(),livre.getObject(4).toString(),SqlVersJava(livre.getObject(5).toString()),Integer.parseInt(livre.getObject(6).toString()),livre.getObject(7).toString());
                        break;
                    case "Bd":
                        creeBd(livre.getObject(3).toString(),livre.getObject(4).toString(),SqlVersJava(livre.getObject(5).toString()),Integer.parseInt(livre.getObject(6).toString()),livre.getObject(7).toString(),livre.getObject(8).toString());
                        break;
                    case "Manga":
                        creeManga(livre.getObject(3).toString(),livre.getObject(4).toString(),SqlVersJava(livre.getObject(5).toString()),Integer.parseInt(livre.getObject(6).toString()),livre.getObject(7).toString(),livre.getObject(8).toString());
                        break;
                }




            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Date SqlVersJava(String dateAConvertir){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date2=null;
        try {
            date2 = dateFormat.parse(dateAConvertir);
            return date2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
