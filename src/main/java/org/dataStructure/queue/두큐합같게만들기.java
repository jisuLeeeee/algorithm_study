package org.dataStructure.queue;

import java.util.Queue;
import java.util.ArrayDeque;
public class 두큐합같게만들기 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        long sum1 = 0;
        long sum2 = 0;

        for(int i=0; i<queue1.length; i++){
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
            sum1 = sum1 + queue1[i];
            sum2 = sum2 + queue2[i];
        }

        int num = 0;
        while(sum1 != sum2){
            if(q1.isEmpty() || q2.isEmpty() || answer == queue1.length * 4){
                return -1;
            }
            else if(sum1 < sum2){
                num = q2.poll();
                q1.offer(num);
                sum1 = sum1 + num;
                sum2 = sum2 - num;
            }
            else {
                num = q1.poll();
                q2.offer(num);
                sum1 = sum1 - num;
                sum2 = sum2 + num;
            }
            answer = answer + 1;
        }
        return answer;
    }
}
