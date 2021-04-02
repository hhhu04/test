package par;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class parsing2 {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader("./apache_logs.txt"));
        StringTokenizer sto;
        StringTokenizer par;
        String ip = null;
        String line;
        String token;
        int ipNum=0;
        int httpNum=1;
        int readNum=1;
        int num=1;
        int mac = 1,window=0,linux=0;

        line= read.readLine();
        sto = new StringTokenizer(line," ");
        read.close();
        while(sto.hasMoreTokens())
            System.out.println(sto.nextToken());


//        String q = "GET /favicon.ico HTTP/1.1 200 3638 - Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 Safari/537.36";
//
//        sto = new StringTokenizer(q," ");
//
//        while(sto.hasMoreTokens())
//            System.out.println(sto.nextToken());

    }

}
