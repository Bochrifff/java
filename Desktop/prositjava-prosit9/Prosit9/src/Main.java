import Employe.*;
import SocieteArrayList.*;
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



    }
}