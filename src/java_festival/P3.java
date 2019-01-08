package java_festival;

public class P3 {

    // 1 - 2 + 3 - 4 + ... + 99 - 100 를 계산하여 답을 출력하시오.

    public static void main(String[] args) {

        int sign = 1;
        int result = 0;

        for(int i=1; i<=100; i++) {
            result += i * sign;
            sign *= -1;
        }

        System.out.println(result);
    }
}
