package com.codeChallenges.lv0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution22 {
    /* 1번 문제
    public String solution(String n_str) {
        String answer = "";
        StringBuilder sb = new StringBuilder(n_str);
        while (true) {
            if(sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            } else {
                break;
            }
        }
        answer = sb.toString();
        return answer;
    }*/
    /* 2번 문제
    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        return bigA.add(bigB).toString();
    }*/
    /* 3번 문제
    public String solution(int n) {
        String answer = "";
        answer = n + "";
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        Set<Integer> delSet = new HashSet<>();
        for (int num : delete_list ){
            delSet.add(num);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr){
            if(!delSet.contains(num)){
                list.add(num);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    public int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
