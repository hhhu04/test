package coupon;

public class Nomal {

    private static String name;
    private static String phoneNumber;
    private static String grade;

    public Nomal(String person,String phoneNumber){
        this.name = person;
        this.phoneNumber = phoneNumber;
        grade = "nomalCoupon";

    }



    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Nomal.name = name;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        Nomal.phoneNumber = phoneNumber;
    }

    public static String getGrade() {
        return grade;
    }

    public static void setGrade(String grade) {
        Nomal.grade = grade;
    }

    public void showInputData(){
        System.out.println("이름 : "+ name);
        System.out.println("번호 : "+ phoneNumber);
        System.out.println("등급 : "+ grade);
    }


}
