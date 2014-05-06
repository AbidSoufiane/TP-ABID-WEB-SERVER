package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Abid on 02/05/2014.
 */


@XmlRootElement(name = "Curriculum")
@XmlType(propOrder = {"nom","prenom","adresse","numerotele","age","situation","mail","titre","formations","experiencespro","projetrealises","connaissances","langues","loisirs"})
public class Curriculum {
    private String nom;
    private String prenom;
    private String adresse;
    private String numerotele;
    private String age;
    private String situation;
    private String mail;
    private String titre;

    private ListFormation formations;
    private ListExperiencePro experiencespro;
    private ListProjetRealiser projetrealises;
    private ListConnaissanceTech connaissances;
    private ListLangues langues;
    private ListLoisirs loisirs;

    public Curriculum(String nom, String prenom, String adresse, String numerotele, String age, String situation, String mail, String titre, ListFormation formations, ListExperiencePro experiencespro, ListProjetRealiser projetrealises, ListConnaissanceTech connaissances, ListLangues langues, ListLoisirs loisirs) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numerotele = numerotele;
        this.age = age;
        this.situation = situation;
        this.mail = mail;
        this.titre = titre;
        this.formations = formations;
        this.experiencespro = experiencespro;
        this.projetrealises = projetrealises;
        this.connaissances = connaissances;
        this.langues = langues;
        this.loisirs = loisirs;
    }

    public Curriculum(){
        formations = new ListFormation();
        experiencespro= new ListExperiencePro();
        projetrealises= new ListProjetRealiser();
        connaissances= new ListConnaissanceTech();
        langues= new ListLangues();
    }

    @XmlElement
    public String getNumerotele() {
        return numerotele;
    }

    public void setNumerotele(String numerotele) {
        this.numerotele = numerotele;
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlElement
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @XmlElement
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @XmlElement
    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    @XmlElement
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @XmlElement
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @XmlElement
    public ListFormation getFormations() {
        return formations;
    }

    public void setFormations(ListFormation formations) {
        this.formations = formations;
    }

    @XmlElement
    public ListExperiencePro getExperiencespro() {
        return experiencespro;
    }

    public void setExperiencespro(ListExperiencePro experiencespro) {
        this.experiencespro = experiencespro;
    }

    @XmlElement
    public ListProjetRealiser getProjetrealises() {
        return projetrealises;
    }

    public void setProjetrealises(ListProjetRealiser projetrealises) {
        this.projetrealises = projetrealises;
    }

    @XmlElement
    public ListConnaissanceTech getConnaissances() {
        return connaissances;
    }

    public void setConnaissances(ListConnaissanceTech connaissances) {
        this.connaissances = connaissances;
    }

    @XmlElement
    public ListLangues getLangues() {
        return langues;
    }

    public void setLangues(ListLangues langues) {
        this.langues = langues;
    }

    @XmlElement
    public ListLoisirs getLoisirs() {
        return loisirs;
    }

    public void setLoisirs(ListLoisirs loisirs) {
        this.loisirs = loisirs;
    }
}

