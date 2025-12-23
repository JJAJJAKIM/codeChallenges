package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution30 {
    /* 1번 문제
    public int solution(int M, int N) {
        int answer = 0;
        answer = M * N - 1;
        return answer;
    }*/
    /* 2번 문제
    public int solution(String A, String B) {
        int answer = 0;
        for ( int i = 0; i < A.length(); i ++){
            if ( A.equals(B)){
                return answer;
            } else {
                String temp = A.charAt(A.length()-1) + "";
                A = temp + A.substring(0, A.length()-1);
                answer++;
            }
        }
        return -1;
    }*/
    /* 3번 문제
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int cnt = 0;
        int size = my_str.length() % n == 0 ? my_str.length()/n : (my_str.length()/n)+1;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            int end = Math.min(cnt + n, my_str.length());
            list.add(my_str.substring(cnt, end));
            cnt += n;
        }
        answer = list.toArray(new String[list.size()]);
        return answer;
    }*/
    /* 4번 문제
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array){
            String temp = Integer.toString(num);
            for(int i = 0; i < temp.length(); i ++){
                if(temp.charAt(i) == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }*/

    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] chars = my_string.toCharArray();
        Arrays.sort(chars);
        answer =String.valueOf(chars);
        return answer;
    }
}
