package baekjoon;

import java.io.*;

public class B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[10001];

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(bf.readLine());
            arr[num]++;  //arr[num]이 몇개
        }

        for(int i=1; i<=10000; i++) {  //각 숫자의 크키를 저장소로 삼아서 순차로 출력하면 오름차순이됨
            for(int j=0; j<arr[i]; j++) //중복된 숫자 ++한거 출력
                bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
