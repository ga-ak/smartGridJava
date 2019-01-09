package java181226;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// minusGame
		// 1. 랜덤으로 두 수를 뽑는다. (1~9) -> 답은 음수일 수 없다.
		// 2. 문제를 출력 (7 - 1 = ?)
		// 3. 틀렸으면 "멍청이...." 출력
		// 4. 답 입력 후에는 다음문제가 출력됨
		// 5. 기회(life)는 총 3번

		int life = 3;
		int a, b;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (life>0) {
			a = new Random().nextInt(9) + 1;
			b = new Random().nextInt(a) + 1;
			
			int result = a - b;
			System.out.printf("%d - %d = ",a,b);
			if (sc.nextInt() != result) {
				System.out.println("멍청이..... life : "+(--life));
				
			} else {
				count++;
			}
		}
		System.out.printf("맞은 문제수 : %d개",count);
	}

}
