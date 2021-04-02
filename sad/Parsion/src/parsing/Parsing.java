package parsing;


import java.io.*;
import java.util.StringTokenizer;

public class Parsing {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader("./apache_logs.txt"));
        BufferedReader readOne = new BufferedReader(new FileReader("./apache_logs.txt"));
        BufferedWriter one = new BufferedWriter(new FileWriter("./one.csv"));
        BufferedWriter write = new BufferedWriter(new FileWriter("./sample.csv"));
        StringTokenizer sto,stv;
        String ip = "";
        String code = "";
        String line,lineOne;
        String checkIp;
        String check;
        String get = "\"GET";
        String lastLine;
        String url = "";
        boolean test;
        int ipNum=0;
        double httpNum=0;
        int readNum=0;
        int mac = 0,window=0,linux=0,android=0;
        int addNum=0;
        String os = "기타";
        int oneReadCheck = 0;
//        while(true)
//        {
//            if((lineOne = readOne.readLine()) == null) break;
//            oneReadCheck++;
//            stv = new StringTokenizer(lineOne, " ");
//            while(stv.hasMoreTokens())
//            {
//                one.write(stv.nextToken()+",");
//
//            }
//            one.write("\n");
//        }
//        readOne.close();
//        one.flush();
//        one.close();

        String[] sp;

        while(true)
        {
            if((lineOne = readOne.readLine()) == null) break;
            oneReadCheck++;
            sp = lineOne.split(" ");
            for(int i=0;i<sp.length;i++)
            {
                one.write(sp[i]+",");
            }
            one.write("\n");
        }
        readOne.close();
        one.flush();
        one.close();



        while(true) {
            if((line = read.readLine()) == null) break;

            sto = new StringTokenizer(line, " ");
            checkIp = sto.nextToken();
            if (checkIp.equals("68.184.202.186")) ipNum++;
            while (sto.hasMoreTokens()) {
                test=false;
                check = sto.nextToken();
                if (check.equals(get)) {
                    ip = sto.nextToken();
                    code = sto.nextToken();
                    code = sto.nextToken();
                    if(code.equals("200")) httpNum++;
                    url = sto.nextToken();
                    url = sto.nextToken();
                }
                if (check.equals("Mac")) {mac++; os="mac";}
                if (test = (check.equals("(Windows"))) {window++; os="window";}
                if (check.equals("Windows") && test != true) {window++; os="window";}
                test=false;
                if (check.equals("Linux")) {linux++; os = "linux";}
                if (check.equals("x86_64-linux;")) {linux++; os = "linux";}
                if (test=(check.equals("Android"))) {android++; os = "android";}
                if(test == false && check.equals("(linux;")) {linux++; os="linux";}

            }


            write.write("IP" + "," + checkIp + "," + "URL?" + "," + ip + "," + "영문url" + "," + url + "," + "응답코드" + "," + code +","+ "\n");
            addNum++;
            readNum++;

        }

        write.flush();
        write.close();
        read.close();


        int num = readNum-(mac+window+linux);

        write = new BufferedWriter(new FileWriter("./output.csv"));
        write.write("68.184.202.186의 개수"+","+ipNum+","+"200코드 비율"+","+httpNum/100+"%"+","+"mac"+","+mac
                +","+"window"+","+window+","+"linux"+","+linux+","+"android"+","+android+","+"나머지"+","+num+"\n");

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







//        write = new BufferedWriter(new FileWriter("./header.csv"));
//        write.write("68.184.202.186의 개수"+","+ipNum+","+"200코드 비율"+","+httpNum/100+"%"+","+"mac"+","+mac
//                +","+"window"+","+window+","+"linux"+","+linux+","+"android"+","+android+","+"나머지"+","+num+"\n");
//        write.flush();
//        write.close();
//
//        write = new BufferedWriter(new FileWriter("./output.csv"));
//        read = new BufferedReader(new FileReader("./header.csv"));
//        while(true)
//        {
//            lastLine = read.readLine();
//            if(lastLine == null) break;
//            write.write(lastLine+"\n");
//        }
//
//        read = new BufferedReader(new FileReader("./sample.csv"));
//        while(true)
//        {
//            lastLine = read.readLine();
//            if(lastLine == null) break;
//            write.write(lastLine+"\n");
//        }
//        write.flush();
//        write.close();
//        read.close();



        System.out.println("1번 읽을수 : "+oneReadCheck);
        System.out.println("읽은 데이터 수 : "+addNum);
        System.out.println("68.184.202.186수 : "+ipNum);
        System.out.println("코드 200 수 : "+httpNum);
        System.out.println("코드 200 비율 : "+httpNum/100+"%");
        System.out.println("mac os 수 : "+mac);
        System.out.println("windows 수 : "+window);
        System.out.println("linux 수 : "+linux);
        System.out.println("안드로이드 수 : "+android);
        System.out.println("나머지 os 수 : "+(addNum-linux-mac-window-android));



    }
}
