package com.codeChallenges.lv0;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Solution7 {

    /* 1번 문제
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            for (int r = s; r <= e; r++) {
                if(r % k == 0) {
                    arr[r] = arr[r] + 1;
                }
            }
        }
        answer = Arrays.copyOf(arr, arr.length);
        return answer;
    }*/
    /* 2번 문제
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean flag = true;
            for (char c : String.valueOf(i).toCharArray()) {
                if (c != '0' && c != '5') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 3번 문제
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int n) {
        int[] answer = {};
        int tmp = 0;
        tmp = n;
        List<Integer> list = new ArrayList<>();
        list.add(n);
        for (int i = 0; i < n; i++) {
            if(tmp % 2 == 0 ){
                tmp = tmp / 2;
                list.add(tmp);
                if (tmp == 1) break;
            } else {
                tmp = (3 * tmp) + 1;
                list.add(tmp);
                if (tmp == 1) break;
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> stkList = new ArrayList<>();
        for (int i = 0; i < arr.length; ) {
            if(stkList.isEmpty()){
                stkList.add(arr[i]);
                i++;
            } else if(stkList.get(stkList.size() - 1) < arr[i]) {
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size()-1) >= arr[i]) {
                stkList.remove(stkList.size()-1);

            }
        }
        stk = stkList.stream().mapToInt(i -> i).toArray();
        return stk;
    }
}
