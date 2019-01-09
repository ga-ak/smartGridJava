package java190109;

import java.util.Scanner;

public class Ex09 {

    // 끝말잇기 게임을 구현하라 틀리기 전까지 무한루프

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제시어 >> ");
        String inputString = sc.nextLine();

        while (true) {
            System.out.print("단어를 입력해 주세요 >> ");
            String tempString = sc.nextLine();
            char exChar = inputString.charAt(inputString.length()-1);
            char inChar = tempString.charAt(0);
            if (exChar != inChar) {
                System.out.println("틀렸습니다!");
                break;
            } else {
                inputString = tempString;
            }
        }
    }
}
