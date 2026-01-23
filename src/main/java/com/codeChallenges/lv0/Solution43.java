package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution43 {
    /* 1번 문제
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i : box){
            answer *= i / n;
        }
        return answer;
    }*/
    /* 2번 문제
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if ("left".equals(direction)) {
                answer[i] = numbers[(i + 1) % numbers.length];
            } else {
                answer[(i + 1) % numbers.length] = numbers[i];
            }
        }

        return answer;
    }*/
    public int solution(int[] numbers, int k) {
        int index = (2 * (k - 1)) % numbers.length;
        return numbers[index];
    }
}
