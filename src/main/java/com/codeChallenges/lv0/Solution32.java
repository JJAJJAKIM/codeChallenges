package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution32 {
    /* 1번 문제
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++){
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }*/
    /* 2번 문제
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int num : numlist){
            if( num % n == 0){
                list.add(num);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 3번 문제
    public int solution(int num, int k) {
        int answer = 0;
        String temp = Integer.toString(num);
        for(int i = 0; i < temp.length(); i++){
            if (String.valueOf(temp.charAt(i)).equals(Integer.toString(k))){
                answer = i + 1;
                return answer;
            }
        }
        answer = -1;
        return answer;
    }*/
    /* 4번 문제
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList(s2));
        for(int i = 0; i < s1.length; i++){
            if(list.contains(s1[i])){
                answer += 1;
            }
        }
        return answer;
    }*/
    public int solution(String my_string) {
        String[] parts = my_string.split(" ");
        int answer = Integer.parseInt(parts[0]);
        for( int i = 1; i < parts.length; i+=2){
            String op = parts[i];
            int num = Integer.parseInt(parts[i+1]);
            if(op.equals("+")){
                answer += num;
            } else {
                answer -= num;
            }
        }
        return answer;
    }
}
