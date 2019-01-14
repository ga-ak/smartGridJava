package java_festival_practice_additional;

import java.util.Random;

public class P1 {

    // 중복이 없이 숫자를 뽑는 프로그램을 만드시오

    public static void main(String[] args) {
        int[] numArray = new int[45];
        Random ranNum = new Random();

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i+1;
        }

        for (int i = 0; i < numArray.length; i++) {
            int a = ranNum.nextInt(45);
            int b = ranNum.nextInt(45);
            int temp;

            temp = numArray[a];
            numArray[a] = numArray[b];
            numArray[b] = temp;
        }
        int startNum = ranNum.nextInt(numArray.length - 6);

        System.out.println(startNum);

        for (int i = 0; i < 6; i++) {
            System.out.println("행운의 숫자 : "+numArray[startNum++]);
        }

    }
}
