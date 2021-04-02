package baekjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M14889 {
    static int min = Integer.MAX_VALUE;

    public static void cal(int[][] arr,boolean[] check)
    {
        int start = 0;
        int link = 0;

        for(int i=0; i<arr.length; i++)
        {

            for(int j= i+1; j<arr[i].length; j++)
            {
                if(check[i] == true && check[j] == true)
                {
                    start += arr[i][j];
                    start += arr[j][i];
                }
                else if(check[i] != true && check[j] != true)
                {
                    link += arr[i][j];
                    link += arr[j][i];
                }
            }

        }
        min = Math.min(Math.abs(start-link),min);
    }


    public static void cicle(int[][] arr, boolean[] check,int idx, int count)
    {
        if(count == arr.length/2)
        {
            cal(arr,check);
            return;
        }

        for(int i=idx;i<arr.length;i++)
        {
            if(!check[i]) {
                check[i] = true;
                cicle(arr, check, i + 1, count + 1);
                check[i] = false;
            }
        }

    }



    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto;
        int personNum = Integer.parseInt(read.readLine());
        int[][] arr = new int [personNum][personNum];
        boolean[] check = new boolean[personNum];

        for(int i=0; i<arr.length;i++)
        {
            sto = new StringTokenizer(read.readLine());
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = Integer.parseInt(sto.nextToken());
            }
        }
        cicle(arr,check,0,0);
        System.out.println(min);
        read.close();
    }
}