package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution12 {
    /* 1번 문제
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        if( n == 1){
            for (int i = 0; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; ) {
                list.add(num_list[i]);
                i += slicer[2];
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/

    /* 2번 문제
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                return answer;
            }
        }
        answer = -1;
        return answer;
    }*/

    /* 3번 문제
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            for(int i = start; i <= end; i++) {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/

    /* 4번 문제
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                end = i;
            }
        }

        if (start == -1) {
            list.add(-1);
        } else {
            for (int i = start; i <= end; i++) {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    } */

    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                list.subList(query[i]+1, list.size()).clear();
            } else {
                list.subList(0, query[i]).clear();
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
