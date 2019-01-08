package java_festival;

import java.util.Scanner;

public class P2 {

    // 일한 시간을 입력받아 총임금을 계산하는 시급계산기입니다.
    // 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해
    // 1.5배의 시급이 책정됩니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("일한시간을 입력하세요 : ");
        int workedHour = sc.nextInt();
        int pee = 0;
        if (workedHour > 8) {
            pee += (workedHour - 8) * 5000 * 1.5;
            pee += 8 * 5000;
        } else {
            pee += workedHour * 5000;
        }

        System.out.println("총 임금은 "+pee+"원 입니다.");

    }
}
