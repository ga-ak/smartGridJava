package java_festival_exam;

import java.util.Random;

public class P6 {

    public static void main(String[] args) {
        int[] lottoArray = new int[45];
        for (int i = 0; i < lottoArray.length; i++) {
            lottoArray[i] = i+1;
        }

        Random ran = new Random();

        for (int i = 0; i < lottoArray.length; i++) {
            int a = ran.nextInt(lottoArray.length);
            int b = ran.nextInt(lottoArray.length);

            int temp = lottoArray[a];
            lottoArray[a] = lottoArray[b];
            lottoArray[b] = temp;
        }

        int startNum = ran.nextInt(lottoArray.length - 6);

        for (int i = startNum; i < startNum + 6; i++) {
            System.out.println("행운의 숫자 : "+lottoArray[i]+ " ");

        }
    }
}
