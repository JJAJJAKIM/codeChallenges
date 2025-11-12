package com.codeChallenges.lv0;

public class Solution3 {
    public static void main(String[] args) {

        int result = solution(8,8);
        System.out.println(result);
    }

    /* 1번 문제
    public static String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }*/

    /* 2번 문제
    public static String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }*/

    /* 3번 문제
    public static String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }*/

    /* 4번 문제
    public static int solution(int a, int b) {
        int answer = 0;
        String s1 = Integer.toString(a) + Integer.toString(b);
        String s2 = Integer.toString(b) + Integer.toString(a);
        if(Integer.parseInt(s1) > Integer.parseInt(s2) || Integer.parseInt(s1) == Integer.parseInt(s2)){
            answer = Integer.parseInt(s1);
        } else {
            answer = Integer.parseInt(s2);
        }
        return answer;
    }*/

    public static int solution(int a, int b) {
        int answer = 0;
        int a1 = Integer.parseInt(""+a+b);
        int b1 = 2*a*b;
        if(a1 > b1 || a1 == b1) {
            answer = a1;
        } else {
            answer = b1;
        }
        return answer;
    }
}
