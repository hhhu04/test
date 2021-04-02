package parking;

public class CarNumber {

    private String carNumber;
    private String check;




    public String getCarNumber() {
        return carNumber;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public CarNumber(){

    }

    public void showCarNumber(){
        System.out.println("해당 차량의 번호는 : "+ carNumber );
        System.out.println();
    }

}
