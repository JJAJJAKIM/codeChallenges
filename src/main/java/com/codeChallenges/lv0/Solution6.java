package com.codeChallenges.lv0;

import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
    /* 1번 문제
    public int[] solution(int[] num_list) {
        int[] answer = {};
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer = Arrays.copyOf(num_list, num_list.length+1);
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer = Arrays.copyOf(num_list, num_list.length+1);
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }
        return answer;
    }*/

    /* 2번 문제
    public int solution(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        answer = n;
        return answer;
    }*/

    /* 3번 문제
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i-1]) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case +10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
            }
        }
        return answer;
    }*/

    /* 4번 문제
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int tmp = 0;
        for (int[] query : queries) {
            tmp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = tmp;
        }
        answer = arr;
        return answer;
    }*/

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            int min = Integer.MAX_VALUE;
            boolean flag = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    min = Math.min(min, arr[i]);
                    flag = true;
                }
            }
            answer[q] = flag ? min : -1;
        }
        return answer;
    }
}
