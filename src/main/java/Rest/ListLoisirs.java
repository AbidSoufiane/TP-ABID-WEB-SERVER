package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
/**
 * Created by Abid on 02/05/2014.
 */

@XmlRootElement
public class ListLoisirs {
    private LinkedList<String> loisirs;
    public ListLoisirs(){
        this.loisirs= new LinkedList<String>();
    }

    public ListLoisirs(LinkedList<String> loisirs) {
        this.loisirs = loisirs;
    }


    @XmlElement
    public LinkedList<String> getLoisirs() {
        return loisirs;
    }

    public void setLoisirs(LinkedList<String> loisirs) {
        this.loisirs = loisirs;
    }
}
