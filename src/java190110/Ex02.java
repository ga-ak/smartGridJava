package java190110;

public class Ex02 {

    // 저금통 만들기 실습 CoinBox 클래스
    // CoinBox 필드 : coin, shape
    // CoinBox 메소드 : 저축(input-int, output - x), 배가르기(input - x, output - int), 현재 돈 상태 확인




    public static void main(String[] args) {
        CoinBox pig = new CoinBox("돼지");

        // 처음 잔액 확인
        System.out.println(pig.getBalance());

        // 백만원 저축하기
        pig.deposit(1000000);

        // 배갈라서 돈꺼내기
        System.out.println(pig.openStomach());

        // 현재 잔액 확인
        System.out.println(pig.getBalance());
    }

}
