package org.dataStructure.list;

public class 연속된수열의합 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        int startIdx = 0;
        int endIdx = 0;
        int sum = 0;
        int len = -1;

        for (; startIdx < sequence.length; startIdx++) {
            while (sum < k && endIdx < sequence.length) {
                sum = sum + sequence[endIdx];
                endIdx = endIdx + 1;
            }
            if (sum == k) {
                if (len == -1 || len > endIdx - startIdx) {
                    answer[0] = startIdx;
                    answer[1] = endIdx - 1;
                    len = endIdx - startIdx;
                }
            }
            sum = sum - sequence[startIdx];

        }
        return answer;
    }
}
