package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution15 {
    /* 1번 문제
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  >= 50 && arr[i] % 2 == 0) {
                list.add(arr[i]/2);
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                list.add(arr[i]*2);
            } else {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 2번 문제
    public int solution(int[] arr) {
        int answer = 0;

        List<Integer> prev = new ArrayList<>();
        for (int a : arr) prev.add(a);

        while (true) {
            List<Integer> next = new ArrayList<>();

            for (int val : prev) {
                if (val >= 50 && val % 2 == 0) {
                    next.add(val / 2);
                } else if (val < 50 && val % 2 != 0) {
                    next.add(val * 2 + 1);
                } else {
                    next.add(val);
                }
            }
            if (prev.equals(next)) {
                break;
            }
            prev = next;
            answer++;
        }
        return answer;
    }*/
    /* 3번 문제
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    answer++;
                } else {
                    num = (num - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11){
            for(int num : num_list) answer += num;
        } else if (num_list.length <= 10) {
            answer = 1;
            for(int num : num_list) answer *= num;
        }
        return answer;
    }*/
    public int solution(String myString, String pat) {
        int answer = 0;
        answer = myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
        return answer;
    }
}
