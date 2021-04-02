package ex.SN;

import java.util.ArrayList;
import java.util.Scanner;

public class SNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> sNum = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();


        String num;
        int cicle =1;
        String obj;
        String to = null;
        String res;
        String searObj;

        while (true) {
            System.out.println("고르시오");
            System.out.println("1.넘버 등록");
            System.out.println("2.넘버 검색");
            System.out.println("3.종료를 원하면 q 입력");
            System.out.print("선택 : ");
            num = sc.nextLine();
            System.out.println();
            if (num.equals("1")) {

                System.out.print("물품 입력 : ");
                obj = sc.nextLine();
                System.out.println();
                String equlOne = inNumber(obj);
                cicle=1;

//                for (int i = 0; i < sNum.size(); i++) {
//                    String equlTwo = inNumber(sNum.get(i));
//                    if (equlOne.equals(equlTwo)==true) {cicle++;}
//                }

                for(int i=0; i<name.size();i++){

                    searObj = obj.toUpperCase();
                    if(searObj.equals(name.get(i))) {cicle++;}


                }


                if (cicle < 10) {
                    to = "000" + Integer.toString(cicle);
                } else if (cicle < 100) {
                    to = "00" + Integer.toString(cicle);
                } else if (cicle < 1000) {
                    to = "0" + Integer.toString(cicle);
                } else {
                    System.out.println("용량 초과");
                }
                String ex = equlOne + to;
                sNum.add(ex);
                name.add(obj.toUpperCase());

                System.out.print(obj+"의 시리얼 넘버는 : ");
                System.out.println(ex+" 입니다. ");
                System.out.println();


            } else if (num.equals("2")) {
                System.out.println("검색을 원하는 제품을 입력하세요.");
                System.out.print("물품 입력 : ");
                obj = sc.nextLine();

                if(sNum.size() > 0) {
                    System.out.print(obj + "의 시리얼 넘버 : ");
                    searObj = obj.toUpperCase();
                    int count=0;
                    for (int i = 0; i < name.size(); i++) {

                        if (searObj.equals(name.get(i))) {
                            count++;
                            res = sNum.get(i);
                            System.out.print(res + " ");
                        }


                    }
                    if(count == 0) System.out.println("해당 제품이 없습니다.");
                    System.out.println();
                }else {
                    System.out.println("등록된 제품이 없습니다.");
                }
                System.out.println();


            } else if (num.equals("q")) break;

            else {
                System.out.println("다시입력");
                System.out.println();
            }

        }

    }


    public static String inNumber(String obj) {
        String sNum;

        sNum = (String) obj.toUpperCase().subSequence(0, 2);

        return sNum;
    }



}
