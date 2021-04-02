package hellow;

import java.util.Scanner;

public class SeNumber {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[][] array = new String[100][2];
        int num;
        int cnt = 0;
        String obj;
        String to = null;

        while (true) {

            obj = null;
            System.out.println("고르시오");
            System.out.println("1.넘버 등록");
            System.out.println("2.넘버 검색");
            System.out.println("3.종료");
            System.out.print("선택 : ");
            num = sc.nextInt();
            System.out.println();
            if (num == 1) {
                cnt++;
                System.out.print("물품 입력 : ");
                obj = sc.nextLine();
                obj = sc.nextLine();
                System.out.println();
                if (cnt < 10) {
                    to = "000" + Integer.toString(cnt);
                } else if (cnt < 100) {
                    to = "00" + Integer.toString(cnt);
                } else if (cnt < 1000) {
                    to = "0" + Integer.toString(cnt);
                } else {
                    System.out.println("용량 초과");
                }
//                System.out.println(obj);
//                System.out.println(inNumber(obj));
                String ex = inNumber(obj) + to;
//                System.out.println(ex);
                array[cnt - 1][0] = ex;
                array[cnt - 1][1] = obj;
            } else if (num == 2) {
                System.out.print("물품 입력 : ");
                obj = sc.nextLine();
                obj = sc.nextLine();
                System.out.println();
//                selNum(obj);
            } else if (num == 3) break;
            else {
                System.out.println("다시입력");
            }
        }

    }




    public static String inNumber(String obj){
        String sNum;

        sNum= (String) obj.toUpperCase().subSequence(0,2);

        return sNum;
    }

//    public static void selNum(String obj){
//
//        String res =null ;
//
//        for(int i = 0; i<array.length; i++){
//            if(array[i][1]==obj){
//                res = array[i][0];
//                return res;
//            }
//            else{
//                res="일치하는 목록이 없습니다.";
//            }
//        }
//
//        return res;
//
//
//
//    }

}
