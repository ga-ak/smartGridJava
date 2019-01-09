package java190109;

import java.util.Scanner;

public class Ex05 {

    // 정수를 입력받는 isDivisor()를 만들고 입력받은 숫자가 소수면 true, 아니면 false를 리턴하라

    public static boolean isDivisor(int a) {
        boolean result = true;

        if (a % 2 == 0) {
            if (a == 2) {
                result = true;
            } else {
                result = false;
            }
        } else {
            for (int i = 3; i <= a / 3; i+=2) {
                if (a % i == 0) {
                    result = false;
                    break;
                } else if (i == a / 3) {
                    result = true;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소수인지 판별할 정수 입력 >> ");
        int tempInt = sc.nextInt();
        System.out.println(isDivisor(tempInt)?"소수입니다":"소수가 아닙니다");
    }
}
