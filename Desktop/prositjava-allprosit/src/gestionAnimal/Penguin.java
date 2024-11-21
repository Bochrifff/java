package gestionAnimal;

public class Penguin extends Aquatique{
    float Swimming_depth;
    public Penguin(String family,String name,int age,boolean ismemal,String habitat,float Swimming_depth)
    {
        super(family, name, age, ismemal, habitat);
        this.Swimming_depth=Swimming_depth;
    }
    public float getSwimming_depth()
    {
        return Swimming_depth;
    }
    public void setSwimming_depth(float Swimming_depth)
    {
        this.Swimming_depth=Swimming_depth;
    }
    public  String toString()
    {

        return super.toString()+"swimming depth"+Swimming_depth;
    }
    public void Swim()
    {
        System.out.println("this dolphin is swimming");
    }
}
