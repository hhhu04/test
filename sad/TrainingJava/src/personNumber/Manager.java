package personNumber;

import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

    public static Scanner sc = new Scanner(System.in);
    static private String personNum;
    static private  String checkNum;
    static private int intCheck;
    static private String change;

    public static void inputNUmber() {
        while(true) {
            System.out.println("주민번호를 형식에 맞게 입력해주세요.");
            System.out.println("'xxxxxx-xxxxxxx'의 형식입니다. ");
            System.out.println("입력을 원하지 않으시면 q를 눌러주세요.");
            System.out.print("주민번호 입력 : ");
            personNum = sc.nextLine();
            System.out.println();
            if(personNum.equals("q")) break;

            try {
                //숫자입력햇는지 확인
                checkNum = (String) personNum.subSequence(0,6);
                intCheck = Integer.parseInt(checkNum);
                checkNum = (String) personNum.subSequence(8,14);
                intCheck = Integer.parseInt(checkNum);
                checkNum = (String) personNum.subSequence(7,8);
                intCheck = Integer.parseInt(checkNum);
                if(intCheck >4) throw new Exception();
                checkNum = (String) personNum.subSequence(7,8);
                if(checkNum.equals("-")) throw new Exception();
                if (personNum.length() == 14) {
                    System.out.println("입력 완료.");
                    System.out.println();
                    change = (String) personNum.subSequence(0,8) + "******";
                    System.out.println("해당 주민등록 번호는");
                    System.out.println(" -> "+change+" 입니다. ");
                    System.out.println();

                    break;
                } else {
                    System.out.println("다시 입력하세요.");
                    System.out.println();
                }
            }catch (Exception e)
            {
                System.out.println("주민번호는 숫자입니다.");
                System.out.println();
            }
            finally {
                System.out.println();
            }
        }
    }

}
