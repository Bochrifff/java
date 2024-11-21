package Department;
import Employe.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class DepartementHashSet implements IDepartement<departement> {
    Set<departement> listeDepartement=new HashSet<>();
    public void ajouter_departement(departement t)
    {
        listeDepartement.add(t);
    }
    public void displayDepartement()
    {
        System.out.println(listeDepartement);
    }
    public boolean rechercherDepartement(String nom)
    {
        for(departement d :listeDepartement)
        {
            if(d.getNom_de_deprtement().equals(nom))
            {
                return true;
            }
        }
        return false;
    }
    public boolean rechercherDepartement(departement d)
    {
        return listeDepartement.contains(d);
    }
    public void supprimerDepartement(departement d)

    {
        listeDepartement.remove(d);
    }



    public TreeSet<departement> trierDepartementById() {
      TreeSet<departement> tree= new TreeSet<>(new CompratorParId());
      tree.addAll(listeDepartement);
      System.out.println(tree);
        return tree;
    }



}
