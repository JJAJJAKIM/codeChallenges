package com.codeChallenges.lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution35 {
    /* 1번 문제
    public int solution(int[] sides) {
        int answer = 2;
        Arrays.sort(sides);
        if(sides[0] + sides[1] > sides[2]){
            answer = 1;
        }
        return answer;
    }*/
    /* 2번 문제
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : my_string.toCharArray()){
            if(set.add(c)){
                sb.append(c);
            }
        }
        answer = sb.toString();
        return answer;
    }*/
    /* 3번 문제
    public int solution(int i, int j, int k) {
        int answer = 0;
        String key = Integer.toString(k);
        for (int a = i; a <= j; a++){
            String that = Integer.toString(a);
            for (char c : that.toCharArray()){
                if (String.valueOf(c).equals(key)){
                    answer++;
                }
            }
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(String before, String after) {
        int answer = 1;
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        Arrays.sort(b);
        Arrays.sort(a);
        if (!Arrays.equals(b,a)) answer = 0;
        return answer;
    }*/
    public String solution(String bin1, String bin2) {
        String answer = "";
        int b1 = Integer.parseInt(bin1, 2);
        int b2 = Integer.parseInt(bin2, 2);
        int sum = b1 + b2;
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}
