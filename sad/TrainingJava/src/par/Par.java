package par;

import java.io.*;
import java.util.StringTokenizer;


public class Par {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader("/home/cat/IdeaProjects/TrainingJava/apache_logs.txt"));
        BufferedWriter write = new BufferedWriter(new FileWriter("./sample.csv"));
        StringTokenizer sto;
        String ip = "";
        String code = "";
        String line;
        String checkIp;
        String check;
        String get = "\"GET";
        String lastLine;
        String url = "";
        int ipNum=0;
        int httpNum=0;
        int readNum=0;
        int mac = 0,window=0,linux=0,android=0;
        int addNum=0;

//        line = read.readLine();
        while(true) {
            if((line = read.readLine()) == null) break;
            if(line != null) {
                sto = new StringTokenizer(line," ");
                checkIp = sto.nextToken();
                if (checkIp.equals("68.184.202.186")) ipNum++;
//                if(line.matches(".*Mac.*")) mac++;
//                if(line.matches(".*Windows.*")) window++;
//                if(line.matches(".*Linux.*")) linux++;
//                if(line.matches(".*Android.*")) android++;
                if(line.matches(".*200.*")) httpNum++;
                while (sto.hasMoreTokens()) {
                    check = sto.nextToken();
//                    if (check.equals("200")) httpNum++;
                    if(check.equals(get)) {
                        ip = sto.nextToken();
                        code = sto.nextToken();
                        code = sto.nextToken();
                        url = sto.nextToken();
                        url = sto.nextToken();
                    }
                    if(check.equals("Mac")) mac++;
                    if(check.equals("Windows")) window++;
                    if(check.equals("(Windows")) window++;
                    if(check.equals("Linux")) linux++;
                    if(check.equals("Linux;")) linux++;
                    if(check.equals("Android")) android++;

                }

                write.write("IP"+","+checkIp+","+"URL?"+","+ip+","+"영문url"+","+url+","+"응답코드"+","+code+"\n");

            }
            addNum++;
            readNum++;
        }
        write.flush();
        write.close();
        read.close();

        write = new BufferedWriter(new FileWriter("./header.csv"));
        write.write("68.184.202.186의 개수"+","+ipNum+","+"200코드 수"+","+httpNum+","+"mac"+","+mac
                    +","+"window"+","+window+","+"linux"+","+linux+","+"android"+","+android+"\n");
        write.flush();
        write.close();

        write = new BufferedWriter(new FileWriter("./output.csv"));
        read = new BufferedReader(new FileReader("./header.csv"));
        while(true)
        {
            lastLine = read.readLine();
            if(lastLine == null) break;
            write.write(lastLine+"\n");
        }

        read = new BufferedReader(new FileReader("./sample.csv"));
        while(true)
        {
            lastLine = read.readLine();
            if(lastLine == null) break;
            write.write(lastLine+"\n");
        }
        write.flush();
        write.close();
        read.close();


        System.out.println(addNum);
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
