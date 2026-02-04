package com.codeChallenges.lv0;

import java.util.Arrays;
import java.util.HashMap;

public class Solution50 {
    /* 1번 문제
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int num : array){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        int maxCnt = 0;
        int answer = -1;

        for(int key : map.keySet()){
            int cnt = map.get(key);
            if( cnt > maxCnt){
                maxCnt = cnt;
                answer = key;
            } else if (cnt == maxCnt) {
                answer = -1;
            }
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2 +1];
        return answer;
    }*/
    /* 3번 문제
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }*/
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = (numer1 * denom2) + (numer2 * denom1) ;
        int denom = denom1 * denom2;
        int gcd = gcd(numer, denom);

        answer[0] = numer / gcd;
        answer[1] = denom / gcd;
        return answer;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}
