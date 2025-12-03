package com.codeChallenges.lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution19 {
    /* 1번 문제
    public String[] solution(String myStr) {
        String[] answer = {};
        String[] str = myStr.split("[abc]");
        List<String> list = new ArrayList<String>();
        for(String s : str) {
            if(!s.isEmpty()) list.add(s);
        }
        answer = list.toArray(new String[list.size()]);
        if(list.isEmpty()) answer = new String[]{"EMPTY"};
        return answer;
    }*/
    /* 2번 문제
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            for(int j = 0; j < num; j++) {
                list.add(num);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 3번 문제
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    list.remove(list.size()-1);
                }
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    /* 4번 문제
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if( list.isEmpty()){
                list.add(arr[i]);
            } else if (list.get(list.size()-1) == arr[i]) {
                list.remove(list.size()-1);
            } else if (list.get(list.size()-1) != arr[i]) {
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
                list.add(-1);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }*/
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int num : arr){
            if(!list.contains(num)){
                list.add(num);
            }
            if(list.size() == k) break;
        }
        while(list.size() < k){
            list.add(-1);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
