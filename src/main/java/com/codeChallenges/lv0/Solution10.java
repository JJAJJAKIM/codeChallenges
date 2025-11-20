package com.codeChallenges.lv0;

public class Solution10 {
    /* 1번 문제
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0, n);
        return answer;
    }*/

    /* 2번 문제
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int n = my_string.length();
        String[] prefixes = new String[n];

        for (int i = 0; i < n; i++) {
            prefixes[i] = my_string.substring(0,i);
            if (prefixes[i].equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }*/
    /* 3번 문제
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        while ( s < e ){
            char temp = sb.charAt(s);
            sb.setCharAt(s, sb.charAt(e));
            sb.setCharAt(e, temp);
            s++;
            e--;
        }
        answer = sb.toString();

        return answer;
    }*/
    /* 4번 문제
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] strings = new String[my_string.length()/m];
        for (int i = 0; i < (my_string.length()/m); i++) {
            strings[i] = my_string.substring(i*m, (i+1)*m);
            answer += strings[i].substring(c-1,c);
        }
        return answer;
    }*/

    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if(i % q == r ){
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}
