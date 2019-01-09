package java190109;

import java.util.Scanner;

public class Ex08 {

    // "베이컨 토마토 디럭스"를 거꾸로 출력하기

    public static void main(String[] args) {
        String btd = "베이컨 토마토 디럭스";
        for (int i = 0; i < btd.length(); i++) {
            System.out.print(btd.charAt(btd.length()-i-1));
        }

        System.out.println();

        String[] a = btd.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[a.length-i-1]+" ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\n거꾸로 출력하고 싶은 문장을 입력하세요 : ");
        btd = sc.nextLine();

        for (int i = 0; i < btd.length(); i++) {
            System.out.print(btd.charAt(btd.length()-i-1));
        }
    }
}
