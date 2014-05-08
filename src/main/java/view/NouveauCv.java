package view;

import Rest.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.bind.JAXBException;


/**
 * Created by Abid on 02/05/2014.
 */

public class NouveauCv extends JFrame implements ActionListener{
    private JTextField id, nom, prenom, adresse, age,mail, tele, situation,loisir, titrre,  cdescription, cspecialite, edatedebut, edatefin, edescription, fdatedebut, fdatefin, diplome, lniveau, lnom, projet, pdescription;
    private JLabel linfoPerso,lformation,lexperience, lproject, Lcompetance,llangue, lloisir, lid, labelnom, lprenom, ladresse, lage, lmail, ltele, lsituation, ltitrre,  lcdescription, lcspecialite, ledatedebut, ledatefin, ledescription, lfdatedebut, lfdatefin, ldiplome, llniveau, llnom, lprojet, lpdescription;
    private JButton AjoutForma,AjoutExper, AjoutProjet,AjoutConn,AjoutLang, AjoutLoisir, enregistrer;
    ListFormation vlistFormation;
    ListExperiencePro vlisteExp;
    ListProjetRealiser vlisteProjet;
    ListConnaissanceTech vlisteConn;
    ListLangues vlisteLangue;
    ListLoisirs vlisteLoisir;

    public NouveauCv(){
        setSize(600,730);
        this.setLayout(null);

        linfoPerso = new JLabel("Information personnelle : ");
        linfoPerso.setBounds(10,10,150,20);
        getContentPane().add(linfoPerso);

        lid = new JLabel("Id : ");
        lid.setBounds(40,30,150,20);
        getContentPane().add(lid);

        labelnom = new JLabel("Nom : ");
        labelnom.setBounds(40,50,150,20);
        getContentPane().add(labelnom);

        lprenom = new JLabel("Prenom : ");
        lprenom.setBounds(40,70,150,20);
        getContentPane().add(lprenom);

        ladresse = new JLabel("Adresse : ");
        ladresse.setBounds(40,90,150,20);
        getContentPane().add(ladresse);

        lage = new JLabel("Age : ");
        lage.setBounds(40,110,150,20);
        getContentPane().add(lage);

        lmail = new JLabel("Email : ");
        lmail.setBounds(40,130,150,20);
        getContentPane().add(lmail);

        ltele = new JLabel("Telephone : ");
        ltele.setBounds(40,150,150,20);
        getContentPane().add(ltele);

        lsituation = new JLabel("Situation : ");
        lsituation.setBounds(40,170,150,20);
        getContentPane().add(lsituation);

        ltitrre = new JLabel("Titre : ");
        ltitrre.setBounds(40,190,150,20);
        getContentPane().add(ltitrre);



        lformation = new JLabel("Formation  : ");
        lformation.setBounds(10,210,150,20);
        getContentPane().add(lformation);

        lfdatedebut = new JLabel("Formation date debut : ");
        lfdatedebut.setBounds(40,230,150,20);
        getContentPane().add(lfdatedebut);

        lfdatefin = new JLabel("Formation date fin : ");
        lfdatefin.setBounds(40,250,150,20);
        getContentPane().add(lfdatefin);

        ldiplome = new JLabel("Diplome  : ");
        ldiplome.setBounds(40,270,150,20);
        getContentPane().add(ldiplome);



        lexperience = new JLabel("Expérience professionnelle : ");
        lexperience.setBounds(10,290,150,20);
        getContentPane().add(lexperience);

        ledatedebut = new JLabel(" Expériences date début : ");
        ledatedebut.setBounds(40,310,150,20);
        getContentPane().add(ledatedebut);

        ledatefin = new JLabel("Experience date fin : ");
        ledatefin.setBounds(40,330,150,20);
        getContentPane().add(ledatefin);


        ledescription = new JLabel("Description : ");
        ledescription.setBounds(40,350,150,20);
        getContentPane().add(ledescription);

        lproject = new JLabel("Projet Réalisés  : ");
        lproject.setBounds(10,370,150,20);
        getContentPane().add(lproject);

        lprojet = new JLabel("Projet : ");
        lprojet.setBounds(40,390,150,20);
        getContentPane().add(lprojet);

        lpdescription = new JLabel("Description: ");
        lpdescription.setBounds(40,410,150,20);
        getContentPane().add(lpdescription);

        Lcompetance = new JLabel("Connaissance techniques  : ");
        Lcompetance.setBounds(10,430,150,20);
        getContentPane().add(Lcompetance);

        lcdescription = new JLabel("Compétence description : ");
        lcdescription.setBounds(40,450,150,20);
        getContentPane().add(lcdescription);

        lcspecialite = new JLabel("Compétence specialite : ");
        lcspecialite.setBounds(40,470,150,20);
        getContentPane().add(lcspecialite);

        llangue = new JLabel("Langues : ");
        llangue.setBounds(10,490,150,20);
        getContentPane().add(llangue);

        llnom = new JLabel("Langue nom : ");
        llnom.setBounds(40,510,150,20);
        getContentPane().add(llnom);

        llniveau = new JLabel("Langue niveau : ");
        llniveau.setBounds(40,530,150,20);
        getContentPane().add(llniveau);

        lloisir = new JLabel("Loisirs  : ");
        lloisir.setBounds(10,560,150,20);
        getContentPane().add(lloisir);


        /************ text field **********/


        id = new JTextField();
        id.setBounds(250,30,150,20);
        getContentPane().add(id);

        nom = new JTextField();
        nom.setBounds(250,50,150,20);
        getContentPane().add(nom);

        prenom = new JTextField();
        prenom.setBounds(250,70,150,20);
        getContentPane().add(prenom);

        adresse = new JTextField();
        adresse.setBounds(250,90,150,20);
        getContentPane().add(adresse);

        age = new JTextField();
        age.setBounds(250,110,150,20);
        getContentPane().add(age);

        mail = new JTextField();
        mail.setBounds(250,130,150,20);
        getContentPane().add(mail);

        tele = new JTextField();
        tele.setBounds(250,150,150,20);
        getContentPane().add(tele);

        situation = new JTextField();
        situation.setBounds(250,170,150,20);
        getContentPane().add(situation);

        titrre = new JTextField();
        titrre.setBounds(250,190,150,20);
        getContentPane().add(titrre);


        /************************************/


        fdatedebut = new JTextField();
        fdatedebut.setBounds(250,230,150,20);
        getContentPane().add(fdatedebut);

        fdatefin = new JTextField();
        fdatefin.setBounds(250,250,150,20);
        getContentPane().add(fdatefin);

        diplome = new JTextField();
        diplome.setBounds(250,270,150,20);
        getContentPane().add(diplome);

        AjoutForma = new JButton("Ajouter");
        AjoutForma.addActionListener(this);
        AjoutForma.setBounds(420,250,100,20);
        getContentPane().add(AjoutForma);


        /************************************/


        edatedebut = new JTextField();
        edatedebut.setBounds(250,310,150,20);
        getContentPane().add(edatedebut);

        edatefin = new JTextField();
        edatefin.setBounds(250,330,150,20);
        getContentPane().add(edatefin);

        edescription = new JTextField();
        edescription.setBounds(250,350,150,20);
        getContentPane().add(edescription);

        AjoutExper = new JButton("Ajouter");
        AjoutExper.addActionListener(this);
        AjoutExper.setBounds(420,330,100,20);
        getContentPane().add(AjoutExper);


        /************************************/


        projet = new JTextField();
        projet.setBounds(250,390,150,20);
        getContentPane().add(projet);

        pdescription = new JTextField();
        pdescription.setBounds(250,410,150,20);
        getContentPane().add(pdescription);

        AjoutProjet = new JButton("Ajouter");
        AjoutProjet.addActionListener(this);
        AjoutProjet.setBounds(420,400,100,20);
        getContentPane().add(AjoutProjet);

        /************************************/


        cdescription = new JTextField();
        cdescription.setBounds(250,450,150,20);
        getContentPane().add(cdescription);

        cspecialite = new JTextField();
        cspecialite.setBounds(250,470,150,20);
        getContentPane().add(cspecialite);

        AjoutConn = new JButton("Ajouter");
        AjoutConn.addActionListener(this);
        AjoutConn.setBounds(420,460,100,20);
        getContentPane().add(AjoutConn);

        /************************************/

        lnom = new JTextField();
        lnom.setBounds(250,510,150,20);
        getContentPane().add(lnom);

        lniveau = new JTextField();
        lniveau.setBounds(250,530,150,20);
        getContentPane().add(lniveau);

        AjoutLang = new JButton("Ajouter");
        AjoutLang.addActionListener(this);
        AjoutLang.setBounds(420,520,100,20);
        getContentPane().add(AjoutLang);

        /************************************/

        loisir = new JTextField();
        loisir.setBounds(250,560,150,20);
        getContentPane().add(loisir);

        AjoutLoisir = new JButton("Ajouter");
        AjoutLoisir.addActionListener(this);
        AjoutLoisir.setBounds(420,560,100,20);
        getContentPane().add(AjoutLoisir);

        /************************************/

        enregistrer = new JButton("Enregistrer");
        enregistrer.addActionListener(this);
        enregistrer.setBounds(40,620,150,20);
        getContentPane().add(enregistrer);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub

        Object source = evt.getSource();

        if(source == AjoutForma){

            String vfdatedebut = fdatedebut.getText();
            String vfdatefin = fdatefin.getText();
            String vdiplome = diplome.getText();

            vlistFormation = new ListFormation();
            vlistFormation.getFormation().add(new Formation(vfdatedebut, vfdatefin, vdiplome ));

            fdatedebut.setText("");
            fdatefin.setText("");
            diplome.setText("");
        }

        if(source == AjoutExper){

            String vedatedebut = edatedebut.getText();
            String vedatefin = edatefin.getText();
            String vedescription = edescription.getText();


            vlisteExp = new ListExperiencePro();
            vlisteExp.getExperience().add(new ExperiencePro(vedatedebut, vedatefin, vedescription ));

            edatedebut.setText("");
            edatefin.setText("");
            edescription.setText("");
        }


        if(source == AjoutProjet){

            String vprojet = projet.getText();
            String vprodescription = pdescription.getText();


            vlisteProjet = new ListProjetRealiser();
            vlisteProjet.getProjet().add(new ProjetRealiser(vprojet, vprodescription ));

            projet.setText("");
            pdescription.setText("");
        }


        if(source == AjoutConn){

            String vcescription = cdescription.getText();
            String vspecialite = cspecialite.getText();


            vlisteConn = new ListConnaissanceTech();
            vlisteConn.getConnaissance().add(new ConnaissanceTech(vcescription, vspecialite ));

            cdescription.setText("");
            cspecialite.setText("");
        }


        if(source == AjoutLang){

            String vlnom = lnom.getText();
            String vlniveau = lniveau.getText();

            vlisteLangue = new ListLangues();
            vlisteLangue.getLangue().add(new Langues(vlnom, vlniveau ));

            lnom.setText("");
            lniveau.setText("");
        }

        if(source == AjoutLoisir){

            String vloisir = loisir.getText();

            vlisteLoisir = new ListLoisirs();
            vlisteLoisir.getLoisirs().add(vloisir);

            loisir.setText("");
        }

        if(source == enregistrer){
            String vid =id.getText(); int viid = Integer.parseInt(vid);
            String vnom = nom.getText();
            String vprenom = prenom.getText();
            String vadresse = adresse.getText();
            String vage = age.getText();
            String vmail = mail.getText();
            String vtele = tele.getText();
            String vsituation = situation.getText();
            String vtitre = titrre.getText();


            Curriculum resume1 = new Curriculum(viid, vnom, vprenom, vadresse,vtele,vage,vsituation,vmail,vtitre, vlistFormation,
                    vlisteExp,vlisteProjet, vlisteConn,vlisteLangue,vlisteLoisir);
            try {
                new RequetPut().addResume(resume1);
            } catch (JAXBException e) {
                e.printStackTrace();
            }


            this.setVisible(false);
        }
    }
}
