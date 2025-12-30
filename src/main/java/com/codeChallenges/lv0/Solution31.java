package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution31 {
    /* 1번 문제
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++){
            answer *= 2;
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1/num2;
        return answer;
    }*/
    /* 3번 문제
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);
        if (sqrt * sqrt == n){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }*/
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++){
            String[] parts = quiz[i].split(" ");
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);

            int result;
            if (operator.equals("+")){
                result = X + Y;
            } else {
                result = X - Y;
            }
            if (result == Z){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}
