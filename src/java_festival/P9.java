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
        int smallerNum;
        int commonDiviser =1;
        int commonMultiple;
        if (num1 > num2) {
            smallerNum = num2;
        } else {
            smallerNum = num1;
        }

        for (int i = 1; i <= smallerNum / 2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                commonDiviser = i;
            }
        }

        commonMultiple = num1 * num2 / commonDiviser;

        System.out.println("최대공약수 : " + commonDiviser);
        System.out.println("최소공배수 : "+ commonMultiple);

    }
}
