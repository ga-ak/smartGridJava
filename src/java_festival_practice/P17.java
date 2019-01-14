package java_festival_practice;

import java.util.Scanner;

public class P17 {

    // 소인수 분해를 해주는 프로그램을 구현하라

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Number : ");
        int number = scan.nextInt();
        System.out.print(number + "=");

        for(int i = 2; i <= number; i++) {
            while(number % i == 0) {
                number /= i;
                System.out.print(i);
                // i가 for문의 마지막일때는 "*"출력하지 않음
                if(number > i) {
                    System.out.print("*");
                }
            }
        }

    }
}
