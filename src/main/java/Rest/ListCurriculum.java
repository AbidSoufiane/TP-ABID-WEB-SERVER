package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abid on 03/05/2014.
 */

@XmlRootElement
public class ListCurriculum {
    LinkedList<Curriculum> listcv;
    public ListCurriculum(){
        this.listcv= new LinkedList<Curriculum>();
    }

    @XmlElement
    public LinkedList<Curriculum> getListcv() {
        return listcv;
    }

    public void setListcv(LinkedList<Curriculum> listcv) {
        this.listcv = listcv;
    }
}
