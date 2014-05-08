package Rest;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public void SetCurriculum(){
        Formation form1= new Formation("du 01/09/2008","au 30/06/2009","BAC Science");
        Formation form2= new Formation("du 10/10/2009","au 27/06/2013","BAC+5");
        Formation form3= new Formation("du 09/09/2013","au 30/05/2014","M1 GIL");

        ExperiencePro exp1= new ExperiencePro("du 07/07/2012","au 09/10/2013","Stage PFC");
        ExperiencePro exp2= new ExperiencePro("du 02/02/2013","au 03/06/2013","Stage PFE");
        ExperiencePro exp3= new ExperiencePro("du 26/06/2014","au 26/09/2014","Experience3");

        ProjetRealiser proj1= new ProjetRealiser("Projet1","Android");
        ProjetRealiser proj2= new ProjetRealiser("Projet2","JEE");
        ProjetRealiser proj3= new ProjetRealiser("Projet3","OpenERP");

        ConnaissanceTech con1= new ConnaissanceTech("Langage de programmation","Java,jquery,php");
        ConnaissanceTech con2= new ConnaissanceTech("Systeme d'exploitation","Windows,Linux,Mac");
        ConnaissanceTech con3= new ConnaissanceTech("Outils","Innovator,Entreprise Architect,Eclipse");

        Langues lang1= new Langues("Francais","bon");
        Langues lang2= new Langues("Anglais","Bon");
        Langues lang3= new Langues("Arabe","Bon");



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

        Curriculum resume1= new Curriculum(1,"Daniel", "moraca", "espagne", "0123456789", "23", "célibataire", "dav.mora@gmail.com", "Architecte", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume2= new Curriculum(2,"Mamado", "Diara", "senegale", "0583456789", "27", "célibataire", "mamado@gmail.com", "ENSA", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume3= new Curriculum(3,"David", "guetta", "GB", "0248456789", "21", "célibataire", "getta@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);
        Curriculum resume4= new Curriculum(4,"Abid", "Soufiane", "France", "0123456789", "26", "célibataire", "sfn.abid@gmail.com", "M1 GIL", formations, experience, projets, connaissance, langues, loisir);

        listecv.getListcv().add(resume1);
        listecv.getListcv().add(resume2);
        listecv.getListcv().add(resume3);
        listecv.getListcv().add(resume4);
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Curriculum getCurriculumInXML(@PathVariable int id){
        for (int i=0;i<listecv.listcv.size();i++){
            if(listecv.getListcv().get(i).getId()==id){
                return listecv.getListcv().get(i);
            }
        }
        return null;

    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ListCurriculum getCurriculumsInXML(){


        return listecv;

    }

    @RequestMapping(method = RequestMethod.PUT)
     @ResponseBody public String  putCurriculumsInXML(@RequestBody Curriculum curriculum){
       int id=curriculum.getId();
        for (int i=0;i<listecv.listcv.size();i++){
            if(listecv.getListcv().get(i).getId()==id){
                return "CV existe déjà";
            }
        }
        listecv.listcv.add(curriculum);


        return " CV ajouter";

    }
}

