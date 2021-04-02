package throwex;

import java.util.Scanner;

public class ThrowEX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] inputNumber = new int[2];
        int result;

        try{
        System.out.print("첫번째 숫자 입력 : ");
        inputNumber[0] = sc.nextInt();

        System.out.print("두번째 숫자 입력 : ");
        inputNumber[2] = sc.nextInt();
        result = divideByZero(inputNumber[0], inputNumber[1]);
    }catch (Exception e)
        {
            System.out.println("애러");
        }

    }

    public static int divideByZero(int x,int y) throws Exception{

        return x / y;
    }

}
