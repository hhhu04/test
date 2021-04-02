package test;


import java.util.HashSet;
import java.util.Iterator;

public class Main {



    public static void main(String[] args) throws Exception {

        HashSet<Person> set = new HashSet<Person>();

        set.add(new Person("이진호",10));
        set.add(new Person("이진호",20));
        set.add(new Person("김명호",20));
        set.add(new Person("김명호",15));
        set.add(new Person("이진호",20));
        set.add(new Person("김명호",20));

        System.out.println("수 : "+set.size());

        Iterator<Person> iter = set.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }


    }

}

class Person
{
    String name;
    int age;

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return name+"("+age+")";
    }

    public int hashCode(){

        return age/5;
    }

    public boolean equals(Object obj){
        Person per = (Person)obj;
        if(per.name.equals(name) && per.age == age ) return true;
        else return false;
    }


}


class SimpleNumber
{
    int num;

    public SimpleNumber(int n)
    {
        this.num = n;
    }

    public int hashCode(){
        return num%2;
    }

    public boolean equals(Object obj)
    {
        SimpleNumber sim = (SimpleNumber) obj;
        if(sim.num == num) return true;
        else return false;
    }

}

