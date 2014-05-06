package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Created by Abid on 02/05/2014.
 */

@XmlRootElement
public class ProjetRealiser {

    private String projet;
    private String description;

    public ProjetRealiser(String projet, String description) {
        this.projet = projet;
        this.description = description;
    }

    public ProjetRealiser() {
    }

    @XmlElement
    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
