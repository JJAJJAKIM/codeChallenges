package com.codeChallenges.lv0;

public class Solution25 {
    /* 1번 문제
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            // 1. 왼 → 오른쪽
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++;
            // 2. 위 → 아래
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--;
            // 3. 오른쪽 → 왼쪽
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    answer[bottom][i] = num++;
                }
                bottom--;
            }
            // 4. 아래 → 위
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    answer[i][left] = num++;
                }
                left++;
            }
        }

        return answer;
    }*/
    /* 2번 문제
    public int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return answer;
                }
            }
        }
        answer = 1;
        return answer;
    }*/
    /* 3번 문제
    public int[][] solution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int size = Math.max(n, m);
        int[][] answer = new int[size][size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }*/
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ( i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
