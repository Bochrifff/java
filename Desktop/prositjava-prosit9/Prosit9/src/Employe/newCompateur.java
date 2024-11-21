package Employe;

import java.util.Comparator;

public class newCompateur implements Comparator<Employe>
{
    public int compare(Employe e1,Employe e2)
    {
         return e1.getNom_de_departament().compareTo(e2.getNom_de_departament());
    }
}
