package test;


import java.io.*;
import java.util.Collections;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out)) ;
        Stack<String> list = new Stack<>();
        Stack<String> keep = new Stack<>();
        String ch = read.readLine();

        String[] charList;
        charList = ch.split("");
        for(String i : charList) list.push(i);

        int cicle = Integer.parseInt(read.readLine());

        while (cicle != 0)
        {
            String input = read.readLine();

            switch (input.substring(0,1)){
                case "L":
                    if(!list.isEmpty())keep.push(list.pop());
                    break;

                case "D":
                    if(!keep.isEmpty())list.push(keep.pop());
                    break;

                case "B":
                    if(!list.isEmpty())list.pop();
                    break;

                case "P":
                    list.push(input.substring(2,3));

                    break;
            }
            cicle--;
        }

        while(!list.isEmpty()) keep.push(list.pop());
        Collections.reverse(keep);
        for(String i : keep)  write.write(i);


        read.close();
        write.flush();
        write.close();

    }


}










