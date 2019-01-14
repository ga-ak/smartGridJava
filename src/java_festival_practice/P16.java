package java_festival_practice;

import java.util.Scanner;

public class P16 {

    // 하샤드 수 구하는 메소드 구현
    // 원래 수가 각 자릿수의 합으로 나누어 떨어지는 수

    public static boolean isHarshad(int inputNum) {
        String tempStringNumber = Integer.toString(inputNum);
        int sum = 0;
        boolean result = false;

        // inputNum을 String으로 형변환 하여 자릿수 다루기 편하게 만듬
        // subString으로 한 글자씩 sum에 누적
        for (int i = 0; i < tempStringNumber.length(); i++) {
            sum += Integer.parseInt(tempStringNumber.substring(i,i+1));
        }
        System.out.println(sum);

        if (inputNum % sum == 0) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        System.out.println(isHarshad(inputNum));
    }
}
