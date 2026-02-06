package com.codeChallenges.lv0;

import java.util.Arrays;

public class Solution51 {
    /* 1번 문제
    public int solution(int num1, int num2) {
        int answer = 0;
        if( num1 == num2){
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) ((double) num1 / num2 * 1000);
        return answer;
    }*/
    /* 3번 문제
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }*/
    /* 4번 문제
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }*/
    /* 5번 문제
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }*/
    /* 6번 문제
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(height < array[i]){
                answer = array.length - i;
                break;
            }
        }
        return answer;
    }*/

    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}
