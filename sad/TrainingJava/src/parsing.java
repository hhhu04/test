import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class parsing {
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
        while(line != null) {
            readNum++;
            line= read.readLine();
            if(line != null) {
                sto = new StringTokenizer(line," ");
                token = sto.nextToken();
                if (token.equals("68.184.202.186")) ipNum++;
                if(line.matches(".*Mac.*")) mac++;
                if(line.matches(".*Windows.*")) window++;
                if(line.matches(".*Linux.*")) linux++;
                while (sto.hasMoreTokens()) if(sto.nextToken().equals("200")) httpNum++;

                while (true) {
                    ip = sto.nextToken();
                    if(ip.equals("\"GET")) {
                        ip = sto.nextToken();
                        break;
                    }


                }
            }
        }
        read.close();



        System.out.println(ipNum);
        System.out.println(httpNum);
        System.out.println(readNum);
        System.out.println(mac);
        System.out.println(window);
        System.out.println(linux);
        System.out.println(ip);



    }

}
