package SocieteArrayList;

import Employe.*;

import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {
List<Employe> listeEmplyee=new ArrayList<>();

    public void ajouterEmploye(Employe e)
    {
        listeEmplyee.add(e);
    }
    public void displayEmploye()
    {
        System.out.println(listeEmplyee);

    }

    public boolean rechercherEmploye(String nom)
    {
    for(Employe e:listeEmplyee)
    {
        if(e.getNom().equals(nom))
            return true;
        else
            return false;
    }
    return false;
    }
    public boolean rechercherEmploye(Employe E)
    {
        return listeEmplyee.contains(E);
    }
    public void supprimerEmploye(Employe e)
    {
        listeEmplyee.remove(e);
    }
    public void trierEmployeParId()
    {
        Collections.sort(listeEmplyee);
    }
    public void trierEmployeParNomDépartementEtGrade()
    {
        Collections.sort(listeEmplyee,
                new newCompateur()
                        .thenComparing(new ComparteurParGrade()));
    }




}
