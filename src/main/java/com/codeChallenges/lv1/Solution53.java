package com.codeChallenges.lv1;

public class Solution53 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for(int i = 0; i < timelogs.length; i++){
            boolean flag = true;
            int hour = schedules[i] / 100;
            int min = schedules[i] % 100;
            min += 10;
            if (min >= 60) {
                hour++;
                min -= 60;
            }
            int limit = hour * 100 + min;
            for(int j = 0; j < timelogs[i].length; j++){
                int day = (startday + j - 1) % 7 + 1;
                if( day == 6 || day == 7 ) continue;
                if( timelogs[i][j] > limit){
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }
        return answer;
    }
}
