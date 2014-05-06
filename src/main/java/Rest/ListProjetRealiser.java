package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
/**
 * Created by Abid on 02/05/2014.
 */

@XmlRootElement
public class ListProjetRealiser {
    private LinkedList<ProjetRealiser> projet;
    public ListProjetRealiser(){
        this.projet=new LinkedList<ProjetRealiser>();
    }

    @XmlElement
    public LinkedList<ProjetRealiser> getProjet() {
        return projet;
    }

    public void setProjet(LinkedList<ProjetRealiser> projet) {
        this.projet = projet;
    }
}
