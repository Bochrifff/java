package Main_gestion;

import gestionAnimal.*;

public class Main {
    public static void main(String[] args) {
    Animal lion=new Animal("cats","tiggy",10,true);
        Animal penguin=new Animal("penguin","alita",25,true);
        Animal dog=new Animal("dogs","chanel",2,true);
        Animal cat=new Animal("cats","michou",25,true);

        Zoo myzoo=new Zoo("bellvedaire","rue mohamed 5",20);
        Zoo zoo=new Zoo("bellvedaire","rue mohamed 5",40);



            myzoo.add_animals(lion);
           myzoo.add_animals(penguin);
           myzoo.add_animals(dog);
            myzoo.add_animals(cat);

            //myzoo.remove_animals(lion);
            myzoo.afiicher_animal();
           myzoo.iszooFull();
            gestionAnimal.Zoo zooedComparer=myzoo.zooComparer(myzoo,zoo);
            System.out.println("le zoo qui contient me grand nombre animal est "+ zooedComparer.getName());
        System.out.println("*******************************************************************************************");
        //Aquatique aquatique=new Aquatique ("aqua","aqua",10,true,"habitat");
        //Dophin dophin =new Dophin("DOLPHIN","bringa",10,true,"habitats",25);
        //Penguin penguine =new Penguin("pengo","sergio",10,true,"habitats",25);
        //aquatique.Swim();
        //dophin.Swim();
        //penguine.Swim();
        System.out.println("*******************************************************************************************");
        Aquatique dophin =new Dophin("DOLPHIN","bringa",10,true,"habitats",26);
        Aquatique dophin1 =new Dophin("DOLPHINs","bringas",10,true,"habitats",27);
        Aquatique pengu= new Penguin("pengo","sergio",10,true,"habitats",25);
        myzoo.add_aquatique_animals(dophin);
        myzoo.add_aquatique_animals(dophin1);
        myzoo.add_aquatique_animals(pengu);
       // myzoo.afficher();
        myzoo.maxPenguinSwimmingDepth();
        myzoo.display_number_ofaquatic_by_type();










    }
}