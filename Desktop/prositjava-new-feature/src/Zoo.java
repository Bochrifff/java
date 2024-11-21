

public class Zoo
{
Animal [] animals ;
String name;
String city;
 int nbcages = 25;

    public Zoo(String name, int nbcages, String city) {
        animals=new Animal[nbcages];
        this.name = name;
        this.city = city;
    }
    public void afficher()
    {
        System.out.println("Name: " + name);
        System.out.println("Nbcages: " + nbcages);
        System.out.println("City: " + city);

    }
    public String tostring (){   //we redefined it here so we can use it fel main
        return("name="+name+",nbcages="+nbcages+",city="+city);
    }
     public boolean add_animal(Animal animal)
     {
         boolean test;
         for(int i=0;i<animals.length;i++)
         {
             animals[i]=animal;
             if(i==animals.length-1)
             {
                  return  false;
             }else {
                 return  true;

             }
         }
         return true;
     }
     public void afficher_animal()
     {
       for(int i=0;i<animals.length;i++)
       {
           System.out.println(animals[i]);
       }
     }
     int seach_animal(Animal animal)
     {
         int j=0;
       for(int i=0;i<animals.length;i++)
       {
          if(animals[i].name.equals(animal.name));

       }
         return j=1;
     }

}