package test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreateNumber {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("\\d{6}-[1-4]\\d{6}");
//        Pattern pattern = Pattern.compile("\\d{2}[0-1][0-9][0-3][0-9]-[1-4]\\d{6}");
//        Pattern pattern = Pattern.compile("\\d{2}[0-9]{2}[0-9]{2}-[1-4]\\d{6}");
        Pattern pattern = Pattern.compile("\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-[1-4]\\d{6}");
//        Pattern pattern = Pattern.compile("\\d{2}(0?[1-9]|1[012])\2([0-9][0-9][0-9][0-9])(0?[1-9]|[12][0-9]|3[01])-[1-4]\\d{6}");

//        (0?[1-9]|1[012])\2([0-9][0-9][0-9][0-9])(0?[1-9]|[12][0-9]|3[01])
//        /^(0?[1-9]|[12][0-9]|3[01])([ \/\-])(0?[1-9]|1[012])\2([0-9][0-9][0-9][0-9])(([ -])([0-1]?[0-9]|2[0-3]):[0-5]?[0-9]:[0-5]?[0-9])?$/




        String number;
        String changeNumber;
        String checkNum;
        while(true) {
                System.out.println();
                System.out.println();
                System.out.print("주민번호 입력 : ");

                try {
                    number = sc.nextLine();
                    checkNum = number;

                    System.out.println();
                    if (number.matches(String.valueOf(pattern))) {
//                        if(checkNum.substring(2,4).equals("00")) throw new Exception();
//                        if(Integer.parseInt(checkNum.substring(2,4)) > 12 ) throw new Exception();
//                        if(checkNum.substring(4,6).equals("00")) throw new Exception();
//                        if(Integer.parseInt(checkNum.substring(4,6)) > 31 ) throw new Exception();
                        if (Integer.parseInt(checkNum.substring(2, 4)) == 02 && Integer.parseInt(number.substring(4, 6)) > 29)
                            throw new Exception();
//                        System.out.println(la(number));

                        if (ch(number, 13, 14) != la(number)) throw new Exception();


                        changeNumber = number.substring(0, 8) + "******";

                        System.out.print("주민번호 출력 : ");
                        System.out.println(changeNumber);
                        break;
//                    }else System.out.println(number+" "+number.matches(String.valueOf(pattern)));
                    }else throw new Exception();

                }catch (Exception e) { System.out.println("형식에 맞게 입력해주세요."); }

//                }else {
//                    System.out.println("주민등록번호는 ");
//                    System.out.println("형식에 맞게 입력해주세요.");
//                }

        }
    }

    public static int ch(String num, int a, int b){
        int result;
        result = Integer.parseInt(num.substring(a,b));
        return result;
    }

    public static int la(String num){

        int lastNmm = 11-((2*(ch(num,0,1))+
                3*(ch(num,1,2))+4*(ch(num,2,3))+
                5*(ch(num,3,4))+6*(ch(num,4,5))+
                7*(ch(num,5,6))+8*(ch(num,7,8))+
                9*(ch(num,8,9))+2*(ch(num,9,10))+
                3*(ch(num,10,11))+4*(ch(num,11,12))+
                5*(ch(num,12,13))) % 11);

        if(lastNmm > 9) lastNmm -= 10;

        return lastNmm;
    }

}
