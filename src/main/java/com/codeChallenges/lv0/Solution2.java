package com.codeChallenges.lv0;

import java.util.Scanner;

public class Solution2 {

    /* 1번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + "+ b + " = "+ (a + b));
    }*/

    /* 2번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a+b);
    }*/

    /* 3번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i < a.length(); i++) {
            char b;
            b = a.charAt(i);
            System.out.println(b);
        }
    }*/

    /* 4번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n % 2 == 0){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }*/
    public static void main(String[] args) {
        String result = solution("Program29b8UYP", "merS123",7);
        System.out.println(result);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0,s);
        answer = answer + overwrite_string + my_string.substring(overwrite_string.length()+s);
        return answer;
    }
}
