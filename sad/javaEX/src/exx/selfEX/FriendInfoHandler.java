package exx.selfEX;

import java.util.Scanner;

public class FriendInfoHandler {
    private Friend[] myFriends;
    private int numOfFriends;

    public FriendInfoHandler(int num){
        myFriends = new Friend[num];
        numOfFriends=0;
    }

    private void addFriendInfo(Friend friendNum){
        myFriends[numOfFriends++]=friendNum;
    }

    public void addFriend(int choice){
        String name,phoneNum,add,job,major;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : "); name = sc.nextLine();
        System.out.print("전화 : "); phoneNum = sc.nextLine();
        System.out.print("주소 : "); add = sc.nextLine();

        if(choice == 1){
            System.out.print("직업 : "); job=sc.nextLine();
            addFriendInfo(new HighFriend(name,phoneNum,add,job));
        }
        else if(choice == 2){
                System.out.print("학과 : "); major=sc.nextLine();
                addFriendInfo(new UnivFriend(name,phoneNum,add,major));
        }
        else{
            System.out.println("어디친구냐");
        }
        System.out.println();
        System.out.println("입력 완료! \n");
        System.out.println();
    }

    public void showAllData() {
        for(int i=0;i<numOfFriends;i++){
            myFriends[i].showDate();
            System.out.println("");
        }
    }

    public void showAllSimpleData() {
        for(int i=0;i<numOfFriends;i++){
            myFriends[i].showBasicInfo();
            System.out.println("");
        }
    }



}
