package throwex;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> friendsName = new ArrayList<String>();


    public static void main(String[] args) throws Exception {


        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
        Calendar cal = Calendar.getInstance(Locale.KOREA);
        String nal = df.format(cal.getTime());

        System.out.println(nal);

        long time1 = System.currentTimeMillis();
        long time2 = System.currentTimeMillis ();
        System.out.println ( ( time2 - time1 ) / 1000.0 );



    }

}
