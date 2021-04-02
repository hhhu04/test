package coupon;

import java.util.ArrayList;

public class Manager {

    static Nomal per;
    static ArrayList<String> couponList = new ArrayList<String>(); // db대체

    public static void inputData(){
        per = new CompanyCoupon("홍길동", "010-9422-3717", "bus");
        String obj = per.getName()+per.getPhoneNumber()+per.getGrade()+" ";
        couponList.add(obj);
        per.showInputData();
    }

    public static void showYourCoupon(){
        System.out.print("쿠폰은 : ");
        if(per.getGrade().equals("nomalCoupon")) {System.out.println("10% 할인");}
        else if(per.getGrade().equals("companyCoupon")) {System.out.println("20% 할인");}
        else if(per.getGrade().equals("GoldCoupon")) {System.out.println("30% 할인");}
        else if(per.getGrade().equals("SilverCoupon")) {System.out.println("20% 할인");}
        else if(per.getGrade().equals("BronzCoupon")) {System.out.println("15% 할인");}
        else {System.out.println("어딘가 잘못됨...");}
    }

}
