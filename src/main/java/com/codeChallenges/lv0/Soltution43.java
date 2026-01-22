package com.codeChallenges.lv0;

import java.util.Arrays;

public class Soltution43 {
    /* 1번 문제
    public String solution(String my_string) {
        String answer = "";
        String[] list = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < list.length; i++){
            my_string = my_string.replace(list[i], "");
        }
        answer = my_string;
        return answer;
    }*/
    /* 2번 문제
    public int solution(int n) {
        int tmp = 1;
        int i = 1;

        while (true) {
            tmp *= i;
            if (tmp > n) {
                return i - 1;
            }
            i++;
        }
    }*/
    /* 3번 문제
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }*/
    public int solution(int n) {
        int count = 0;

        for (int i = 4; i <= n; i++) { // 4부터 합성수
            if (!isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
