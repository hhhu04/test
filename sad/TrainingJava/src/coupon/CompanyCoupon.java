package coupon;

public class CompanyCoupon extends Nomal{

    private static String companyName;
//    private static String grade;

    public CompanyCoupon(String person, String phoneNumber, String storeName) {
        super(person, phoneNumber);
        this.companyName =storeName;
        Nomal.setGrade("memberCoupon");
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        CompanyCoupon.companyName = companyName;
    }



    public void showInputData() {
        super.showInputData();
        System.out.println("상호 : "+ companyName);
    }

}
