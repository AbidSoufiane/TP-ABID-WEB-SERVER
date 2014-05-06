package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
/**
 * Created by Abid on 03/05/2014.
 */

@XmlRootElement
public class ListFormation {
    private LinkedList<Formation> formation;
    public ListFormation(){
        this.formation=new LinkedList<Formation>();
    }

    public ListFormation(LinkedList<Formation> formation) {
        this.formation = formation;
    }

    @XmlElement
    public LinkedList<Formation> getFormation() {
        return formation;
    }

    public void setFormation(LinkedList<Formation> formation) {
        this.formation = formation;
    }
}
