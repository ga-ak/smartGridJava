package java190108;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {

    // 회원가입과 로그인 기능 구현

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> userList = new ArrayList<>();

        while (true) {
            System.out.print("[1]회원가입 [2]로그인 [3]종료");

            int inputkey = sc.nextInt();

            if (inputkey == 1) {
                System.out.println("==========회원목록==========");
                if (userList.size() == 0) {
                    System.out.println("회원이 없습니다!");
                } else {
                    for (int i = 0; i < userList.size(); i++) {
                        System.out.println(i + 1 + ". " + userList.get(i)[0]);
                    }
                }
                System.out.println("==========================");
                String[] tempIp = new String[2];
                System.out.print("아이디를 입력해 주세요 : ");
                tempIp[0] = sc.next();
                System.out.print("패스워드를 입력해 주세요 : ");
                tempIp[1] = sc.next();
                userList.add(tempIp);
                // 겹치는 유저 회원가입 안되게 하는 기능 빠져있음

            } else if (inputkey == 2) {
                System.out.print("아이디를 입력하세요 : ");
                String inputId = sc.next();
                System.out.println("비밀번호를 입력하세요 : ");
                String inputPw = sc.next();

                for (int i = 0; i < userList.size(); i++) {
                    if (userList.get(i)[0].equals(inputId)) {
                        if (userList.get(i)[1].equals(inputPw)) {
                            System.out.println(userList.get(i)[0]+"님 환영합니다!");
                        } else {
                            System.out.println("아이디와 비밀번호를 확인하세요!");
                        }
                    } else if (i == userList.size()-1) {
                        System.out.println("아이디와 비밀번호를 확인하세요!");
                    }
                }
            } else if (inputkey == 3) {
                break;
            }
        }
        System.out.println("프로그램 종료!");
    }
}
