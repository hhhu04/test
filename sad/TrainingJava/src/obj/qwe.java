package obj;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class qwe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int selectNum;
        String n;

        Pattern pt = Pattern.compile("\\d{6} \\- [1-4]\\d{6}");
        n = sc.next();
        if(n.matches(String.valueOf(pt))) System.out.println("ddd");
        System.out.println(n.matches(String.valueOf(pt)));
//        while (true) {
//            selectNum = 0;
//            System.out.println("####친구목록####");
//            System.out.print("선택 : ");
//            try {
//                selectNum = sc.nextInt();
//                System.out.println();
//                if(selectNum > 5) throw new InputMismatchException();
//                if (selectNum == 6) break;
//            } catch (InputMismatchException e) {
//                System.out.println(e);
//            }



//        }
    }
}
