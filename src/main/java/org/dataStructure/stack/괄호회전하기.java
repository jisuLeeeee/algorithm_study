package org.dataStructure.stack;

import java.util.Deque;
import java.util.ArrayDeque;
public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            String newS = s.substring(i) + s.substring(0, i);
            if(isValid(newS)){
                answer = answer + 1;
            }
        }
        return answer;

    }
    public boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '['){
                stack.push(']');
            }
            else if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
