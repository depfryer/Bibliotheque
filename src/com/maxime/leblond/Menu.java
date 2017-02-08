package com.maxime.leblond;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
    private JLabel typeaffiche;


    public Menu(Biblio biblio) throws HeadlessException {
        super("yolo");


        setContentPane(grosContaineur);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel def = new DefaultListModel();
        for (int i = 0; i <= biblio.DernierNum(); i++) {
            def.addElement(biblio.Titre(i));
        }
        liste.setModel(def);


        setPreferredSize(new Dimension(size, size));
        // on centre la fenêtre
        setLocationRelativeTo(null);
        setVisible(true);

        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {

                typeaffiche.setText(liste.getSelectedIndices().toString());
                JList theList = (JList) mouseEvent.getSource();
                if (mouseEvent.getClickCount() >= 2) {
                    int selections[] = liste.getSelectedIndices();
                    for (int i = 0, n = selections.length; i < n; i++) {
                        if (i == 0) {
                            typeaffiche.setText("yolo");
                        }
                        //System.out.print(selections[i] + "/" + " ");
                    }
                }
            }
        };
    }


}
