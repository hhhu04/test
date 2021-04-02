package par;

import java.io.*;
import java.util.StringTokenizer;


public class Pars {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader("./apache_logs.txt"));
        BufferedWriter write = new BufferedWriter(new FileWriter("./five2.csv"));
        StringTokenizer sto;
        String ip = "";
        String code = "";
        String line;
        String checkIp;
        String check;
        String get = "\"GET";
        String lastLine;
        String os = null;
        int ipNum=0;
        int httpNum=1;
        int readNum=1;
        int mac = 1,window=0,linux=0,android=0;

        line = read.readLine();
        while(line != null) {
            readNum++;
            line= read.readLine();
            if(line != null) {
                sto = new StringTokenizer(line," ");
                checkIp = sto.nextToken();
                if (checkIp.equals("68.184.202.186")) ipNum++;
                if(line.matches(".*Mac.*")) {
                    mac++;
                    os="mac";
                }
                if(line.matches(".*Windows.*")) {window++;os="windows";}
                if(line.matches(".*Linux.*")) {linux++;os="linux";}
                while (sto.hasMoreTokens()) {
                    check = sto.nextToken();
                    if (check.equals("200")) httpNum++;
                    if(check.equals(get)) {
                        ip = sto.nextToken();
                        code = sto.nextToken();
                        code = sto.nextToken();

                    }
//                    if(check.equals("Mac")) mac++;
//                    if(check.equals("Windows") || check.equals("(Windows")) {
//                        window++;
//                        if(check.equals("Windows") && check.equals("(Windows")) window--;
//                    }
//                    if(check.equals("Linux")) linux++;
                    if(check.equals("Android")) android++;

                }

                write.write("IP"+","+checkIp+","+"URL"+","+ip+","+"응답코드"+","+code+","+os+"\n");



            }
        }
        write.flush();
        write.close();
        read.close();

        write = new BufferedWriter(new FileWriter("./insert2.csv"));
        write.write("68.184.202.186의 개수"+","+ipNum+","+"200코드 수"+","+httpNum+","+"mac"+","+mac
                    +","+"window"+","+window+","+"linux"+","+linux+","+"android"+","+android+"\n");
        write.flush();
        write.close();

        write = new BufferedWriter(new FileWriter("./output2.csv"));
        read = new BufferedReader(new FileReader("./insert2.csv"));
        while(true)
        {
            lastLine = read.readLine();
            if(lastLine == null) break;
            write.write(lastLine+"\n");
        }

        read = new BufferedReader(new FileReader("./five2.csv"));
        while(true)
        {
            lastLine = read.readLine();
            if(lastLine == null) break;
            write.write(lastLine+"\n");
        }
        write.flush();
        write.close();
        read.close();


        System.out.println(ipNum);
        System.out.println(httpNum);
        System.out.println(readNum);
        System.out.println(mac);
        System.out.println(window);
        System.out.println(linux);
        System.out.println(android);
        System.out.println(ip);
        System.out.println(code);



    }

}
