package parking;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public static Scanner sc = new Scanner(System.in);
    ArrayList<String> carNum = new ArrayList<String>();
    ArrayList<String> carTime = new ArrayList<String>(); // 21.03.09 형태의 날자
    ArrayList<String> checkLi = new ArrayList<String>(); // 21.03.09 형태의 날자


    public static void  selNum() {
        String selMenuNum;
        System.out.println("고시시오.");
        System.out.println("1. 정산");
        System.out.println("2. 관리자 메뉴");
        System.out.print("- > ");
        selMenuNum = sc.next();


    }




}
