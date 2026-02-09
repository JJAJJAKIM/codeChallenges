package com.codeChallenges.lv1;

public class Solution52 {
    public int solution(int n, int w, int num) {
        // num의 층(row)
        int row = (num - 1) / w;
        // 층 안에서의 위치
        int pos = (num - 1) % w;

        // 실제 열(column)
        int col;
        if (row % 2 == 0) {
            col = pos; // 왼 → 오
        } else {
            col = w - 1 - pos; // 오 → 왼
        }

        // 전체 층 수
        int totalRows = (n + w - 1) / w;

        int count = 1; // num 자신 포함

        // 위층들 검사
        for (int r = row + 1; r < totalRows; r++) {
            int indexInRow;
            if (r % 2 == 0) {
                indexInRow = col;
            } else {
                indexInRow = w - 1 - col;
            }

            int boxNumber = r * w + indexInRow + 1;
            if (boxNumber <= n) {
                count++;
            }
        }

        return count;
    }
}
