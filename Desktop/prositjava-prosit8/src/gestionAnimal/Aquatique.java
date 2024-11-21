package gestionAnimal;

public abstract class  Aquatique  extends Animal implements Carnivore<Food> {
    String habitat;
    public  Aquatique(String family,String name,int age,boolean ismemal,String habitat)
    {
        super(family, name, age, ismemal);
        this.habitat=habitat;
    }
    public String getHabitat()
    {
        return habitat;
    }
    public void setHabitat(String habitat)
    {
        this.habitat=habitat;
    }
    public  String toString()
    {

        return super.toString()+" habitat "+habitat;
    }
    public  abstract void Swim();
    public void eat_meat(Food meat)
    {
        System.out.println("this animal is eating "+meat);
    }



}
