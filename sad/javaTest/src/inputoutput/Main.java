package inputoutput;

import java.io.*;

public class Main {

    public static void main(String[] args){

        try{
            writeToFile();
            System.out.println("write");
            addDataToFile("add");
            readFile();
            writeToFile();
        }catch (IOException e){
            System.out.println("file not found");

        }

    }


    public static void writeToFile() throws IOException {

        FileWriter outPut = new FileWriter("./test.txt");

        for(int i=0;i<11;i++){
            String data = "Line num :"+i+"\n";
            outPut.write(data);
        }
        outPut.close();
    }

    public static void readFile() throws  IOException {

        BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
        while(true)
        {
            String line = br.readLine();
            if(line == null) break;
            System.out.println(line);
        }

    }

    public static void addDataToFile(String data) throws IOException {
        FileWriter output = new FileWriter("./test.txt", true);
        output.write(data);
        output.close();

    }

    public static void editFile(int position, String data) throws IOException {

    }

    public static void searchText(String data) throws IOException {

    }


}
