package com.codeChallenges.lv0;

import java.util.*;

public class Solution20 {
    /*
    public int[] solution(int[] arr) {
        int n = arr.length;
        int target = 1;

        while (target < n) {
            target *= 2;
        }

        int[] answer = Arrays.copyOf(arr, target);
        return answer;
    }*/
    /* 1번 문제
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if (arr1.length == arr2.length) {
            for (int ar1 : arr1) sum1 += ar1;
            for (int ar2 : arr2) sum2 += ar2;
            if (sum1 == sum2) {
                answer = 0;
            } else if (sum1 > sum2) {
                answer = 1;
            } else {
                answer = -1;
            }
        } else {
            if (arr1.length > arr2.length) {
                answer = 1;
            } else if (arr1.length < arr2.length) {
                answer = -1;
            }
        }
        return answer;
    }*/
    /* 3번 문제
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (String s : strArr) {
            int len = s.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }

        int max = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }
        return max;
    }*/
    /* 4번 문제
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        if( arr.length % 2 != 0 ) {
            for (int i = 0; i < arr.length; ) {
                arr[i] += n;
                i += 2;
            }
        } else {
            for (int i = 1; i < arr.length; ) {
                arr[i] += n;
                i += 2;
            }
        }
        answer = Arrays.copyOf(arr, arr.length);
        return answer;
    }*/
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        return answer = Arrays.copyOf(num_list, 5);
    }
}
