package com.codeChallenges.lv0;

import java.util.Arrays;

public class Solution36 {
    /* 1번 문제
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while (coupon >= 10){
            int newChicken = coupon / 10;
            answer += newChicken;
            coupon = coupon % 10 + newChicken;
        }
        return answer;
    }*/
    /* 2번 문제
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i = 0; i < db.length; i++){
                if (db[i][0].equals(id_pw[0])){
                    if(db[i][1].equals(id_pw[1])){
                        answer = "login";
                        break;
                    } else {
                        answer = "wrong pw";
                        break;
                    }
                }
        }
        return answer;
    }*/
    /* 3번 문제
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int sumI = score[i][0] + score[i][1];
            int rank = 1;

            for (int j = 0; j < n; j++) {
                int sumJ = score[j][0] + score[j][1];
                if (sumJ > sumI) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            if (distA == distB) {
                return b - a;
            }
            return distA - distB;
        });

        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }*/
    public int solution(int a, int b) {
        // 1. 최대공약수 구하기
        int gcd = gcd(a, b);

        // 2. 기약분수로 만들기
        b /= gcd;

        // 3. 분모에서 2 제거
        while (b % 2 == 0) {
            b /= 2;
        }

        // 4. 분모에서 5 제거
        while (b % 5 == 0) {
            b /= 5;
        }

        // 5. 판단
        return b == 1 ? 1 : 2;
    }

    // 최대공약수 (유클리드 호제법)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
