package java.project.parking;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public EchoServer(){
        try{
            ServerSocket ss = new ServerSocket(3000);
            System.out.println("=== 서버 가동 ===");

            Socket s = ss.accept();
            System.out.println("= 클라이언트 연결 소켓 생성 =");

            InetAddress userInfo = s.getInetAddress();
            String ip = userInfo.getHostAddress();
            System.out.println("[" + ip + "] 님 접속");

            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));

            String message = br.readLine();
            System.out.println("[메세지]" + message);

            bw.write("["+ip+"]님 환영합니다. \n");
            bw.flush();
        }catch(IOException e){
            System.out.println("[경고] 해당 PORT는 사용중입니다.");
        }
    }

    public static void main(String[] args){
        new EchoServer();
    }



}
