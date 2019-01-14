package java_festival_practice;

import java.util.Scanner;

public class P1 {

    // 현재몸무게와 목표몸무게를 각각 입력받고 주차별 감량몸무게를
    // 입력받아 목표 달성 시 축하메세지를 띄우는 프로그램 구현

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 몸무게 : ");
        int currentWeight = sc.nextInt();
        System.out.print("목표 몸무게 : ");
        int goalWeight = sc.nextInt();
        int weekCounter = 1;

        while (true) {
            if (currentWeight <= goalWeight) {
                break;
            }

            System.out.print(weekCounter+"주차 감량 몸무게 : ");
            int loseWeight = sc.nextInt();
            currentWeight -= loseWeight;
            weekCounter++;
        }

        System.out.println(currentWeight+"kg 달성!! 축하합니다");



    }
}
