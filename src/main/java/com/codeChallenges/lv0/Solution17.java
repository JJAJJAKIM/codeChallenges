package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    /* 1번 문제
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat);
        if (idx == -1) return "";   // pat이 없는 경우

        answer = myString.substring(0, idx + pat.length());
        return answer;
    }*/
    /* 2번 문제
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        while (true) {
            idx = myString.indexOf(pat, idx);
            if (idx == -1) break;
            answer++;
            idx += 1;
        }
        return answer;
    }*/
    /* 3번 문제
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        for (String str : strArr) {
            if(str.indexOf("ad") == -1) list.add(str);
        }
        answer = list.toArray(new String[list.size()]);
        return answer;
    }*/
    /* 4번 문제
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.split(" "); // 특정 문자열을 기준으로 배열 생성
        return answer;
    }*/
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.trim().split("\\s+"); // 공백이 여러개 이거나 문자열의 맨앞, 맨뒤에 나올경우는 정규식 사용.
        return answer;
    }
}
