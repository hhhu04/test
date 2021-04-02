package calculator;

import java.util.Scanner;

public class Calculator {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SelectNumber sel = new SelectNumber();
        ManageCalculator cal = new ManageCalculator();
//
        while (true){
            String stringNum=sel.selStart();
            if(stringNum.equals("1")) SelectNumber.selNum();
            else if(stringNum.equals("2")) break;
            else System.out.println();



        }
    }
}


//        ManageCalculator cal = new ManageCalculator();
//
//        String mainNum;
//        String calNum;
//        double resultNum;
//        double changeMainNum;
//        double changeCalNum;
//        double checkNum;
//        int finalNum;
//
//        while (true) {
//            int clockNum = 0;
//            System.out.println("***계산기***");
//            System.out.println("1. 계산 시작");
//            System.out.println("2. 종료");
//            System.out.print("선택 : ");
//            try{
//                clockNum = sc.nextInt();
//                System.out.println();
//                if(clockNum == 2) {System.out.println("계산기 종료."); break;}
//            }catch (Exception e)
//            {
//                System.out.println("1이나 2의 숫자를 입력해 주세요.");
//            }
//
//            try {
//
//                while (true)
//                {
//                    cal.list();
//                    System.out.print("선택 : ");
//                    clockNum = sc.nextInt();
//                    System.out.println();
//                    if(clockNum == 6) {System.out.println("계산 종료"); break;}
//
//                    System.out.println("계산할 숫자 입력");
//                    System.out.print("첫번 숫자 입력 : ");
//                    mainNum = sc.nextLine();
//                    mainNum = sc.nextLine();
//                    System.out.println();
//
//                    System.out.print("두번 숫자 입력 : ");
//                    calNum = sc.nextLine();
//                    System.out.println();
//
//                    changeMainNum = Double.valueOf(mainNum);
//                    changeCalNum = Double.valueOf(calNum);
//
//                    System.out.print("계산 결과 : ");
//                    resultNum = cal.calculator(clockNum, changeMainNum, changeCalNum);
//                    if(clockNum == 4) {
//                        System.out.print("나머지 버림처리");
//                    }
//
//
//                    checkNum = resultNum;
//                    if(checkNum > 0) {
//                        if ((resultNum % 1) == 0) {
//                            finalNum = (int)resultNum;
//                            System.out.println(finalNum);
//                        }
//                        else {System.out.println(resultNum);}
//                    }
//                    else if(checkNum < 0)
//                    {
//                        resultNum=resultNum*(-1);
//                        if ((resultNum % 1) == 0) {
//                            finalNum = ((int)resultNum)*(-1);
//                            System.out.println(finalNum);
//                        }
//                        else {System.out.println(resultNum*(-1));}
//
//                    }
//
//                    System.out.println();
//
//                }
//
//            }catch (Exception e)
//            {
//                System.out.println("숫자를 입력해 주세요.");
//            }
//
//        }

//    }
//
//}
