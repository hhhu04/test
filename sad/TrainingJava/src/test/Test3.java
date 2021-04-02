package test;

import java.io.*;
import java.util.StringTokenizer;

public class Test3 {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String charList;
        int charNum = 0;
        StringTokenizer sto;

        charList = read.readLine();
        for(int i=0;i<charList.length();i++)
        {

            if(Character.toString(charList.charAt(i))==" ") charNum++;
            if(charList.startsWith(" ") && charList.endsWith(" ")) charNum-=2;
            else if(charList.startsWith(" ") || charList.endsWith(" ")) charNum--;

        }
        System.out.println(charNum+1);


//        sto = new StringTokenizer(charList, " ");
//
//        while (sto.hasMoreTokens())
//        {
//            charNum++;
//        }
//
//        System.out.println(charNum);
//
//        read.close();


    }

}
