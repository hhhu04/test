package test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args){
        TreeSet<String> tree = new TreeSet<String>(new StrLenComparator());
        tree.add("orange");
        tree.add("apple");
        tree.add("dog");
        tree.add("Individual");

//        Iterator<String> it = tree.iterator();
        NavigableSet<String> de = tree.descendingSet();

        for(String i : de) System.out.println(i+" ");

//        while(it.hasNext())
//            System.out.println(de.iterator());
    }

}

class StrLenComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }



}

















class MyString implements Comparable<MyString>
{

    String str;
    public MyString(String str) {this.str = str;}
    public int getLenght() {return str.length();}

    public int compareto(MyString mStr) {

        return 0;
    }


    @Override
    public int compareTo(MyString mStr) {
        return 0;
    }
}



