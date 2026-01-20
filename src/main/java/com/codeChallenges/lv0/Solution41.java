package com.codeChallenges.lv0;

public class Solution41 {
    /* 1번 문제
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xSize = board[0] / 2;
        int ySize = board[1] / 2;
        for(String key : keyinput){
            if ( "up".equals(key)){
                if(answer[1] < ySize) answer[1] += 1;
            } else if ("down".equals(key)) {
                if(answer[1] > (-ySize)) answer[1] -= 1;
            } else if ("left".equals(key)) {
                if(answer[0] > (-xSize)) answer[0] -= 1;
            } else {
                if(answer[0] < xSize) answer[0] += 1;
            }
        }
        return answer;
    }*/
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            maxX = Math.max(maxX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxY = Math.max(maxY, dots[i][1]);
        }

        return (maxX - minX) * (maxY - minY);
    }
}
