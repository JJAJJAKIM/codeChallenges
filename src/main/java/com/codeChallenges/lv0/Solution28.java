package com.codeChallenges.lv0;

import java.util.Scanner;

public class Solution28 {
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while ( money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }*/
    /* 2번 문제
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }*/
    /* 3번 문제
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }*/
    /* 4번 문제
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
            return 5;
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set);
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);
        }
        return answer;
    }*/

    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for(int i=0; i<storage.length; i++){
            int clean_idx = -1;
            for(int j=0; j<num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }
            if(clean_idx == -1){
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}
