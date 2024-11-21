package gestionAnimal;

public class Terrestre extends Animal{
    private  int nbr_legs;
    Terrestre(String family,String name,int age,boolean ismemal,int nbr_legs )
    {
        super(family,name,age,ismemal);
        this.nbr_legs=nbr_legs;
    }
    public int getNbr_legs()
    {
        return nbr_legs;
    }
    public void setNbr_legs(int nbrLegs)
    {
         this.nbr_legs=nbrLegs;
    }

}
