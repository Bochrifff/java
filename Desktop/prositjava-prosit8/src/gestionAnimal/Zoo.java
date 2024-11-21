package gestionAnimal;

public class Zoo {
    Animal animals[]=new Animal[25];
    private String name;
    private String city;
    private int nbr_cage ;
    Aquatique aquatique[]=new  Aquatique[10];
public Zoo(String name,String city,int nbr_cage)
{
    if(name=="")
    {
     System.out.println("le nom ne doit pas etre vide");
    }else {


        this.name = name;
        this.nbr_cage = nbr_cage;
        this.city = city;
    }
}
public String getName()
{
    return name;
}
public String getCity()
{
    return  city;
}

    public int getNbr_cage() {
        return nbr_cage;
    }
    public void setName()
    {
        this.name=name;
    }
    public void setCity()
    {
        this.city=city;
    }
    public void setNbr_cage()
    {
        this.nbr_cage=nbr_cage;
    }
    public boolean add_animals(Animal animal)
    {
        int i=0;
        if(seachanimals(animal)==-1 && iszooFull()==true &&animal.getName()!=null) {
          while(animals[i]!=null) {
              i++;
          }
                    animals[i] = animal;
                    System.out.println("le animal " + animal.getName() + " est ajouter avec succes");
                    return true;


            }
            else
                System.out.println("Erreur");
        return false;
    }
    public void afiicher_animal()
    {
        System.out.println("********************************************* ");
        System.out.println("LE TABLEAU DE ANIMALS ");
        for(int i=0;i<nbr_cage;i++)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("NUm "+(i+1)+" : "+animals[i]);
        }
    }
    public int seachanimals(Animal animal)
    {
        for(int i=0;i<animals.length;i++)
        {
            if(animals[i]!=null&&animals[i].getName().equals(animal.getName()))
            {
                System.out.println("le indice est "+i);
                return i;
            }
        }
        System.out.println("le indice est "+-1);
        return -1;
    }
    public boolean remove_animals(Animal animal) {
        int i =seachanimals(animal);
        if(i!=-1)
        {
        for(int j=i;j<nbr_cage-1;j++)
        {
            animals[j]=animals[j+1];

        }
        animals[nbr_cage-1]=null;
        nbr_cage--;


        }return true;
   }
   public boolean iszooFull()
   {
       int j=0;
       for(int i=0;i<nbr_cage;i++)
       {
           if(animals[i]!=null)
           {
              j++;
           }
       }
       if(j<nbr_cage)
       {
           System.out.println("zoo is not Full");
           return true;

       }else
           System.out.println("zoo is full");
       return false;
   }
   public Zoo zooComparer(Zoo zoo1,Zoo zoo2)
   {

       int i=0;
       int j=0;
       while (zoo1.animals[i]!=null)
       {
           i++;
       }
       while (zoo2.animals[i]!=null)
       {
           j++;
       }
       if(i>j)
       {
           return zoo1;
       }else if(j<i)
           return zoo2;
       else
           System.out.println("egaux");

return null;
   }
  public void add_aquatique_animals(Aquatique aqua)
   {
       int i=0;
       while(aquatique[i]!=null)
       {
           i++;
       }
       aquatique[i]=aqua;
   }
public  void afficher()
{
    for (int i=0;i<aquatique.length;i++)
    {
        System.out.println(aquatique[i]);
    }
}
public float maxPenguinSwimmingDepth() {
    float maxdepth = 00.f;
    float speed = 00.f;
    for (int i = 0; i < aquatique.length; i++) {
        Aquatique aquatique1 = aquatique[i];
        if (aquatique1 instanceof Dophin) {
            speed = ((Dophin) aquatique1).getSwimming_speed();
        }
        if (speed > maxdepth) {
            maxdepth = speed;
        }
    }
    System.out.println(maxdepth);
    return maxdepth;
}
public void display_number_ofaquatic_by_type()
{
    int nbrOfDophin=0;
    int nbrOfPenguin=0;


    for(int i=0;i<aquatique.length;i++)
    {
        Aquatique aquatique1=aquatique[i];
        if(aquatique1 instanceof Dophin)
        {
            nbrOfDophin++;
        }
        else if(aquatique1 instanceof Penguin)
        {
            nbrOfPenguin ++;
        }

    }
    System.out.println("le nombre de Dauphin est "+nbrOfDophin);
    System.out.println("le nombre de Penguin est "+nbrOfPenguin);

}

public  boolean equals(Object obj )
{
    if(null==obj)
    {
        return false;
    }
    if(this==obj)
    {
        return true;
    }
    if(obj.getClass()== Aquatique.class)
    {
        Aquatique aquatique1=(Aquatique) obj;
        return name == aquatique1.getName() && name.equals(aquatique1.getName());
    }
return false;
}

}


