package com.codeChallenges.lv0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution46 {
    /* 1번 문제
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] result = Arrays.stream(emergency)
                .boxed()
                .toArray(Integer[]::new);
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
        Arrays.sort(result, Comparator.reverseOrder());
        for(int i = 0; i < emergency.length; i++ ){
            list.put(result[i], i+1);
        }

        for (int i = 0; i < emergency.length; i++){
            answer[i] = list.get(emergency[i]);
        }
        return answer;
    }*/
    /* 2번 문제
    public String solution(int age) {
        String answer = "";
        String ageString = age + "";
        HashMap<String, String> ageMap = new HashMap<>();
        ageMap.put("0","a");
        ageMap.put("1","b");
        ageMap.put("2","c");
        ageMap.put("3","d");
        ageMap.put("4","e");
        ageMap.put("5","f");
        ageMap.put("6","g");
        ageMap.put("7","h");
        ageMap.put("8","i");
        ageMap.put("9","j");
        for (int i = 0; i < ageString.length(); i++ ){
            answer += ageMap.get(String.valueOf(ageString.charAt(i)));
        }
        return answer;
    }*/
    /* 3번 문제
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }*/
    /* 4번 문제
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i += 2){
            answer += i;
        }
        return answer;
    }*/
    public int solution(int n, int k) {
        int answer = 0;
        int cnt = 0;
        cnt = n / 10 ;
        k = k - cnt;
        answer =( n * 12000) + ( k * 2000);
        return answer;
    }
}
