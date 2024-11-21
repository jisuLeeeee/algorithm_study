package org.dataStructure.hash;

import java.util.Map;
import java.util.HashMap;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {

        Map<String, Integer> map = new HashMap<>();
        for(String num : phone_book){
            map.put(num, 0);
        }

        for(String num : phone_book){
            for(int i=1; i<num.length(); i++){
                if(map.containsKey(num.substring(0, i))){
                    return false;
                }
            }
        }
        return true;

    }
}
