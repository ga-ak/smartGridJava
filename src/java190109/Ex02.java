package java190109;

public class Ex02 {

    /*
    * 메소드 실습
    * -객체의 행위를 표현
    * -반복적인 작업
    *
    * 메소드는 return을 만나는 즉시 종료된다. 반복문의 break와 같은 역할을 함
    */

    // 더하기 (실수+정수)
    // 더하기 (실수+실수)
    // 더하기 (정수+실수)

    // 매개변수의 타입이 다르거나 매개변수의 갯수가 다른경우 같은이름의 메소드 선언을 허용한다
    // -> 메소드 오버로딩

    public static double plus(double num1, int num2) {
        double result = num1 + num2;
        return result;
    }

    public static double plus(int num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double plus(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }



    public static int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int multiple(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static double divide(int num1, int num2) {
        double result = (double)num1/ num2;
        return result;
    }

    public static void main(String[] args) {
        double num1 = 1.2;
        double num2 = 4.3;
        System.out.println(plus(num1,num2));
        /*System.out.println(minus(num1,num2));
        System.out.println(multiple(num1,num2));
        System.out.println(divide(num1,num2));*/
    }
}
