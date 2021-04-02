package calculator;

public class ManageCalculator {
    static double result;


    public static void list(){
        System.out.println("***선택***");
        System.out.println("1. 더하기");
        System.out.println("2. 뺴기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("5. 나머지");
        System.out.println("6. 종료");
    }

    public static double calculator(String num,double mainNum, double calNum){

        switch (num)
        {

            case "1":
                result = adder(mainNum, calNum);
                break;
            case "2":
                result = subtract(mainNum, calNum);
                break;
            case "3":
                result = multiply(mainNum, calNum);
                break;
            case "4":
                result = division(mainNum, calNum);

                break;
            case "5":
                result = remainder(mainNum, calNum);

                break;

            default:


        }


        return result;
    }

    public static double adder(double mainNum, double calNum){

        result = mainNum + calNum;

        return result;
    }

    public static double subtract(double mainNum, double calNum){

        result = mainNum - calNum;

        return result ;
    }

    public static double multiply(double mainNum, double calNum){

        result = mainNum * calNum;

        return result ;
    }

    public static double division(double mainNum, double calNum){

        result = mainNum / calNum;
        if(result % 1 > 0) {
            result = Math.floor(result);
        }
        if(result % 1 <0) {
            result = Math.floor(result)+1;
        }
        return result ;
    }

    public static double remainder(double mainNum, double calNum){

        result = mainNum % calNum;

        if(result == 0) return 0;

        return result ;
    }

}
