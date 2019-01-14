package java_festival_exam;

import java.util.Scanner;

public class P4 {



    public static void main(String[] args) {
        int commondivisor = 0;
        int commonmultiple = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자1 입력 >> ");
        int a = sc.nextInt();
        System.out.print("숫자2 입력 >> ");
        int b = sc.nextInt();

        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                commondivisor = i;
            }
        }

        commonmultiple = a* b /commondivisor;

        System.out.println("최대 공약수 : " + commondivisor);
        System.out.println("최소 공배수 : "+ commonmultiple);
    }
}
