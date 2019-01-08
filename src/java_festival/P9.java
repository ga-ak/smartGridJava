package java_festival;

import java.util.Scanner;

public class P9 {

    // 두 정수를 입력받아 최대공약수 & 최소공배수를 출력하시오

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자1 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 >> ");
        int num2 = sc.nextInt();
        int num1C = 2;
        int num2C = 2;

        for (int i = 2; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                num1C++;
                System.out.println("숫자 10의 약수"+i);
            }
        }

        for (int i = 2; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                num2C++;
            }
        }

        int[] num1A = new int[num1C];
        int[] num2A = new int[num2C];
        int count = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                num1A[count++] = i;
            }
        }
        count =0;
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                num2A[count++] = i;
            }
        }

        int commonDivisor = -1;
        for (int i = 1; i < num1A.length; i++) {
            for (int j = 1; j < num2A.length; j++) {
                if (num1A[i] == num2A[j]) {
                    commonDivisor = num1A[i];
                    break;
                }
            }
        }

        for (int i = 0; i < num1A.length; i++) {
            System.out.println(num1A[i]);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < num2A.length; i++) {
            System.out.println(num2A[i]);
        }
        System.out.println(num1A.length);
        System.out.println("최대공약수 : " + commonDivisor);
        System.out.println("최소공배수 : "+ num2A[num2A.length-1] * num1A[1]);
    }
}
