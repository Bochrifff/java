package gestionAnimal;

public class Terrestre extends Animal implements Carnivore <Food>{
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

    public  void eat_plant(Food plant){
        System.out.println("The Terrestrial " + getName() + " is eating " + plant);


    }

    @Override
    public void eat_meat(Food meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);

    }
    public void eatPlantAndMeet(Food food)
    {
        System.out.println("The Terrestrial " + getName() + " is eating " + food + " plants and meat");
    }
}
