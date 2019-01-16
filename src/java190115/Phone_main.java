package java190115;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone_main {

    //추가, 삭제 찾기 전체보기 종료기능이 있는 전화번호부를 구현하라

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhoneVO> phoneList = new ArrayList<>();

        while (true) {
            System.out.println("\n==================전화번호부==================");
            System.out.print("[1]추가 [2]삭제 [3]찾기 [4]전체보기 [5]종료 >>> ");
            int choice = sc.nextInt();
            System.out.println();

            if (choice == 1) {
                System.out.println("[1]추가 선택!");
                System.out.print("이름입력 >>> ");
                String name = sc.next();
                System.out.print("나이입력 >>> ");
                int age = sc.nextInt();
                System.out.print("전화번호 입력 >>> ");
                sc.nextLine();
                String phoneNum = sc.nextLine();

                phoneList.add(new PhoneVO(name, age, phoneNum));
                System.out.println("["+phoneList.get(phoneList.size()-1).getName()+"] 추가 완료!");

            } else if (choice == 2) {
                System.out.println("[2]삭제 선택!");
                System.out.print("[1]선택삭제 [2]전체삭제 >>> ");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.print("삭제할 전화번호의 이름입력 >>> ");
                    String name = sc.next();
                    if (phoneList.size() == 0) {
                        System.out.println("전화번호부가 비어있습니다!");
                        continue;
                    }
                    for (int i = 0; i < phoneList.size(); i++) {

                        if (phoneList.get(i).getName().equals(name)) {
                            phoneList.remove(i);
                            System.out.println("["+name+"] 전화번호 삭제완료!");
                            break;
                        }
                        if (i == phoneList.size()-1) {
                            System.out.println("이름이 ["+name+"] 인 전화번호가 존재하지 않습니다!");
                        }
                    }
                } else if (choice == 2) {
                    phoneList.clear();
                }

            } else if (choice == 3) {
                System.out.println("[3]찾기 선택!");
                System.out.print("찾을 전화번호의 이름입력 >>> ");
                String name = sc.next();
                if (phoneList.size() == 0) {
                    System.out.println("전화번호부가 비어있습니다!");
                    continue;
                }
                for (int i = 0; i < phoneList.size(); i++) {

                    if (phoneList.get(i).getName().equals(name)) {
                        System.out.println(phoneList.get(i).getName()+"\t"+phoneList.get(i).getAge()+"\t"+phoneList.get(i).getPhoneNum());
                        break;
                    }
                    if (i == phoneList.size()-1) {
                        System.out.println("이름이 ["+name+"] 인 전화번호가 존재하지 않습니다!");
                    }
                }
            } else if (choice == 4) {
                System.out.println("전체보기 선택!\n");
                if (phoneList.size() == 0) {
                    System.out.println("전화번호부가 비어있습니다!");
                    continue;
                } else {
                    System.out.println("\n==================================");
                    for (int i = 0; i < phoneList.size(); i++) {
                        System.out.println((i+1)+" : "+phoneList.get(i).getName()+"\t"+phoneList.get(i).getAge()+"\t"+phoneList.get(i).getPhoneNum());
                    }
                    System.out.println("==================================\n");
                }

            } else if (choice == 5) {
                break;
            }
        }
        System.out.println("프로그램 종료!");
    }
}
