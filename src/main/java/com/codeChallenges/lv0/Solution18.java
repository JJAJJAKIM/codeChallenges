package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution18 {
    /* 1번 문제
    public int[] solution(String myString) {
        int[] answer = {};
        String[] strs = {};
        List<Integer> list = new ArrayList<>();
        strs = myString.split("x", -1);
        for( String str : strs ){
            list.add(str.length());
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 2번 문제
    public String[] solution(String myString) {
        String[] answer = {};
        String[] strs = myString.split("x");
        List<String> list = new ArrayList<>();

        for ( String s : strs) {
            if ( !s.isEmpty()) {
                list.add(s);
            }
        }
        Collections.sort(list);
        answer = list.toArray(new String[list.size()]);
        return answer;
    }*/
    /* 3번 문제
    public int solution(String binomial) {
        int answer = 0;
        int a = 0;
        int b = 0;
        String[] strs = binomial.split(" ");
        a = Integer.parseInt(strs[0]);
        b = Integer.parseInt(strs[2]);
        if (strs[1].equals("+")) {
            answer = a + b;
        } else if (strs[1].equals("-")) {
            answer = a - b;
        } else if (strs[1].equals("*")) {
            answer = a * b;
        }
        return answer;
    }*/
    /* 4번 문제
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (Character c : myString.toCharArray()) {
            if( c == 'A') sb.append('B');
            else sb.append('A');
        }
        String str = sb.toString();
        answer = str.contains(pat) ? 1 : 0;
        return answer;
    }*/
    public String solution(String rny_string) {
        String answer = "";
        answer = rny_string.replace("m", "rn");
        return answer;
    }

}
