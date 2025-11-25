package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution14 {
    /* 1번 문제
    public int solution(int[] num_list) {
        int hol = 0;
        int jjak = 0;
        int cnt = 1;
        for (int i = 0; i < num_list.length; i++) {
            if(cnt % 2 != 0){
                hol += num_list[i];
            } else {
                jjak += num_list[i];
            }
            cnt++;
        }
        if(hol == jjak){
            return hol;
        } else if (hol > jjak) {
            return hol;
        } else {
            return jjak;
        }
    }*/
    /* 2번 문제
    public String[] solution(String[] names) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; ) {
            list.add(names[i]);
            i += 5;
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }*/
    /* 3번 문제
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        answer = list.toArray(String[]::new);
        return answer;
    }*/
    /* 4번 문제
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                return answer;
            }
        }
        return answer;
    }*/
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= end; j++) {
                arr[j] += 1;
            }
        }
        return arr;
    }
}
