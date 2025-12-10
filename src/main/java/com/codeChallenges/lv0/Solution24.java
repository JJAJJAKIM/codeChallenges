package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution24 {
    /* 1번 문제
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if(s.contains("americano") || s.contains("anything")){
                answer += 4500;
            } else if(s.contains("cafelatte")){
                answer += 5000;
            }
        }
        return answer;
    }*/
    /* 2번 문제
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> result = new ArrayList<>();

        for (String row : picture) {
            StringBuilder expanded = new StringBuilder();
            for (char c : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    expanded.append(c);
                }
            }

            for (int i = 0; i < k; i++) {
                result.add(expanded.toString());
            }
        }

       answer =  result.toArray(new String[result.size()]);
        return answer;
    }*/
    /* 3번 문제
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            if( k % 2 != 0){
                arr[i] = arr[i] * k;
            } else {
                arr[i] = arr[i] + k;
            }
        }
        answer = Arrays.copyOf(arr, arr.length);
        return answer;
    }*/
    /* 4번 문제
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) < 'l') {
                sb.append("l");
            } else {
                sb.append(myString.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }*/
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}
