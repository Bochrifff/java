package gestionAnimal;

public class Dophin extends Aquatique{
    float Swimming_speed;
  public   Dophin(String family,String name,int age,boolean ismemal,String habitat,float swimming_speed)
    {
        super(family, name, age, ismemal, habitat);
        this.Swimming_speed=swimming_speed;
    }
    public float getSwimming_speed()
    {
        return Swimming_speed;
    }
    public void setSwimming_speed(float swimmingSpeed)
    {
        this.Swimming_speed=swimmingSpeed;
    }
    public  String toString()
    {

        return super.toString()+"swimming Speed "+Swimming_speed;
    }
    public void Swim()
    {
        System.out.println("this dolphin is swimming");
    }


}
