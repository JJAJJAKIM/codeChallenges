package com.codeChallenges.lv0;

public class Solution44 {
    /* 1번 문제
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int cnt = 0;
        for (int i = 0; i < num_list.length/n; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(int[] dot) {
        int answer = 0;
        if( dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if ( dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if ( dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if ( dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }*/
    public long solution(int balls, int share) {
        long answer = 1;
        share = Math.min(share, balls - share);

        for (int i = 1; i <= share; i++) {
            answer = answer * (balls - i + 1) / i;
        }
        return answer;
    }
}
