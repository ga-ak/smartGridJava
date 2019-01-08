package java_festival;

public class P16 {

    // 하샤드 수 구하기
    // 세자리 수 부터는 오류나기 때문에 고쳐야 함

    public static void main(String[] args) {
        int num = 11;
        int num1, num2;
        boolean bool;

        num1 = num / 10;
        num2 = num % 10;

        int sum = num1 + num2;
        if(num % sum == 0) {
            bool = true;
        } else {
            bool = false;
        }
        System.out.println(bool);

    }
}
