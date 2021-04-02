package baekjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class crain {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto;
        int[][] board;
        int[] moves;
        int num = Integer.parseInt(read.readLine());
        board = new int[num][num];
        for(int i=0; i< board.length;i++)
        {
            sto = new StringTokenizer(read.readLine()," ");
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j] = Integer.parseInt(sto.nextToken());
            }
        }

        int i=0;
        moves = new int[Integer.parseInt(read.readLine())];
        sto = new StringTokenizer(read.readLine()," ");
        while (sto.hasMoreTokens()) {
            moves[i] = Integer.parseInt(sto.nextToken());
            i++;
        }

        System.out.println(solution(board,moves));

        read.close();

    }
}
//6
//0 0 0 0 0 0
//1 2 3 1 2 3
//4 2 3 1 2 3
//4 2 3 1 6 2
//6 6 2 1 5 1
//4 2 3 5 1 2
//4
//4 4 5 1