package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution11 {
    /* 1번 문제
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;              // 대문자
            } else {
                answer[(ch - 'a') + 26]++;       // 소문자
            }
        }
        return answer;
    }*/

    /* 2번 문제
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 3번 문제
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            boolean flag = true;
            for(int idx : indices){
                if(i == idx){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = start_num; i >= end_num; i--) {
            list.add(i);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1 ){
                answer = i;
                return answer;
            }
        }
        return -1;
    }
}
