package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Created by Abid on 02/05/2014.
 */

@XmlRootElement
public class Langues {
    private String nom;
    private String niveau;

    public Langues(String nom, String niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public Langues() {
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement
    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
