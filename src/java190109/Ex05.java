package java190109;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

    // 정수를 입력받는 isDivisor()를 만들고 입력받은 숫자가 소수면 true, 아니면 false를 리턴하라


    public static int getDivSum(int a) {
        int result = 1;

        if (a % 2 == 0) {
            if (a == 2) {
                return result;
            } else {
                return result;
            }
        } else {
            for (int i = 3; i <= a / 3; i+=2) {
                if (a % i == 0) {
                    result += i;

                }
            }
        }


        return result;
    }

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

    // 완전수를 찾는 isPerfect()메소드를 구현하라
    // 완전수란? 약수 중 자기 자신을 제외한 약수들의 합이 자신과 같은 수

    public static boolean isPerfect(int a) {
        boolean result = false;
        int sum = 0;

        ArrayList<Integer> tempArray = new ArrayList<>();
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                tempArray.add(i);
            }
        }

        for (int i = 0; i < tempArray.size(); i++) {
            sum += tempArray.get(i);
        }

        if (sum == a) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 >> ");
        int tempInt = sc.nextInt();
        System.out.print(tempInt+"은(는) ");
        System.out.println(isDivisor(tempInt)?"소수입니다 ":"소수가 아닙니다 ");
        System.out.print(tempInt+"은(는) ");
        System.out.println(isPerfect(tempInt)?"완전수 입니다":"완전수가 아닙니다");

    }
}
