package java_festival;

public class P12 {

    // 정수형 변수 input을 선언하고 피보나치 수열의 input번째 항까지 출력하시오.

    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else{
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    public static void main(String[] args) {
        int input = 8;
        System.out.println("김철호 dlkdjf");

        for (int i = 1; i <= input; i++) {
            System.out.print(fibo(i)+" ");
        }

    }

    /*public static int fibo(int input) {
        int a = 1;
        int b = 1;
        int c = 1;
        if (input < 3) {
            return 1;
        } else {
            for (int i = 0; i < input-2; i++) {
                c = a + b;
                b = a;
                a = c;
            }
        }

        return a;
    }*/
}
