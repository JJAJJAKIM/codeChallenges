package com.codeChallenges.lv0;


import java.util.Arrays;

public class Solution42 {
    /* 1번 문제
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            if( "Z".equals(arr[i])){
                answer -= Integer.parseInt(arr[i-1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }*/
    /* 3번 문제
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        int num = n;

        for(int i = 2; i <= Math.sqrt(num); i++){
            while (num % i == 0) {
                set.add(i);
                num /= i;
            }
        }
        if( num > 1){
            set.add(num);
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }*/
    /* 4번 문제
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for (char c : my_string.toCharArray()){
            answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }*/
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        Arrays.sort(answer);
        return answer;
    }
}
