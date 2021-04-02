package friends;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InputFriends {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> friendsName = new ArrayList<String>();


    public static void main(String[] args) throws IOException {

        int listNUm=0;
        System.out.println("기존 목록 불러오는중......");
        try {
            BufferedReader readTxtName = new BufferedReader(new FileReader("./FriendsNameList.txt"));
            while (true) {
                String nameIn = readTxtName.readLine();
                if (nameIn == null) break;
                friendsName.add(nameIn);

            }
            listNUm=1;
            System.out.println("완료.");
            readTxtName.close();
        }catch (Exception e)
        {System.out.println("기존 목록이 없습니다.");}



//        System.out.println("선택");
//        System.out.println("1. 기존 목록 ");
//        System.out.println("2, 새로운 목록");
//        System.out.print("선택 : ");
//        int select=sc.nextInt();
//        System.out.println();
//        if(select == 1){
//            BufferedReader readTxtName = new BufferedReader(new FileReader("./FriendsNameList.txt"));
//            while(true)
//            {
//                String nameIn = readTxtName.readLine();
//                if(nameIn == null) break;
//                friendsName.add(nameIn);
//
//            }
//        }
//        else{
//            createTxt();
//        }

        String nullPoint="  ";
//        if(select == 1) listNUm=1;
        int selectNum;
        while(true)
        {
            System.out.println("####친구목록####");
            start();
            System.out.print("선택 : ");
            selectNum = sc.nextInt();
            System.out.println();

            listView(selectNum, listNUm);
            if(selectNum==6) {
                FileOutputStream out = new FileOutputStream("./FriendsNameList.txt");
                int i=0;
                while(true)
                {
                    if(friendsName.size() == i) break;
                    out.write((friendsName.get(i)+nullPoint+"\n").getBytes());
//                    out.write((friendsName.get(i).getBytes()));
                    i++;
                }
                out.close();
                break;
            }

            listNUm++;

        }


    }



    public static void start() throws IOException {

        System.out.println("1. 목록");
        System.out.println("2. 추가");
        System.out.println("3. 변경");
        System.out.println("4. 삭제");
        System.out.println("5. 검색");
        System.out.println("6. 종료");
    }

    public static void listView(int num, int listNum) throws IOException {
        String name;

        switch (num)
        {
            case 1:
                listName(listNum);
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

    public static void listName(int num) throws IOException {

        System.out.println();

        if(num != 0) {
            for (int i = 0; i < friendsName.size(); i++) {
                System.out.println(" 이름 : " + friendsName.get(i));
            }
        }
        else{
            System.out.println("null!");
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
