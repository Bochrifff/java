public class Penguin extends aquatique {
    float speed_depth;
    public  Penguin(String family,String name ,int age ,boolean ismemals,String habitat,float speed_depth)
    {
        super(family,name,age,ismemals,habitat);
        this.speed_depth = speed_depth;

    }

    public float getSpeed_depth() {
        return speed_depth;
    }

    public void setSpeed_depth(float speed_depth) {
        this.speed_depth = speed_depth;
    }

}
