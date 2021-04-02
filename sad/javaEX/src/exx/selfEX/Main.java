package exx.selfEX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FriendInfoHandler handler = new FriendInfoHandler(10);

        while(true)
        {

            System.out.println("*****메뉴 선택*****");
            System.out.println("1. 고교 정보 저장");
            System.out.println("2. 대학 정보 저장");
            System.out.println("3. 전체 정보 출력");
            System.out.println("4. 기본 정보 출력");
            System.out.println("5. 종료");
            System.out.print("선택 >> ");

            Scanner sc = new Scanner(System.in);

            int choice=sc.nextInt();

            if(choice == 1){handler.addFriend(choice);}
            else if(choice == 2){handler.addFriend(choice);}
            else if(choice == 3) {handler.showAllData();}
            else if(choice == 4) {handler.showAllSimpleData();}
            else if(choice == 5) {break;}
            else{
                System.out.println("다시 입력하세요.");
            }

        }

    }
}
