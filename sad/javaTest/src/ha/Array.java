package ha;


import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> nameList = new ArrayList<String>();

    public static void main(String[] args) {

        boolean run = true;
        int choice = 0;
        printInstruction();


        while(run){

            System.out.print("choice number : ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice){

                case 0:
                    printInstruction();
                    break;
                case 1:
                    System.out.println("목록");
                    break;
                case 2:
                    System.out.print("이름 입력 : ");
                    String name = sc.nextLine();
                    addName(name);
                    break;
                case 3:
                    System.out.println("수정");
                    break;
                case 4:
                    System.out.println("삭제");
                    break;
                case 5:
                    System.out.println("검색");
                    break;
                case 6:
                    System.out.println("종료");
                    run = false;
                    break;
                default:
                    System.out.println("다시 입력.");
                    break;
            }



        }


    }

    public static void printInstruction(){
        System.out.println("시스템 가동 준비 완료");
        System.out.println("0. 메뉴");
        System.out.println("1. 목록");
        System.out.println("3. 추가");
        System.out.println("4. 변경");
        System.out.println("5. 삭제");
        System.out.println("6. 검색");
        System.out.println("7. 종료");
    }

    public static int addName(String name){
        nameList.add(name);
        return 0;
    }

    public static void showName(){

        for(int i=0;i<nameList.size();i++){
            System.out.println((i+1)+" : "+nameList.get(i));
        }

    }

    public static void modifyName(){

    }

    public static void removeName(){

    }

    public static String searceName(){


        return null;
    }





}



