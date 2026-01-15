package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {
    /* 1번 문제
    public int solution(int[] sides) {
        int answer = 0;
        int a = Math.max(sides[0], sides[1]);
        int b = Math.min(sides[0], sides[1]);
        // c < a 인 경우
        for (int c = a - b + 1; c < a; c++) {
            answer++;
        }
        // c >= a 인 경우
        for (int c = a; c < a + b; c++) {
            answer++;
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] danger = new boolean[n][n];

        // 8방향 + 자기 자신 포함
        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1,  0,  1, -1, 0, 1, -1, 0, 1};

        // 지뢰 기준으로 위험지역 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int d = 0; d < 9; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        // 범위 체크
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            danger[nx][ny] = true;
                        }
                    }
                }
            }
        }
        // 안전지역 개수 세기
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!danger[i][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }*/
    public int solution(String my_string) {
        int sum = 0;
        String temp = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                temp += c;   // 숫자면 이어 붙이기
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }
}
