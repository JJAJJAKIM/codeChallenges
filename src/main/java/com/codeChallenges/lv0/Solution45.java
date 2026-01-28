package com.codeChallenges.lv0;

import java.util.HashMap;
import java.util.Map;

public class Solution45 {
    /* 1번 문제
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++){
            if(rsp.charAt(i) == '2'){
                answer += "0";
            } else if (rsp.charAt(i) == '0') {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }*/
    /* 2번 문제
    public String solution(String letter) {
        Map<String, String> morse = new HashMap<>();

        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        StringBuilder answer = new StringBuilder();
        String[] codes = letter.split(" ");

        for (String code : codes) {
            answer.append(morse.get(code));
        }

        return answer.toString();
    } */
    /* 3번 문제
    public int solution(int hp) {
        int answer = 0;
        while (true){
            if( hp >= 5) {
                answer += hp / 5;
                hp = hp % 5;
            } else if (5 > hp && hp >= 3){
                answer += hp / 3;
                hp = hp % 3;
            } else {
                answer += hp;
                break;
            }
        }
        return answer;
    }*/
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if ( n % i == 0){
                answer++;
            }
        }
        return answer;
    }

}
