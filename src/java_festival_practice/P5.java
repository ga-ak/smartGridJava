package java_festival_practice;

import java.util.Scanner;

public class P5 {

    // 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수 : ");
        int inputRow = sc.nextInt();

        for (int i=0; i<inputRow; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
