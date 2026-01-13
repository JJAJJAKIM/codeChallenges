package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution37 {
    public int solution(int[][] lines) {
        List<int[]> events = new ArrayList<>();

        // 시작점 +1, 끝점 -1
        for (int[] line : lines) {
            int start = Math.min(line[0], line[1]);
            int end = Math.max(line[0], line[1]);

            events.add(new int[]{start, 1});
            events.add(new int[]{end, -1});
        }

        // 좌표 기준 정렬 (같은 좌표면 시작(+1) 먼저)
        events.sort((a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int overlapLength = 0;
        int count = 0;
        int prevPos = events.get(0)[0];

        for (int[] event : events) {
            int curPos = event[0];

            // 이전 구간에서 2개 이상 겹쳤다면 길이 추가
            if (count >= 2) {
                overlapLength += curPos - prevPos;
            }

            count += event[1];
            prevPos = curPos;
        }

        return overlapLength;
    }
}
