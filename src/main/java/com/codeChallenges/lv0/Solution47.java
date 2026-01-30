package com.codeChallenges.lv0;

import java.util.Scanner;

public class Solution47 {
    /* 1번 문제
    public int solution(int angle) {
        int answer = 0;
        if( 0 < angle && angle < 90){
            answer = 1;
        } else if( angle == 90){
            answer = 2;
        } else if ( 90 < angle && angle < 180) {
            answer = 3;
        } else if( angle == 180) {
            answer = 4;
        }
        return answer;
    }*/
    /* 2번 문제
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }*/
    /* 3번 문제
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for(int j = 1; j <= n; j++){
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int num : num_list){
            if( num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
