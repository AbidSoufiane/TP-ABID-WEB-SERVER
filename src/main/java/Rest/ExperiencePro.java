package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Abid on 02/05/2014.
 */

@XmlRootElement
public class ExperiencePro {
    private String date1;
    private String date2;
    private String description;

    public ExperiencePro(String date1, String date2, String description) {
        this.date1 = date1;
        this.date2 = date2;
        this.description = description;
    }

    public ExperiencePro() {
    }

    @XmlElement
    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    @XmlElement
    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
