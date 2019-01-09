package java190109;

public class Ex01 {

    // java 레퍼런스 개념 이해하기!

    public static void main(String[] args) {
        String[] foods = {"닭발", "두부김치", "어묵탕"};
        String[] fruits = {"복숭아", "바나나", "오렌지", "사과", "골드키위"};

        for (String s : foods) {
            System.out.println(s+" ");
        }
        System.out.println();
        for (String s : fruits) {
            System.out.println(s+" ");
        }
        System.out.println();

        // fruit의 주소값을 foods에 대입
        foods = fruits;

        // foods[2]를 바꿨더니 fruits[2]역시 바뀌어 버림
        foods[2] = "김치전";

        /*
        *
        *  값이 복사 됨 : call by value -> 대입한 값을 바꾸더라도 다른 값이 바뀌지 않음
        *  주소가 복사 됨 : call by reference -> 대입한 값을 바꾸면 다른 값도 바뀌어 버림
        *
        */

        for (String s : foods) {
            System.out.println(s+" ");
        }
        System.out.println();
        for (String s : fruits) {
            System.out.println(s+" ");
        }
    }
}
