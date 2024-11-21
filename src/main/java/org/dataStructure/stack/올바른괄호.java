package org.dataStructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class 올바른괄호 {
    public boolean solution (String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }

        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        올바른괄호 a = new 올바른괄호();
        String s = "()()()";
        System.out.println(a.solution(s));

    }
}
