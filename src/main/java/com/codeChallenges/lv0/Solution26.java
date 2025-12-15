package com.codeChallenges.lv0;
import java.util.Scanner;

public class Solution26 {
    /* 1번 문제
    public static void main(String[] args) {
        String msg = "Spring is beginning";
        int val1 = 3;
        String val2 = "3";

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }*/
    /* 2번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        //int sum_angle = angle1 + angle2;
        int sum_angle = (angle1 + angle2) % 360;
        System.out.println(sum_angle);
    }*/
    /* 3번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; number > 0; i++){
            answer += number % 100;
            number /= 100;
        }
        answer += number;
        System.out.println(answer);
    }*/
    /*4번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){
            System.out.println("Ophthalmologyc");
        }
        else if(lastFourWords.equals("head")){
            System.out.println("Neurosurgery");
        }
        else if(lastFourWords.equals("infl")){
            System.out.println("Orthopedics");
        }
        else if(lastFourWords.equals("skin")){
            System.out.println("Dermatology");
        } else {
            System.out.println("direct recommendation");
        }
    }*/
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i< cpr.length; i++){
            for(int j=0; j< basic_order.length; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }
}
