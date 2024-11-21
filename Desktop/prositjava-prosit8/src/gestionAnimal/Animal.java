package gestionAnimal;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean ismemal;
    public Animal(String family,String name,int age,boolean ismemal)
    {

        if(age<0)
        {
         System.out.println("age ne peut etre negatif");
        }else {
            this.age = age;
            this.name = name;
            this.ismemal = ismemal;
            this.family = family;
        }
    }
    public String getFamily()
    {
        return family;
    }
    public  String getName()
    {
        return  name;
    }
    public int getAge()
    {
        return age;
    }
    public boolean getismemal()
    {
        return ismemal;
    }
    public void setFamily(String family)
    {
        this.family=family;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setIsmemal(boolean ismemal)
    {
        this.ismemal=ismemal;
    }
    public String toString()
    {
        return  ("la famille est :"+family+",  le nom est "+name+", sont age est "+age+", is memal "+ismemal);
    }
}
