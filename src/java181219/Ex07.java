package java181219;

public class Ex07 {
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("swap�޼ҵ� = a : %d\tb: %d\n", a, b);
	}

	public static void main(String[] args) {
		int a = 30;
		int b = 50;

		System.out.println(a + "," + b);

		int temp = a;
		a = b;
		b = temp;

		swap(a, b); // �۵����� ����

		System.out.println(a + "," + b);

	}

}
