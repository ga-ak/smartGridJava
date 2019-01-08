package java_festival;

import java.util.Scanner;

public class P15 {

    // 정수 n을 입력받아 1, 2, 4, 7, 11 과 같은 수열의 n 번째 항까지 출력하시오.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n 입력 : ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 0; i < n; i++) {
            num += i;
            System.out.println(num);
        }

    }
}
