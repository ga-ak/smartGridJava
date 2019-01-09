package java190109;

public class Ex06 {

    // 피보나치 수열 메소드로 구현하기

    public static int fibo(int n) {
        int result;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            result = fibo(n-2) + fibo(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            System.out.println(fibo(i));
        }
    }
}
