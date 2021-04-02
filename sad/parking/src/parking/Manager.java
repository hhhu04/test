package parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Manager {

    static Scanner sc = new Scanner(System.in);
    CarNumber car = new CarNumber();
    MainMenu menu = new MainMenu();
    Calendar now = Calendar.getInstance();
    String today;
    SimpleDateFormat forTime = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA);
    Date nowTime = new Date();


    public static String selLicense(String num){

        System.out.println("고르세요.");
        System.out.println("1. 정기등록");
        System.out.println("2. 정기갱신");
        System.out.println("3. 단기고객");
        System.out.println("4. 정기일반");
        System.out.print("- > ");

        switch (num)
        {
            case "1":
                System.out.println("정기갱신");
                System.out.println();
                selTime();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                break;
        }

        return null;
    }

    public static String selTime(){
        System.out.println("기간을 설정하세요.");
        System.out.print("- > ");
        String whilePark;
        whilePark = sc.next();
        System.out.println();
        return whilePark;

    }

    public static void checkCD(){
        String num;
        System.out.println("할인권/쿠폰이 있으십니까?");
        System.out.print("- > ");
        num = sc.next();
        System.out.println();

        if(num.equals("1")){
            System.out.println("바코드를 스캔하세요");
        }


    }


    //정기등록 날자를 기준으로 현재날자를 비교해 잔여일 산출
    public void checkMonth(){
        String num = "2021.03.05 20:24:20";
        Calendar changeToday = null;
        Calendar change = null;
        today = forTime.format(nowTime);
        System.out.println("차량번호 입력.");
        System.out.print("- > ");
//        num = sc.nextLine();
        System.out.println();
        int num1,num2,num3;
//        num1 = Integer.parseInt(serchTime(num).substring(0,5));
//        num2 = Integer.parseInt(serchTime(num).substring(6,8));
//        num3 = Integer.parseInt(serchTime(num).substring(9,11));
//        change.set(num1,num2,num3);
        change.set(2021,3,5);
        num1 = Integer.parseInt(today.substring(0,5));
        num2 = Integer.parseInt(today.substring(6,8));
        num3 = Integer.parseInt(today.substring(9,11));
        changeToday.set(num1, num2, num3);

        int count = 0;
        while ( !change.after ( changeToday ) ) {
            count++;
            //다음날로 바뀜
            change.add ( Calendar.DATE, 1 );
            System.out.println ( change.get ( Calendar.YEAR ) + "년 " +
                    ( change.get ( Calendar.MONTH ) + 1 ) + "월 " + change.get ( Calendar.DATE ) + "일" );
        }
        System.out.println ( "기준일로부터 " + count + "일이 지났습니다." );


    }
//입차과정 번호판 스캔 입력으로 대체
    public void inCar(){
        String fNum;

        System.out.println("차량번호 입력");
        System.out.print("- > ");
        fNum = sc.nextLine();
        today = forTime.format(forTime);

        car.setCarNumber(fNum);
        car.setCheck(today);
        System.out.println("차량번호 : "+fNum);
        System.out.println("현재시간 : "+today);
        System.out.println("입장하세요.");

        menu.carNum.add(fNum);
        menu.carTime.add(today);
        menu.checkLi.add(null);

    }

    public String checkTime(){

        today = forTime.format(nowTime);

        return today;
    }

    public String serchTime(String number){
        String num = "-1";
        for(int i=0;i<menu.carNum.size();i++)
        {
            if(number.equals(menu.carNum.get(i)))
            {
                num = menu.carTime.get(i);
                break;
            }
        }



        return num;
    }

}
