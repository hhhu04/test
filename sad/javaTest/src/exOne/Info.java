package exOne;

public class Info {

    private String sNum;
    private String name;

    public Info(String sNum, String name){

        this.sNum = sNum;
        this.name = name;

    }

    public void showInfo(){
        System.out.println("넘버 : "+sNum);
        System.out.println("물 : "+name);
    }

}
