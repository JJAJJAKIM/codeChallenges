package com.codeChallenges.lv0;

import java.util.Arrays;

public class Solution40 {
    /* 1번 문제
    public String solution(String polynomial) {
        int xSum = 0;
        int numSum = 0;

        for (String term : polynomial.split(" ")) {
            if (term.equals("+")) continue;

            if (term.endsWith("x")) {
                xSum += term.equals("x") ? 1 : Integer.parseInt(term.replace("x", ""));
            } else {
                numSum += Integer.parseInt(term);
            }
        }

        if (xSum == 0) return String.valueOf(numSum);
        if (numSum == 0) return xSum == 1 ? "x" : xSum + "x";

        return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
    }*/
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;

        return Math.max(
                numbers[0] * numbers[1],
                numbers[n - 1] * numbers[n - 2]
        );
    }
}
