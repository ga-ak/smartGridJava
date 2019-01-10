package java181228;

public class Ex01 {

	public static void main(String[] args) {
		// 56~21 출력
		/*
		 * for (int i=56; i>=21; i--) { System.out.println(i); }
		 */

		// 절댓값은 증가하나 짝수일 경우 -1곱해서 출력
		int m = 1;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i * m);
			m *= -1;
		}

	}

}
