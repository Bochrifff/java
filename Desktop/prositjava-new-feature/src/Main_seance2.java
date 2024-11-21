public class Main_seance2 {
    public static void main(String[] args) {

        Animal lion = new Animal("felines","lion",14,true);
        Zoo myZoo = new Zoo("Zoonmame",25,"tunis");
        //method 1 : standard method
        //lion.afficher();
        myZoo.afficher();
        boolean test;
        int var =0;
        var=myZoo.seach_animal(lion);
                System.out.println(var);
                if(var==1) {
                    test = myZoo.add_animal(lion);

                    System.out.println(test);
                            }
                else {
                    System.out.print("animal trouvé");
                    }
        myZoo.afficher_animal();
        //method 2 : overriding toString
      // System.out.println( myZoo.toString());   //to directly print out everything,but it needs to be redefined necessarily to display what you need to display , otherwise its useless
    }
}
