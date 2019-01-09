package java190109;

import java.util.Scanner;

public class Ex03 {

    // 2개의 양수를 입력받아 더 큰수를 반환하는 메소드를 구현하라 단, 두 숫자가 같다면 0을 반환

    public static int largerNumber(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else if (a < b) {
            result = b;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("큰 수 확인 : "+ largerNumber(a,b));
    }
}
