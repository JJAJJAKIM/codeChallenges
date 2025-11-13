package com.codeChallenges.lv0;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(solution(10,5,true));
    }
    /* 1번 문제
    public static int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }*/
    /* 2번 문제
    public static int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }*/

    /* 3번 문제
    public static int solution(int n) {
        int answer = 0;
        if( n % 2 == 0){
            for(int i = 0; i <= n; i++){
                if (i % 2 == 0) answer = answer + (i*i);
            }
        } else {
            for(int i = 0; i <= n; i++){
                if (i % 2 != 0 ) answer = answer + i;
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<") && eq.equals("=")){
           if(n <= m){
               answer = 1;
           } else {
               answer = 0;
           }
        } else if(ineq.equals(">") && eq.equals("=")){
            if(n >= m){
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals("<") && eq.equals("!")){
            if(n < m){
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals(">") && eq.equals("!")){
            if(n > m){
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }*/
    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? (a+b) : (a-b);
        return answer;
    }

}
