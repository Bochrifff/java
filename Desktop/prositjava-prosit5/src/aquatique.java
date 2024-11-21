public  class aquatique extends  Animal{
String habitat;
    public  aquatique(String family,String name ,int age ,boolean ismemals,String habitat)
    {
        super(family, name, age, ismemals);
        this.habitat=habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


}
