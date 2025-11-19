package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution9 {

    /* 1번 문제
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        for (String intStr : intStrs){
            temp = Integer.parseInt(intStr.substring(s, s+l));
            if (temp > k ) list.add(temp);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/

    /* 2번 문제
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int start = parts[i][0];
            int end = parts[i][1] + 1;
            answer += str.substring(start, end);
        }
        return answer;
    }*/

    /* 3번 문제
    public String solution(String my_string, int n) {
        String answer = "";
        int start = my_string.length() - n;
        answer = my_string.substring(start);
        return answer;
    }*/

    /* 4번 문제
    public String[] solution(String my_string) {
        int n = my_string.length();
        String[] suffixes = new String[n];

        // 모든 접미사 생성
        for (int i = 0; i < n; i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 사전순 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }*/

    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int n = my_string.length();
        String[] suffixes = new String[n];

        // 모든 접미사 생성
        for (int i = 0; i < n; i++) {
            suffixes[i] = my_string.substring(i);
            if (suffixes[i].equals(is_suffix)) {
                answer = 1;
            }
        }
        return answer;
    }
}
