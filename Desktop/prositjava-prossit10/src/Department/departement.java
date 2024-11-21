package Department;

import java.util.Comparator;

public class departement implements Comparator<departement> {
    private int id;
     private String nom_de_deprtement;
     int nbr_employees;
     public departement(int id, String nom_de_deprtement, int nbr_employees) {
         this.id = id;
         this.nom_de_deprtement = nom_de_deprtement;
         this.nbr_employees = nbr_employees;
     }
     public int getId() {
         return id;
     }
     public String getNom_de_deprtement() {
         return nom_de_deprtement;
     }
     public int getNbr_employees() {
         return nbr_employees;
     }
     public void setNom_de_deprtement(String nom_de_deprtement) {
         this.nom_de_deprtement = nom_de_deprtement;
     }
     public void setNbr_employees(int nbr_employees) {
         this.nbr_employees = nbr_employees;
     }
     @Override
     public String toString() {
         return "Departement{" +
                 "id=" + id +
                 ", nom_de_deprtement='" + nom_de_deprtement + '\'' +
                 ", nbr_employees=" + nbr_employees +
                 '}';
     }

    @Override
    public int compare(departement o1, departement o2) {

        return 0;
    }

    public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null) return false;
         if(departement.class==o.getClass())
         {
             departement D=(departement) o;
             return nom_de_deprtement.equals(D.nom_de_deprtement)&& id== D.id;
         }
         return false;
     }




}
