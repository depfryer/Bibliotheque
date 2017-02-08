package com.maxime.leblond;

import javax.swing.*;
import java.awt.*;

/**
 * Created by duche on 08/02/2017.
 */
public class Menu extends JFrame{
    int size = 300;

    private JTabbedPane Tab;

    private JPanel grosContaineur;

    private JTextField titreField;

    private JTextField genreField;

    private JTextField auteurField;

    private JTextField dessinateurField;

    private JComboBox categorieField;

    private JTextField prixField;


    private JSpinner dateDay;
    private JSpinner dateMonth;
    private JSpinner dateyears;

    String[] val = new String[]{"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
    private JList liste ;


    public Menu(Biblio biblio) throws HeadlessException {
        super("yolo");


        setContentPane(grosContaineur);
        pack();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        DefaultListModel def = new DefaultListModel();
        for(int i  = 0 ; i<=biblio.DernierNum();i++){
            def.addElement(biblio.Titre(i));
        }
        liste.setModel(def);


        setPreferredSize(new Dimension(size, size));
        // on centre la fenêtre
        setLocationRelativeTo(null);
        setVisible(true);
    }




}
