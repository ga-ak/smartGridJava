package java_festival;

import java.util.Scanner;

public class P4 {

    // 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오.
    // 단, 최대단위는 10000원, 최소단위는 100원

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총금액 입력 : ");
        int inputMoney = sc.nextInt();

        int[] change = {10000, 5000, 1000, 500, 100};
        int[] result = new int[change.length];

        for (int i = 0; i < change.length; i++) {
            result[i] = inputMoney / change[i];
            inputMoney %= change[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(change[i]+"원 : "+result[i]+"개");
        }

    }
}
