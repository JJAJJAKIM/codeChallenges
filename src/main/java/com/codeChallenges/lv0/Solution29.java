package com.codeChallenges.lv0;

public class Solution29 {
    /* 1번 문제
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            boolean[] used = new boolean[sounds.length];
            int idx = 0;
            boolean isValid = true;
            while (idx < word.length()) {
                boolean matched = false;
                for (int i = 0; i < sounds.length; i++) {
                    String sound = sounds[i];
                    if (!used[i] && word.startsWith(sound, idx)) {
                        used[i] = true;
                        idx += sound.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) answer++;
        }
        return answer;
    }*/
    /* 2번 문제
    public int solution(int[] common) {
        int answer = 0;
        int size = common.length;
        if(common[1] - common[0] == common[2] - common[1]){
            int diff = common[1] - common[0];
            answer = common[size - 1] + diff;
        } else {
            int ratio = common[1] / common[0];
            answer = common[size - 1] * ratio;
        }
        return answer;
    }*/
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total - (num - 1) * num / 2) / num;
        for (int i = 0; i < num; i++){
            answer[i] = start + i;
        }
        return answer;
    }
}
