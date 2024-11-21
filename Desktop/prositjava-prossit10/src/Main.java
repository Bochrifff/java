import Employe.*;
import SocieteArrayList.*;
import Department.*;
public class Main {
    public static void main(String[] args) {
        Employe e=new Employe(10,"ahmed","ali","informatique",2);
        Employe e1=new Employe(11,"mohamed","ali","informatique",3);
        Employe e2=new Employe(8,"karim","ali","informatique",3);


        SocieteArrayList s =new SocieteArrayList();
        s.ajouterEmploye(e);
        s.ajouterEmploye(e1);
        s.ajouterEmploye(e2);
        s.displayEmploye();
        System.out.println("recherche par nom "+s.rechercherEmploye("ahmed"));
        System.out.println("le employe a rechercehr"+s.rechercherEmploye(e));
        s.supprimerEmploye(e);
        System.out.println("apres la suppression");
        s.displayEmploye();
        System.out.println("liste Apres tri");
        s.trierEmployeParId();
        s.displayEmploye();
        System.out.println("************* Prosit 10 **********************************************");
        departement info =new departement(10,"informatique",10);
        departement buisness=new departement(12,"buisness",15);
        departement technologie=new departement(1,"technologie",18);
        departement Ai=new departement(3,"Ai",125);

        DepartementHashSet h1 = new DepartementHashSet();
        h1.ajouter_departement(info);
        h1.ajouter_departement(buisness);
        h1.ajouter_departement(technologie);
        h1.ajouter_departement(Ai);
        h1.displayDepartement();
        System.out.println("esque le departement existe "+h1.rechercherDepartement("ali"));
        System.out.println("esque le departement  existe "+h1.rechercherDepartement(info));
        h1.supprimerDepartement(info);
        System.out.println("la liste apres la supression");
        h1.displayDepartement();
        System.out.println("la liste  apres le tri");
        h1.trierDepartementById();




    }
}