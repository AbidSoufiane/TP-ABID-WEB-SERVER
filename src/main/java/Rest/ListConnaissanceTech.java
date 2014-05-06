package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abid on 03/05/2014.
 */

@XmlRootElement
public class ListConnaissanceTech {
    private LinkedList<ConnaissanceTech> connaissance;

    public ListConnaissanceTech(LinkedList<ConnaissanceTech> connaissance) {
        this.connaissance = connaissance;
    }

    public ListConnaissanceTech(){
        this.connaissance=new LinkedList<ConnaissanceTech>();
    }

    @XmlElement
    public LinkedList<ConnaissanceTech> getConnaissance() {
        return connaissance;
    }

    public void setConnaissance(LinkedList<ConnaissanceTech> connaissance) {
        this.connaissance = connaissance;
    }
}
