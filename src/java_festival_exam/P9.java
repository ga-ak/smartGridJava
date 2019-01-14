package java_festival_exam;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소인수분해 할 수를 입력하세요. : ");
        int inputInt = sc.nextInt();

        System.out.print(inputInt+" = ");
        for (int i = 2; i <= inputInt; i++) {
            while (inputInt % i == 0) {
                System.out.print(i+" ");
                inputInt = inputInt/i;

            }
        }
    }
}
