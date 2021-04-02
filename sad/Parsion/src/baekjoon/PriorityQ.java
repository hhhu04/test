package baekjoon;


import java.io.IOException;
import java.util.*;

public class PriorityQ {

public static void main(String[] args) throws IOException {

//    int[] l = {1,1,9,1,1,1};
    int[] l = {2,1,3,2};
    System.out.println(solution2(l,2));

    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:priorities) pq.offer(i);


        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int)pq.peek()) {
                    if(i == location){
                        return answer+1;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static int solution2(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;  //로케이션 최댓
        for(int i : priorities)System.out.print(i);
        System.out.println();
        for(int j : que)System.out.print(j);
        System.out.println();
        System.out.println();
//911111

        while(!que.isEmpty()){
            Integer i = que.poll();
            for(int j : que)System.out.print(j);
            System.out.println();
            System.out.println(priorities[size - answer]);
            if(i == priorities[size - answer]){  //출력이 실행되
                answer++;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }


}


//	1	9	0	9 1 1 1 1 1
//            1	9	0	9 1 1 1 1 1
//            9	9	1	1 1 1 1 1
//            1	1	2	1 1 1 1
//            0	1	1	3	1 1 1
//            1	1	4	1 1



