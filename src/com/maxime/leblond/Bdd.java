package com.maxime.leblond;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by duche on 07/02/2017.
 */
public class Bdd {
    private Connection connexion;
    private HashMap<Integer, String> all = new HashMap<Integer, String>();
    String url = "jdbc:mysql://localhost:3306/livre";
    String utilisateur = "root";
    String motDePasse = "toor";

    private static Bdd ourInstance;

    static {
        try {
            ourInstance = new Bdd();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Bdd getInstance() {
        return ourInstance;
    }

    private Bdd() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.printf("reussi\n");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void AjoutBdd(Livre livre) throws SQLException {
        //Création d'un objet Statement

        Statement state = connexion.createStatement();

        //L'objet ResultSet contient le résultat de la requête SQL

        //state.executeUpdate("INSERT INTO `bouquin`( `type`, `titre`, `auteur`, `dateSortie`, `prix`, `genre`, `dessinateur`) VALUES ("+livre.PourLabdd()+") ");
    }

    public ResultSet RecupBdd() throws SQLException {
        //Création d'un objet Statement

        Statement state = connexion.createStatement();

        //L'objet ResultSet contient le résultat de la requête SQL

        ResultSet result = state.executeQuery("SELECT * FROM `bouquin`");


        return result;
    }
}
