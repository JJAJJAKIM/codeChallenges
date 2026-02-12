package com.codeChallenges.lv1;


import java.util.Arrays;

public class Solution56 {
    public int solution(int[] mats, String[][] park) {
        // 1. mat 을 내림 차순으로 정렬.
        // 2. 가장 큰 mat[i]부터 park에 들어갈 자리가 있는지 확인.
        // 3. 알맞은 자리가 나오면 answer = mat[i] 후 반복문 종료.
        // 4. 없으면 -1 리턴.
        int n = park.length;
        int m = park[0].length;

        Arrays.sort(mats);

        for(int idx = mats.length - 1; idx >= 0; idx--){
            int size = mats[idx];

            for (int i = 0; i <= n - size; i++){
                for (int j = 0; j <= m - size; j++){

                    if(canPlace(park, i, j, size)){
                        return size;
                    }
                }
            }
        }
        return -1;
    }
    private boolean canPlace(String[][] park, int row, int col, int size) {
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
