public class Zoo {

    Animal []   animals;
    String name;
    String city;
    int nbrCage;

    public Zoo( String name, String city, int nbrCage) {
        animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCage = nbrCage;
    }
    }
}
