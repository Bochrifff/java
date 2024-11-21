package Department;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public interface IDepartement <T>{
    public void ajouter_departement(T t);
    public void displayDepartement();
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(T t);
    public void supprimerDepartement(T t);
    public TreeSet<T> trierDepartementById();
}
