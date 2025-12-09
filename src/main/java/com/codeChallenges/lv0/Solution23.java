package com.codeChallenges.lv0;

public class Solution23 {
    /* 1번 문제
    public int solution(String str1, String str2) {
        int answer = 0;
        if ( str2.contains(str1)){
            answer = 1;
            return answer;
        }
        return answer;
    }*/
    /* 2번 문제
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for( String str : str_list) {
            if(!str.contains(ex)) {
                answer += str;
            }
        }
        return answer;
    }*/
    /* 3번 문제
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int num : num_list) {
            if(num == n) {
                answer = 1;
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(int a, int b) {
        int answer = 0;
        if( a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else if (a % 2 != 0 && b % 2 != 0) {
            answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        }
        return answer;
    }*/
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                answer = 1;
                return answer;
            } else if (date1[i] > date2[i]) {
                answer = 0;
                return answer;
            }
        }
        return answer;
    }
}
