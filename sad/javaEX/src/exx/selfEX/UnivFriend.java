package exx.selfEX;

public class UnivFriend extends Friend {

    String major;

    public UnivFriend(String name, String phone, String add, String major) {
        super(name, phone, add);
        this.major = major;
    }

    public void showDate(){
        super.showDate();
        System.out.println("전공 : "+major);
    }

    public void showBasicInfo() {
        System.out.println("전공 : "+major);
    }
}
