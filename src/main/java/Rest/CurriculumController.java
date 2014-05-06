package Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.LinkedList;
/**
 * Created by Abid on 03/05/2014.
 */

@Controller
@RequestMapping("/Curriculum")
public class CurriculumController {
    private ListCurriculum listecv;
    public CurriculumController(){
        listecv= new ListCurriculum();

    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Curriculum getCurriculumInXML(@PathVariable String id){

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

        Curriculum resume1= new Curriculum("Abid", "Soufiane", "Rouen", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume2= new Curriculum("David", "David", "Paris", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume3= new Curriculum("Jack", "jacke", "Mont saint aignan", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);


        listecv.getListcv().add(resume1);
        listecv.getListcv().add(resume2);
        listecv.getListcv().add(resume3);


        return listecv.getListcv().get(Integer.parseInt(id)-1);

    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ListCurriculum getCurriculumsInXML(){

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

        Curriculum resume1= new Curriculum("Abid", "Soufiane", "Rabat1", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume2= new Curriculum("Michel", "Mic", "Rabat2", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume3= new Curriculum("Sarco", "sarco", "Rabat3", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume4= new Curriculum("gloria", "gloria", "Rabat4", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);

        listecv.getListcv().add(resume1);
        listecv.getListcv().add(resume2);
        listecv.getListcv().add(resume3);
        listecv.getListcv().add(resume4);

        return listecv;

    }

}
