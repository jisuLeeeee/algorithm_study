package org.dataStructure.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        // 참가자 이름 카운트(동명이인 있을 수 있음)
        for(String p : participant){
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주한 선수는 카운트 감소
        for(String c : completion){
            map.put(c, map.get(c) - 1);
        }

        // 완주하지 못한 1인 return
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return answer;
    }
}
