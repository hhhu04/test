package baekjoon;


import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class q2 {

    public static void main(String[] args) throws IOException {

//        int[] l = {10,10,10,10,10,10,10,10,10,10};
//        System.out.println(solution(100, 100, l));

//        int[] l = {10};
//        System.out.println(solution(100, 100, l));

        int[] l = {7,4,5,6};
        System.out.println(solution(2, 10, l));

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int in_weight=0;
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i : truck_weights)
        {
            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(i);
                    in_weight += i;
                    answer++;
                    break;
                }
                else if(queue.size() == bridge_length){
                    in_weight -= queue.poll();
                }
                else{
                    if(in_weight + i > weight){
                        answer++;
                        queue.add(0);
                    }
                    else{
                        queue.add(i);
                        in_weight+=i;
                        answer++;
                        break;
                    }
                }
            }

        }


        return answer+bridge_length;
    }
}

//
//for(int i : bridge) System.out.print(i);
//        System.out.println();










