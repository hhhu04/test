package coupon;

public class WinningCoupon extends Nomal{
    private static String eventName;
    private static String score;
    private static String grade;

    public WinningCoupon(String person, String phoneNumber,String eventName,String score) {
        super(person, phoneNumber);
        this.eventName = eventName;
        this.score = score;

        if(score.equals("1등")){Nomal.setGrade("GoldCoupon");}
        else if(score.equals("2등")){Nomal.setGrade("SilverCoupon");}
        else if(score.equals("3등")){Nomal.setGrade("BronzCoupon");}
        else {Nomal.setGrade("nomalCoupon");}

    }

    public static String getEventName() {
        return eventName;
    }

    public static void setEventName(String eventName) {
        WinningCoupon.eventName = eventName;
    }

    public static String getScore() {
        return score;
    }

    public static void setScore(String score) {
        WinningCoupon.score = score;
    }

    public static String getGrade() {
        return grade;
    }

    public static void setGrade(String grade) {
        WinningCoupon.grade = grade;
    }

    public void showInputData() {
        super.showInputData();
        System.out.println("행사 : "+eventName);
        System.out.println("등수 : "+score);
    }


}
