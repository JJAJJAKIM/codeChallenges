package com.codeChallenges.lv0;

import java.util.Arrays;

public class Solution38 {
    /* 1번 문제
    public int solution(int n) {
        int count = 0;
        int num = 0;

        while (count < n) {
            num++;
            // 3의 배수이거나, 숫자에 3이 포함되면 건너뜀
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }
            count++; // 사용 가능한 숫자
        }
        return num;
    }*/
    public int solution(String[] spell, String[] dic) {

        char[] spellChars = String.join("", spell).toCharArray();
        Arrays.sort(spellChars);
        String sortedSpell = new String(spellChars);

        for (String word : dic) {
            if (word.length() != spell.length) continue;

            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = new String(wordChars);

            if (sortedSpell.equals(sortedWord)) {
                return 1;
            }
        }

        return 2;
    }
}
