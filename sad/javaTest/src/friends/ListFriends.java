package friends;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListFriends {
    //
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> friendsName = new ArrayList<String>();


    public static void main(String[] args) throws IOException {
        String n;
        int selectNum;
        int cicle=0;

        while(true)
        {
            System.out.println("####친구목록####");
            start();
            System.out.print("선택 : ");
            try {
                n = sc.next();
                selectNum = Integer.parseInt(n);
                System.out.println();
                listView(selectNum, cicle);
                if (selectNum == 6) break;
                cicle++;
            }
            catch (Exception e) {
                System.out.println("1~6의 숫자를 입력하세요.");
            }
        }


    }

    public static void start(){
        System.out.println("1. 목록");
        System.out.println("2. 추가");
        System.out.println("3. 변경");
        System.out.println("4. 삭제");
        System.out.println("5. 검색");
        System.out.println("6. 종료");
    }

    public static void listView(int num, int cicle) throws IOException {
        String name;

        switch (num)
        {
            case 1:
                if(cicle==0) {System.out.println("null!");}
                else listName();
                break;
            case 2:
                System.out.print("이름 입력 : ");
                inputName();
                break;
            case 3:
                System.out.print("바꿀 이름 입력 : ");
                changeName();
                break;
            case 4:
                System.out.print("삭제 할 이름 :");
                delName();
                break;
            case 5:
                System.out.print("검색 대상 :");
                searName();
                break;
            case 6:
                System.out.println("종료");
                break;
            default:
                System.out.println("다시 입력.");
                break;


        }


    }

    public static void listName() throws IOException {

        System.out.println();

        if(friendsName!=null) {
            for (int i = 0; i < friendsName.size(); i++) {
                System.out.println(" 이름 : " + friendsName.get(i));
            }
        }

    }

    public static void inputName()  {
        String name = sc.nextLine();
        name = sc.nextLine();
        friendsName.add(name);

    }

    public static void changeName()  {

        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println();

        for(int i=0;i<friendsName.size();i++)
        {
            if(name.equals(friendsName.get(i))==true)
            {
                System.out.print("바꾼 이름 입력 : ");
                String rename=sc.nextLine();
                System.out.println();
                friendsName.set(i,rename);

            }


        }

    }

    public static void delName(){

        String name = sc.nextLine();
        name = sc.nextLine();
        friendsName.remove(name);

    }

    public static void searName(){

        String name = sc.nextLine();
        name = sc.nextLine();

        for(int i=0;i<friendsName.size();i++)
        {

            if(name.equals(friendsName.get(i))==true)
            {
                System.out.println("해당 이름 있음.");

            }


        }

    }



}
