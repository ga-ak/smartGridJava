package java181228;

public class Ex01 {

	public static void main(String[] args) {
		// 56~21 ���
		/*
		 * for (int i=56; i>=21; i--) { System.out.println(i); }
		 */

		// ������ �����ϳ� ¦���� ��� -1���ؼ� ���
		int m = 1;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i * m);
			m *= -1;
		}

	}

}
