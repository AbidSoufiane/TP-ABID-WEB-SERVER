package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Created by Abid on 02/05/2014.
 */

@XmlRootElement
public class ConnaissanceTech {
    private String specialite;
    private String description;


    public ConnaissanceTech(String specialite, String description) {
        this.specialite = specialite;
        this.description = description;
    }

    public ConnaissanceTech() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @XmlElement
    public String getSpecialite() {
        return specialite;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }
}
