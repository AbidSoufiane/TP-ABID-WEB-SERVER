package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by Abid on 03/05/2014.
 */

@XmlRootElement
public class ListExperiencePro {
    private LinkedList<ExperiencePro> experience;

    public ListExperiencePro(LinkedList<ExperiencePro> experience) {
        this.experience = experience;
    }

    public ListExperiencePro(){
        this.experience=new LinkedList<ExperiencePro>();
    }

    @XmlElement
    public LinkedList<ExperiencePro> getExperience() {
        return experience;
    }

    public void setExperience(LinkedList<ExperiencePro> experience) {
        this.experience = experience;
    }
}
