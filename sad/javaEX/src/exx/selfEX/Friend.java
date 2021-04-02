package exx.selfEX;

public abstract class Friend {

    String name;
    String phoneNumber;
    String add;

    public Friend(String name, String phone, String add)
    {
        this.name = name;
        this. phoneNumber = phone;
        this.add = add;
    }

    public void showDate(){
        System.out.println("이름 : "+ name);
        System.out.println("전화 : "+ phoneNumber);
        System.out.println("주소 : "+ add);
    }

    public abstract void showBasicInfo();
}
