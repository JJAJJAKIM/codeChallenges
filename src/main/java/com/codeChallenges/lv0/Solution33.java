package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution33 {
    /* 1번 문제
    public int[] solution(int[] array) {
        int[] answer = new int[2] ;
        answer[0] = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == answer[0]) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }*/
    /* 3번 문제
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 4번 문제
    public String solution(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }*/
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char tmp;
        StringBuilder sb = new StringBuilder(my_string);
        tmp = sb.charAt(num1);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, tmp);
        answer = sb.toString();
        return answer;
    }
}
