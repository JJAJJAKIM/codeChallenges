package com.codeChallenges.lv1;

public class Solution54 {
    public static void main(String[] args) {
        String[] comd = {"next"};
        solution("07:22", "04:05", "00:15", "04:07", comd);
    }
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = toSecond(video_len);
        int current = toSecond(pos);
        int start = toSecond(op_start);
        int end = toSecond(op_end);

        // 시작 위치 오프닝 체크
        if (current >= start && current <= end) {
            current = end;
        }

        for (String com : commands) {

            if ("prev".equals(com)) {
                current -= 10;
                if (current < 0) current = 0;
            } else { // next
                current += 10;
                if (current > video) current = video;
            }

            // 🔥 매 명령 후 오프닝 체크
            if (current >= start && current <= end) {
                current = end;
            }
        }

        return toTime(current);
    }

    private static int toSecond(String time) {
        String[] parts = time.split(":");
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);
        return min * 60 + sec;
    }

    private static String toTime(int sec) {
        int m = sec / 60;
        int s = sec % 60;
        return String.format("%02d:%02d", m, s);
    }
}
