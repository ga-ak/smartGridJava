package java190121;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone_main {

    // 메인 기능으로 추가, 찾기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<PhoneVO> phoneList = new ArrayList<>();
        PhoneCon con = new PhoneCon();

        while (true) {
            System.out.print("[1]추가 [2]찾기 [3]종료 >>> ");
            int choice = sc.nextInt();

            // 추가
            if (choice == 1) {
                System.out.println("\n회원 추가 선택!");
                System.out.print("이름 입력 >>> ");
                String name = sc.next();
                System.out.print("나이 입력 >>> ");
                int age = sc.nextInt();
                System.out.print("전화번호 입력 >>> ");
                String phoneNum = sc.next();

                con.phoneAdd(name, phoneNum, age);

            } else if (choice == 2) {
                System.out.println("\n회원 찾기 선택!");
                System.out.println("어떤 정보로 회원을 찾으시겠습니까?");
                System.out.print("[1]이름 [2]전화번호 >>> ");
                System.out.println(con.phoneFind(sc));

            } else if (choice == 3) {
                break;
            }

        }

        System.out.println("프로그램 종료!");
    }
}
