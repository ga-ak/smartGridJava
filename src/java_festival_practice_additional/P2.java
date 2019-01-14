package java_festival_practice_additional;

public class P2 {

    // collatz

    public static int collatz(int input) {
        int result = 0;

        for (int i = 0; i < 500; i++) {
            // 종료 조건
            if (i == 499) {
                return -1;
            } else if (input == 1) {
                return result;
            }

            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(collatz(50));
    }
}
