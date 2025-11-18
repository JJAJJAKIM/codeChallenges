package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution8 {
    /*
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean answer1 = true;
        boolean answer2 = true;
        if (!x1 && !x2 ) {
            answer1 = false;
        } else {
            answer1 = true;
        }
        if (!x3 && !x4) {
            answer2 = false;
        } else {
            answer2 = true;
        }
        if(answer1 && answer2) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }*/
    /*
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        java.util.Arrays.sort(dice);

        if (dice[0] == dice[3]) {
            int p = dice[0];
            return 1111 * p;

        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {

            int p, q;
            if (dice[0] == dice[2]) {
                p = dice[0];
                q = dice[3];
            } else {
                p = dice[1];
                q = dice[0];
            }

            // (10 × p + q)^2 점
            return (int) Math.pow(10 * p + q, 2);

        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0];
            int q = dice[2];

            return (p + q) * java.lang.Math.abs(p - q);

        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
            if (dice[0] == dice[1]) {
                return dice[2] * dice[3];
            } else if (dice[1] == dice[2]) {
                return dice[0] * dice[3];
            } else {
                return dice[0] * dice[1];
            }

        } else {
            return dice[0];
        }
    } */

    /* 3번 문제
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int a : index_list) {
            answer += my_string.charAt(a);
        }
        return answer;
    }*/
    /* 4번째 문제
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            answer += Character.getNumericValue(number.charAt(i));
            answer = answer % 9;
        }
        return answer;
    }*/
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            // 인덱스 s부터 e까지 양 끝에서 문자를 교환(Swap)합니다.
            while (s < e) {
                // 1. s 인덱스의 문자를 임시 저장합니다.
                char temp = sb.charAt(s);

                // 2. e 인덱스의 문자를 s 위치에 넣습니다.
                sb.setCharAt(s, sb.charAt(e));

                // 3. 임시 저장된 문자를 e 위치에 넣습니다.
                sb.setCharAt(e, temp);

                // 4. 인덱스를 중앙으로 이동시킵니다.
                s++;
                e--;
            }
        }
        return sb.toString();
    }
}