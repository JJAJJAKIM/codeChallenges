package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution49 {
    /* 1번 문제
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }
        answer = answer / numbers.length;
        return answer;
    }*/
    /* 2번 문제
    public int solution(int slice, int n) {
        // 2 ≤ slice ≤ 10
        // 1 ≤ n ≤ 100
        int answer = 0;
        if( n <= slice) {
            answer = 1;
        } else {
            if( n % slice == 0 ){
                answer = n / slice;
            } else {
                answer = n / slice + 1;
            }
        }
        return answer;
    }*/
    /* 3번 문제
    public int solution(int n) {
        int answer = 1;
        boolean flag = true;
        while ( flag ){
            if( (6 * answer) % n == 0  ){
                flag = false;
            } else {
                answer++;
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(int n) {
        int answer = 0;
        if ( n % 7 == 0){
            answer = n / 7;
        } else {
            answer = (n / 7) + 1;
        }
        return answer;
    }*/
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i += 2 ){
            list.add(i);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
























