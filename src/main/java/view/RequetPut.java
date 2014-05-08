package view;

import Rest.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;
import java.util.Map;

/**
 * Created by pret on 08/05/2014.
 */
public class RequetPut {
    private Service service;
    private JAXBContext jc;

    private static final QName qname = new QName("", "");
    private static final String url = "http://projet-abid-web.abidsoufiane.cloudbees.net/Rest/Curriculum/";

    public RequetPut() {
        try {
            jc = JAXBContext.newInstance(Curriculum.class, ExperiencePro.class,
                    ConnaissanceTech.class, Langues.class , String.class);
        } catch (JAXBException je) {
            System.out.println("Cannot create JAXBContext " + je);
        }
    }
    public void addResume(Curriculum resume) throws JAXBException {
        service = Service.create(qname);
        service.addPort(qname, HTTPBinding.HTTP_BINDING, url);
        Dispatch<Source> dispatcher = service.createDispatch(qname,
                Source.class, Service.Mode.MESSAGE);
        Map<String, Object> requestContext = dispatcher.getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_METHOD, "PUT");

        Source result = dispatcher.invoke(new JAXBSource(jc, resume));


    }

    public static void main(String args[]) throws Exception {
        RequetPut  requetPut= new RequetPut();
        Formation form1= new Formation("du","au","formation1");
        Formation form2= new Formation("du","au","formation2");
        Formation form3= new Formation("du","au","formation3");

        ExperiencePro exp1= new ExperiencePro("du","au","Experience1");
        ExperiencePro exp2= new ExperiencePro("du","au","Experience2");
        ExperiencePro exp3= new ExperiencePro("du","au","Experience3");

        ProjetRealiser proj1= new ProjetRealiser("Projet1","premier");
        ProjetRealiser proj2= new ProjetRealiser("Projet2","deuxieme");
        ProjetRealiser proj3= new ProjetRealiser("Projet3","troisieme");

        ConnaissanceTech con1= new ConnaissanceTech("Connaissance1","a,b,c");
        ConnaissanceTech con2= new ConnaissanceTech("Connaissance2","a,b,c");
        ConnaissanceTech con3= new ConnaissanceTech("Connaissance3","a,b,c");

        Langues lang1= new Langues("Francais","A");
        Langues lang2= new Langues("Anglais","A");
        Langues lang3= new Langues("Arabe","A");



        ListFormation formations= new ListFormation();
        formations.getFormation().add(form1);
        formations.getFormation().add(form2);
        formations.getFormation().add(form3);

        ListExperiencePro experience= new ListExperiencePro();
        experience.getExperience().add(exp1);
        experience.getExperience().add(exp2);
        experience.getExperience().add(exp3);

        ListProjetRealiser projets= new ListProjetRealiser();
        projets.getProjet().add(proj1);
        projets.getProjet().add(proj2);
        projets.getProjet().add(proj3);

        ListConnaissanceTech connaissance= new ListConnaissanceTech();
        connaissance.getConnaissance().add(con1);
        connaissance.getConnaissance().add(con2);
        connaissance.getConnaissance().add(con3);

        ListLangues langues= new ListLangues();
        langues.getLangue().add(lang1);
        langues.getLangue().add(lang2);
        langues.getLangue().add(lang3);

        ListLoisirs loisir= new ListLoisirs();
        loisir.getLoisirs().add("football");
        loisir.getLoisirs().add("Ping Pong");
        loisir.getLoisirs().add("natation");

        Curriculum resume1= new Curriculum(127,"Abid", "Soufiane", "Rabat1", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume2= new Curriculum(5,"Abid", "Soufiane", "Rabat2", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume3= new Curriculum(6,"Abid", "Soufiane", "Rabat3", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume4= new Curriculum(7,"Abid", "Soufiane", "Rabat4", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);

    }
}
