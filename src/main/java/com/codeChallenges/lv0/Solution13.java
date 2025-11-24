package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution13 {
    /* 1번 문제
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = n-1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 2번 문제
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        for(int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 3번 문제
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                answer = Arrays.copyOfRange(str_list, 0, i);
                return answer;
            } else if(str_list[i].equals("r")) {
                answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                return answer;
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length;) {
            list.add(num_list[i]);
            i += n;
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}
