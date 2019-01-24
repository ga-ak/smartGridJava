package java190121;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneCon {
    private ArrayList<PhoneVO> phoneList = new ArrayList<>();


    public void phoneAdd(String name, String phoneNum, int age) {

        phoneList.add(new PhoneVO(name, phoneNum, age));
    }

    public String phoneFind(Scanner sc) {

        int choice = sc.nextInt();
        String result = "해당 이름의 정보가 존재하지 않습니다!";
        if (choice == 1) {
            System.out.print("찾고자 하는 이름을 입력해 주세요 >>> ");
            String name = sc.next();

            for (int i = 0; i < phoneList.size(); i++) {
                if (phoneList.get(i).getName().equals(name)) {
                    result = phoneList.get(i).getPhoneNum();
                    break;
                }

            }
        } else if (choice == 2) {
            System.out.print("찾고자 하는 전화번호를 입력해 주세요 >>> ");
            String phoneNum = sc.next();

            for (int i = 0; i < phoneList.size(); i++) {
                if (phoneList.get(i).getPhoneNum().equals(phoneNum)) {
                    result = phoneList.get(i).getName();
                    break;
                }

            }
        }


        return result;
    }
}
