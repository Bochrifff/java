package Employe;
import SocieteArrayList.*;

import java.lang.Comparable;

public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String nom_de_departament;
    private int grade;
    public Employe(int id,String nom,String prenom,String nom_de_departament,int grade)
    {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nom_de_departament=nom_de_departament;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_de_departament() {
        return nom_de_departament;
    }

    public void setNom_de_departament(String nom_de_departament) {
        this.nom_de_departament = nom_de_departament;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(obj.getClass()==Employe.class)
        {
            Employe E=(Employe) obj;
                    return id==E.id && nom.equals(E.nom);
        }
        return false;
    }
    public String toString()
    {
        return "id  :"+id +" nom  :"+nom+"  prenom  :"+prenom+" nom_de_departament :"+nom_de_departament+" grade  :"+grade;
    }
    public int compareTo(Employe e)
    {
        return this.id-e.id;
    }



}
