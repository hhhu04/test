package test;


import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args){
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i=1;i<10001;i++) map.put(i,i);

        for(int i=1;i<10001;i++) {
            map.remove(selfNumber(i));
        }

        NavigableSet<Integer> nav = map.navigableKeySet();

        Iterator<Integer> it = nav.iterator();
        while(it.hasNext()) System.out.println(it.next());

//        System.out.println(8888/1000);
//        System.out.println(888/100);
//        System.out.println(88/10);
//        System.out.println(88%10);
//        System.out.println(8888+8+8+8+8);
//        System.out.println(selfNumber(8888));


    }

    public static int selfNumber(int num){
        int result,ten,one,hun,th;
        if (num<100) {
            ten = num / 10;
            one = num % 10;
            result = num + ten + one;
        }
        else if(num<1000){
            hun = num / 100;
            ten = (num-hun*100) / 10;
            one = num %10;
            result = num+one+ten+hun;
        }
        else if(num<10000){
            th = num / 1000;  //8888 8
            hun = (num-th*1000) / 100; //// 888 8
            ten = (num-hun*100-th*1000) / 10; ///
            one = num %10;
            result = num+one+ten+hun+th;
        }else result = 10001;



        return result;
    }

}





