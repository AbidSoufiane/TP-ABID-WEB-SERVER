package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 * Created by Abid on 02/05/2014.
 */
public class NouveauCv extends JFrame implements ActionListener{
    private JTextField id, nom, prenom, adresse, age,mail, tele, situation, titrre,  cdescription, cspecialite, edatedebut, edatefin, edescription, fdatedebut, fdatefin, diplome, lniveau, lnom, projet, pdescription;
    private JLabel lid, labelnom, lprenom, ladresse, lage, lmail, ltele, lsituation, ltitrre,  lcdescription, lcspecialite, ledatedebut, ledatefin, ledescription, lfdatedebut, lfdatefin, ldiplome, llniveau, llnom, lprojet, lpdescription;
    private JButton enregistrer;

    public NouveauCv(){
        setSize(500,730);
        this.setLayout(null);

        lid = new JLabel("Id : ");
        lid.setBounds(40,15,150,20);//(liman,     ,lta7t)
        getContentPane().add(lid);

        labelnom = new JLabel("Nom : ");
        labelnom.setBounds(40,15,150,20);//(liman,     ,lta7t)
        getContentPane().add(labelnom);

        lprenom = new JLabel("Prenom : ");
        lprenom.setBounds(40,40,150,20);//(liman,     ,lta7t)
        getContentPane().add(lprenom);

        ladresse = new JLabel("Adresse : ");
        ladresse.setBounds(40,65,150,20);//(liman,     ,lta7t)
        getContentPane().add(ladresse);

        lage = new JLabel("Age : ");
        lage.setBounds(40,90,150,20);//(liman,     ,lta7t)
        getContentPane().add(lage);

        lmail = new JLabel("Email : ");
        lmail.setBounds(40,115,150,20);//(liman,     ,lta7t)
        getContentPane().add(lmail);

        ltele = new JLabel("Tele : ");
        ltele.setBounds(40,140,150,20);//(liman,     ,lta7t)
        getContentPane().add(ltele);

        lsituation = new JLabel("Situation : ");
        lsituation.setBounds(40,165,150,20);//(liman,     ,lta7t)
        getContentPane().add(lsituation);

        ltitrre = new JLabel("Titrre : ");
        ltitrre.setBounds(40,190,150,20);//(liman,     ,lta7t)
        getContentPane().add(ltitrre);

        lcdescription = new JLabel("Compétence description : ");
        lcdescription.setBounds(40,225,150,20);//(liman,     ,lta7t)
        getContentPane().add(lcdescription);

        lcspecialite = new JLabel("Compétence specialite : ");
        lcspecialite.setBounds(40,250,150,20);//(liman,     ,lta7t)
        getContentPane().add(lcspecialite);


        ledatedebut = new JLabel("Experience C: ");
        ledatedebut.setBounds(40,285,150,20);//(liman,     ,lta7t)
        getContentPane().add(ledatedebut);

        ledatefin = new JLabel("Experience date fin : ");
        ledatefin.setBounds(40,310,150,20);//(liman,     ,lta7t)
        getContentPane().add(ledatefin);


        ledescription = new JLabel("Experience description : ");
        ledescription.setBounds(40,335,150,20);//(liman,     ,lta7t)
        getContentPane().add(ledescription);

        lfdatedebut = new JLabel("Formation date debut : ");
        lfdatedebut.setBounds(40,370,150,20);//(liman,     ,lta7t)
        getContentPane().add(lfdatedebut);

        lfdatefin = new JLabel("Formation date fin : ");
        lfdatefin.setBounds(40,395,150,20);//(liman,     ,lta7t)
        getContentPane().add(lfdatefin);

        ldiplome = new JLabel("Diplome  : ");
        ldiplome.setBounds(40,420,150,20);//(liman,     ,lta7t)
        getContentPane().add(ldiplome);

        llnom = new JLabel("Langue nom : ");
        llnom.setBounds(40,455,150,20);//(liman,     ,lta7t)
        getContentPane().add(llnom);

        llniveau = new JLabel("Langue niveau : ");
        llniveau.setBounds(40,480,150,20);//(liman,     ,lta7t)
        getContentPane().add(llniveau);

        lprojet = new JLabel("Projet : ");
        lprojet.setBounds(40,515,150,20);//(liman,     ,lta7t)
        getContentPane().add(lprojet);

        lpdescription = new JLabel("Description: ");
        lpdescription.setBounds(40,540,150,20);//(liman,     ,lta7t)
        getContentPane().add(lpdescription);

        /************ text field **********/


        id = new JTextField();
        id.setBounds(250,15,150,20);//(liman,     ,lta7t)
        getContentPane().add(id);

        nom = new JTextField();
        nom.setBounds(250,15,150,20);//(liman,     ,lta7t)
        getContentPane().add(nom);

        prenom = new JTextField();
        prenom.setBounds(250,40,150,20);//(liman,     ,lta7t)
        getContentPane().add(prenom);

        adresse = new JTextField();
        adresse.setBounds(250,65,150,20);//(liman,     ,lta7t)
        getContentPane().add(adresse);

        age = new JTextField();
        age.setBounds(250,90,150,20);//(liman,     ,lta7t)
        getContentPane().add(age);

        mail = new JTextField();
        mail.setBounds(250,115,150,20);//(liman,     ,lta7t)
        getContentPane().add(mail);

        tele = new JTextField();
        tele.setBounds(250,140,150,20);//(liman,     ,lta7t)
        getContentPane().add(tele);

        situation = new JTextField();
        situation.setBounds(250,165,150,20);//(liman,     ,lta7t)
        getContentPane().add(situation);

        titrre = new JTextField();
        titrre.setBounds(250,190,150,20);//(liman,     ,lta7t)
        getContentPane().add(titrre);

        cdescription = new JTextField();
        cdescription.setBounds(250,225,150,20);//(liman,     ,lta7t)
        getContentPane().add(cdescription);

        cspecialite = new JTextField();
        cspecialite.setBounds(250,250,150,20);//(liman,     ,lta7t)
        getContentPane().add(cspecialite);


        edatedebut = new JTextField();
        edatedebut.setBounds(250,285,150,20);//(liman,     ,lta7t)
        getContentPane().add(edatedebut);

        edatefin = new JTextField();
        edatefin.setBounds(250,310,150,20);//(liman,     ,lta7t)
        getContentPane().add(edatefin);


        edescription = new JTextField();
        edescription.setBounds(250,335,150,20);//(liman,     ,lta7t)
        getContentPane().add(edescription);

        fdatedebut = new JTextField();
        fdatedebut.setBounds(250,370,150,20);//(liman,     ,lta7t)
        getContentPane().add(fdatedebut);

        fdatefin = new JTextField();
        fdatefin.setBounds(250,395,150,20);//(liman,     ,lta7t)
        getContentPane().add(fdatefin);

        diplome = new JTextField();
        diplome.setBounds(250,420,150,20);//(liman,     ,lta7t)
        getContentPane().add(diplome);

        lnom = new JTextField();
        lnom.setBounds(250,455,150,20);//(liman,     ,lta7t)
        getContentPane().add(lnom);

        lniveau = new JTextField();
        lniveau.setBounds(250,480,150,20);//(liman,     ,lta7t)
        getContentPane().add(lniveau);

        projet = new JTextField();
        projet.setBounds(250,515,150,20);//(liman,     ,lta7t)
        getContentPane().add(projet);

        pdescription = new JTextField();
        pdescription.setBounds(250,540,150,20);//(liman,     ,lta7t)
        getContentPane().add(pdescription);


        /************************************/

        enregistrer = new JButton("Enregistrer");
        enregistrer.addActionListener(this);
        enregistrer.setBounds(40,620,150,20);//(liman,     ,lta7t)
        getContentPane().add(enregistrer);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub

        Object source = evt.getSource();
        if(source == enregistrer){
            String vnom = nom.getText();
            this.setVisible(false);
        }
    }
}
