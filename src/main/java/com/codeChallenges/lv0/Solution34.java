package com.codeChallenges.lv0;

public class Solution34 {
    /* 1번 문제
    public long solution(String numbers) {
        long answer = 0;
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        for (int i = 0; i < words.length; i++){
            numbers = numbers.replace(words[i], String.valueOf(i));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }*/
    /* 2번 문제
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                sb.append(Character.toLowerCase(my_string.charAt(i)));
            } else {
                sb.append(Character.toUpperCase(my_string.charAt(i)));
            }
        }
        answer = sb.toString();
        return answer;
    }*/
    /* 3번 문제
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = code - 1; i< cipher.length(); i += code ){
            sb.append(cipher.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }*/
    /* 4번 문제
    public int solution(int order) {
        int answer = 0;
        String tmp = Integer.toString(order);
        for (char c : tmp.toCharArray()){
            if(c == '3' || c == '6' || c == '9'){
                answer++;
            }
        }
        return answer;
    }*/
    public int solution(int[] array, int n) {
        int answer = 0;
        int tmp = array[0]-n;
        for (int i = 1; i < array.length; i++){
            int diff = array[i] - n;
            if( Math.abs(tmp) > Math.abs(diff)
                    || (Math.abs(tmp) == Math.abs(diff) && diff < tmp)){
                tmp = diff;
            }
        }
        answer = tmp + n;
        return answer;
    }
}
