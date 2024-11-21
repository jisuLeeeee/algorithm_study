package org.dataStructure.list;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        // 3가지 수를 조합해 합을 isPrime 메소드로 소수 판별
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)){
                        answer = answer + 1;
                    }
                }
            }
        }

        return answer;
    }

    // 소수 판별 메소드
    public boolean isPrime(int n) {
        if(n == 0 || n == 1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
