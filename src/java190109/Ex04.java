package java190109;

import java.util.Scanner;

public class Ex04 {
    // 2개의 정수를 입력 받아 2개의 숫자 중 10에 더 가까운 수를 반환하는 메소드 close10()을 구현하라
    // 단, 두 정수의 10과의 거리가 같다면 0을 반환

    public static int close10(int a, int b) {
        int result = 0;

        int tempA = Math.abs(10 - a);
        int tempB = Math.abs(10 - b);

        if (tempA < tempB) {
            result = a;
        } else if (tempA > tempB) {
            result = b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 2개 입력 >> ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("10에 가까운 수는 : " + close10(a, b));
    }
}
