package java_festival_practice;

import java.util.Scanner;

public class P8 {

    // 정수를 입력받아 1의자리에서 반올림 한 결과를 출력하시오/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int inputNum = sc.nextInt();

        if (inputNum % 10 >= 5) {
            inputNum = inputNum - inputNum % 10 + 10;
        } else {
            inputNum = inputNum - inputNum % 10;
        }

        System.out.println(inputNum);
    }
}
