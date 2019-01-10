package java_festival;

import java.util.Scanner;

public class P9 {

    // 두 정수를 입력받아 최대공약수 & 최소공배수를 출력하시오

    public static int uclide(int a, int b) {
        int result;
        if (a % b == 0) {
            return b;
        } else {
            result = uclide(b, a % b);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자1 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 >> ");
        int num2 = sc.nextInt();
        int smallerNum;
        int biggerNum;
        int commonDiviser =1;
        int commonMultiple;
        if (num1 > num2) {
            biggerNum = num1;
            smallerNum = num2;
        } else {
            biggerNum = num2;
            smallerNum = num1;
        }

        commonDiviser = uclide(biggerNum, smallerNum);

        commonMultiple = num1 * num2 / commonDiviser;

        System.out.println("최대공약수 : " + commonDiviser);
        System.out.println("최소공배수 : "+ commonMultiple);

    }
}
