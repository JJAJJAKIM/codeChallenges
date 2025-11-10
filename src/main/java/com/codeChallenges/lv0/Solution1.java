package com.codeChallenges.lv0;

import java.util.Scanner;

public class Solution1 {

    /* 1번쨰 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(a);
    }*/

    /* 2번째 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }*/

    /* 3번째 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for( int i = 0; i < n; i++ ) {
            System.out.print(str);
        }
    }*/

    /* 4번째 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b ;
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            b = a.charAt(i);
            //charAt() : 문자열에서 문자 하나만 가져오는 함수.
            if(Character.isUpperCase(b)) {
                //Character.isUpperCase() : 문자열이 대문자인지 확인
                answer += Character.toLowerCase(b);
                //Character.toLowerCase() : 소문자로 변환
            } else {
                answer += Character.toUpperCase(b);
                //Character.toUpperCase() : 대문자로 변환
            }
        }
        System.out.println(answer);
    }*/

    public static void main(String[] args) {
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}
