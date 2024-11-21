public class Dauphin extends aquatique{
    float speed;
    public  Dauphin(String family,String name ,int age ,boolean ismemals,String habitat,float speed)
    {
        super(family,name,age,ismemals,habitat);
        this.speed = speed;

    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}
