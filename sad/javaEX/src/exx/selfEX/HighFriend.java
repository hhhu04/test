package exx.selfEX;

public class HighFriend extends Friend {

    String work;

    public HighFriend(String name, String phone, String add, String job) {
        super(name, phone, add);
        this.work = job;
    }

    public void showDate(){

        super.showDate();
        System.out.println("직업 : "+work);

    }

    public void showBasicInfo()
    {
        System.out.println("이름 : "+name);
        System.out.println("전화 : "+phoneNumber);
    }

}
