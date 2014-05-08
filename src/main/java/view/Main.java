package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Created by Abid on 02/05/2014.
 */
public class Main extends JFrame implements ActionListener {

    /**
     * @param args
     */

    private JTable tableCv;
    private DefaultTableModel modelCv;
    private JScrollPane scrollCv;

    private JButton ajouter, afficher, effacer;

    private NouveauCv cv;

    public Main(){
        super("WEB PrOject");
        // avant choisir le fichier et executer l'lagorithme setSize(600,150);
        setSize(900,730);
        this.setLayout(null);


        ajouter = new JButton("Ajouter");
        ajouter.addActionListener(this);
        ajouter.setBounds(780,70,80,20);//(liman,     ,lta7t)
        getContentPane().add(ajouter);

        afficher= new JButton("afficher");
        afficher.addActionListener(this);
        afficher.setBounds(780,100,80,20);//(liman,     ,lta7t)
        getContentPane().add(afficher);

        effacer = new JButton("effacer");
        effacer.addActionListener(this);
        effacer.setBounds(780,130,80,20);//(liman,     ,lta7t)
        getContentPane().add(effacer);

        modelCv = new DefaultTableModel(){
            @Override
            public Class<? extends Object> getColumnClass(int column){
                return (getValueAt(0, column).getClass());
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0;
            }
        };
        modelCv.addColumn("ID");

	  	/*
		for(Iterator<String[]> it = fileToArrayList.iterator();it.hasNext();)
	      {
			String[] ligne = it.next();
	    	modelFile.addRow(ligne);
	      }
	      */
        //16 est le largeur de chaque ligne
        //donc on initialise la dimension du table par 16 * nombre d'enregistrement dans la base de donnée
        tableCv= new JTable(modelCv);
        //tableCv.setPreferredSize(new Dimension(1000, 16*listeCv.size()));

        tableCv.setBounds(40,40,800,300);//(deplacement lateral, deplacement vericale, toul    ,3ard)

        //ajoute une barre de défilement à la table
        scrollCv= new JScrollPane(tableCv);
        scrollCv.setPreferredSize(new Dimension(200, 850));
        scrollCv.setBounds(40,40,200,600);//(deplacement lateral, deplacement vericale, toul    ,3ard)

        this.add(scrollCv);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Main main = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        Object source = evt.getSource();
        if(source == ajouter){
            cv = new NouveauCv();
        }

        if(source == afficher){

        }

        if(source == effacer){

        }

    }

}