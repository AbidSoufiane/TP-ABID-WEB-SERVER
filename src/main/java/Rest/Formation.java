package Rest;

/**
 * Created by Abid on 02/05/2014.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Formation {

    private String date1;
    private String date2;
    private String diplome;

    public Formation(String date1, String date2, String diplome) {
        this.date1 = date1;
        this.date2 = date2;
        this.diplome = diplome;
    }

    public Formation() {
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
    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
}