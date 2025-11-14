package com.codeChallenges.lv0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) {

        System.out.println(solution(3,4, inc));
    }

    /* 1번 문제
    public static String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++) {
            if(mode == 0){
                if(code.charAt(i) != '1' && i % 2 == 0){
                    answer += code.charAt(i);
                } else if (code.charAt(i) == '1'){
                    mode = 1;
                }
            } else if(mode == 1) {
                if(code.charAt(i) != '1' && i % 2 == 1){
                    answer += code.charAt(i);
                } else if (code.charAt(i) == '1'){
                    mode = 0;
                }
            }
            System.out.println(i);
            System.out.println("code[i] : " + code.charAt(i));
            System.out.println("Mode: " + mode);
            System.out.println("Answer: " + answer);
        }
        return answer.equals("") ? "EMPTY" : answer;
    }*/
    /* 2번 문제
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (i * d);
            }
        }
        return answer;
    }*/
    /* 3번 문제
    public int solution(int a, int b, int c) {
        int answer = 0;
        if( a != b && b != c && c != a ){
            answer = a + b + c;
        } else if ( a == b && b != c || a == c && b != a  || b == c && a != b) {
            answer = (a + b + c) * (int) (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        } else if ( a == c && c == b ) {
            answer = (a + b + c) * (int) (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (int) (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int product = 1;
        for (int n : num_list) {
            product *= n;
        }
        for (int m : num_list){
            sum += m;
        }
        int pow = (int) Math.pow(sum, 2);
        return answer = product < pow ? 1 : 0 ;
    }*/
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        for(int n : num_list){
            if( n % 2 == 0){
                a += Integer.toString(n);
            } else {
                b += Integer.toString(n);
            }
        }
        answer = Integer.parseInt(a) + Integer.parseInt(b);
        return answer;
    }
}
