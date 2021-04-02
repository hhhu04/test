package calculator;

import java.io.Serializable;
import java.util.Scanner;

public class SelectNumber {

    public static Scanner sc = new Scanner(System.in);
    public static ManageCalculator cal = new ManageCalculator();
    public static String mainNum;
    public static String calNum;
    public static double resultNum;
    public static double changeMainNum;
    public static double changeCalNum;
    public static double checkNum;
    public static int finalNum;
    public static String clockNum;
    public static int checkSelNUm;

    public static String selStart() {
        System.out.println("***계산기***");
        System.out.println("1. 계산 시작");
        System.out.println("2. 종료");
        System.out.print("선택 : ");
        try{
            clockNum = sc.next();
            System.out.println();
            if(clockNum.equals("1") || clockNum.equals("2")) return clockNum;
            if(clockNum.equals("1") != true && clockNum.equals("2") != true) throw new Exception();

        }catch (Exception e)
        {
            System.out.println("1이나 2의 숫자를 입력해 주세요.");
            System.out.println();
            return "0";
        }
        return "0";
    }


    public static void selNum() {

        while (true) {
            try {
                cal.list();
                System.out.print("선택 : ");
                clockNum = sc.next();
                System.out.println();
                if (clockNum.equals("6")) {
                    System.out.println("계산 종료");
                    break;
                }
                checkSelNUm = Integer.parseInt(clockNum);
                if (checkSelNUm > 6 || checkSelNUm < 0 ) throw new Exception();


                System.out.println("계산할 숫자 입력");
                System.out.print("첫번 숫자 입력 : ");
                mainNum = sc.nextLine();
                mainNum = sc.nextLine();
                System.out.println();

                System.out.print("두번 숫자 입력 : ");
                calNum = sc.nextLine();
                if(calNum.equals("0")) throw new ArithmeticException();
                System.out.println();

                changeMainNum = Double.valueOf(mainNum);
                changeCalNum = Double.valueOf(calNum);

                System.out.print("계산 결과 : ");
                resultNum = cal.calculator(clockNum, changeMainNum, changeCalNum);
                if (clockNum.equals("4")) {
                    System.out.print("나머지 버림처리 몫 : ");
                }


                checkNum = resultNum;
                if (checkNum > 0) {
                    if ((resultNum % 1) == 0) {
                        finalNum = (int) resultNum;
                        System.out.println(finalNum);
                    } else {
                        System.out.println(resultNum);
                    }
                } else if (checkNum < 0) {
                    resultNum = resultNum * (-1);
                    if ((resultNum % 1) == 0) {
                        finalNum = ((int) resultNum) * (-1);
                        System.out.println(finalNum);
                    } else {
                        System.out.println(resultNum * (-1));
                    }

                }else if(checkNum == 0.0) {
                    System.out.println("0");
                }

                System.out.println();


            }
           catch (ArithmeticException e)
            {
                System.out.println("0으로 못나눔");
            }

            catch(Exception e)
            {
                System.out.println("올바른 숫자를 입력해 주세요.");
                System.out.println();
            }
        }
    }


}



