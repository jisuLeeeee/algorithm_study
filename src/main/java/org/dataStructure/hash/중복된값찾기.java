package org.dataStructure.hash;

import java.util.HashSet;
import java.util.Set;

public class 중복된값찾기 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 4, 5 };
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                dup.add(num);
            }
        }
        System.out.println(dup);
    }
}
