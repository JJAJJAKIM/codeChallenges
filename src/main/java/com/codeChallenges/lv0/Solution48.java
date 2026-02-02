package com.codeChallenges.lv0;

public class Solution48 {
    /* 1번 문제
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length()-1; i >= 0; i--){
            answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }*/
    /* 2번 문제
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int cnt = num_list.length-1;
        for( int i = 0; i < num_list.length; i++){
            answer[i] = num_list[cnt];
            cnt--;
        }
        return answer;
    }*/
    /* 3번 문제
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }*/
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000 && price < 300000){
            answer = (int)(price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            answer = (int)(price * 0.9);
        } else if (price >= 500000) {
            answer = (int)(price * 0.8);
        } else {
            answer = price;
        }
        return answer;
    }
}
