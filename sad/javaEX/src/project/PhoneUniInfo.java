package project;

public class PhoneUniInfo extends PhoneInfo{

    String major;
    String year;

    public PhoneUniInfo(String name, String phoneNumber, String major,String year) {
        super(name, phoneNumber);
        this.major = major;
        this.year =year;

    }

    public void showPhoneInfo(){

        super.showPhoneInfo();
        System.out.println("전   공 : "+major);
        System.out.println("학   년 : "+year);

    }

}
