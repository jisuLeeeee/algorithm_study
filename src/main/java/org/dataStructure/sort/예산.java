package org.dataStructure.sort;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);

        for(int i : d){
            sum = sum + i;
            if(sum <= budget){
                answer = answer + 1;
                continue;
            }
        }
        return answer;
    }
}
