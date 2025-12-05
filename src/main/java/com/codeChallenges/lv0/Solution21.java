package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution21 {
    /* 1번 문제
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        return answer;
    }*/
    /* 2번 문제
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(new int[]{rank[i], i});
            }
        }
        list.sort(Comparator.comparingInt(a -> a[0]));
        int a = list.get(0)[1];
        int b = list.get(1)[1];
        int c = list.get(2)[1];
        answer = (10000 * a) + (100 * b) + c;
        return answer;
    }*/
    /* 3번 문제
    public int solution(double flo) {
        int answer = 0;
        answer = (int)flo;
        return answer;
    }*/
    /* 4번 문제
    public int solution(String num_str) {
        int answer = 0;
        for(Character c : num_str.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }*/
    public int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }
}
