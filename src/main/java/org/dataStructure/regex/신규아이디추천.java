package org.dataStructure.regex;

public class 신규아이디추천 {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^a-z0-9-_.]", "").replaceAll("\\.{2,}", ".").replaceAll("^[.]|[.]$", "").replaceAll("^$", "a");

        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");

        while(answer.length() < 3){
            answer = answer + answer.substring(answer.length()-1, answer.length());
        }

        return answer;
    }
}
