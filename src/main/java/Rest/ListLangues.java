package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
/**
 * Created by Abid on 03/05/2014.
 */

@XmlRootElement
public class ListLangues {
    private LinkedList<Langues> langue;
    public ListLangues(){
        this.langue= new LinkedList<Langues>();
    }

    @XmlElement
    public LinkedList<Langues> getLangue() {
        return langue;
    }

    public void setLangue(LinkedList<Langues> langue) {
        this.langue = langue;
    }
}
