package java_festival_exam;

public class P15 {

    public static int expression(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            int temp = i;
            int tempC = 1;
            while (true) {
                if (temp == num) {
                    result++;
                    break;
                } else if (temp > num) {
                    break;
                }
                temp = temp+tempC++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(expression(5));
    }
}
