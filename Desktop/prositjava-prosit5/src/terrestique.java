public class terrestique extends Animal {
    private int nbrLegs;
    public terrestique(String family, String name, int age, boolean ismammal,int nbrLegs) {
        super(family, name, age, ismammal);
        this.nbrLegs=nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

}
