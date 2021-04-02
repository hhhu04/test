package test;

import java.util.ArrayList;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) throws Exception {

        String a = "12345";
        String[] b = new String[5];
        b=a.split("");
        System.out.println(a.substring(0,1));
        System.out.println(a.substring(4,5));
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

    }

}

//import java.util.Stack;
//        import java.io.*;
//
//class Solution {
//    public static int solution(int[] priorities, int location) {
//        int answer = 0;
//        int num = priorities[location];
//        int check = 0;
//        int top=0;
//        int topare = 0;
//        Stack<Integer> st = new Stack<>();
//        st.push(num);
//
//        for(int i : priorities)
//        {
//            if(i>top) {
//                top = i;
//                topare = check;
//            }
//            check++;
//        }
//
//        for(int i : priorities)
//        {
//            if(i>num) {
//                st.push(i);
//            }
//        }
//
//        for(int i=topare;i< priorities.length;i++)
//        {
//            if(priorities[i] == num)
//                st.push(priorities[i]);
//        }
//
//        check = 0;
//        for(int i : st)
//        {
//            check ++;
//            if(i == num) answer = check;
//        }
//
//        return answer;
//    }
//}

//    ArrayList<Integer> arr2 = new ArrayList<>();
//
//        for(int i : priorities) {
//                arr.add(i);
//                }
//
//                int[] num = new int[arr.size()];
//
//                for (int i : arr2) {
//                if (arr.get(0) < arr.get(i)) {
//        arr.add(arr.get(0));
//        arr.remove(0);
//        check++;
//        } else check--;
//
//        }
//        if(check > 0) answer = check;
//        else if(check < 0 ) answer = priorities.length+check;
//
//
//        return answer;