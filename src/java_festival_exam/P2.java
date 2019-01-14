package java_festival_exam;

public class P2 {

    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 77; i++) {
            result += (78 - i) * i;
        }

        System.out.println(result);
    }
}
