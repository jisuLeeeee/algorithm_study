package org.dataStructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int idx = stack.pop();
                answer[idx] = i - idx;

            }
            stack.push(i);
        }
        return answer;
    }
}
