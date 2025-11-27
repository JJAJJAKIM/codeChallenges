package com.codeChallenges.lv0;

public class Solution16 {

    /* 1번 문제
    public String solution(String myString) {
        String answer = "";
        answer = myString.toUpperCase();
        return answer;
    }*/
    /* 2번 문제
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        return answer;
    }*/
    /* 3번 문제
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if ( i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase().replace('a', 'A');
        return answer;
    }*/

    public String solution(String my_string, String alp) {
        String answer = "";
        answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
}
