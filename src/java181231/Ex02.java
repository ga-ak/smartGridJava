package java181231;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� >>> ");
		int inputValue = sc.nextInt();
		long st = System.currentTimeMillis();
		boolean isPrime = true;

		if (inputValue % 2 == 0) {
			if (inputValue == 2) {

			} else {
				isPrime = false;
			}
		} else {
			for (int i = 3; i <= inputValue / 3; i = i + 2) {
				if (inputValue % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		long et = System.currentTimeMillis();
		long result = et - st;
		System.out.println(inputValue + "�� " + (isPrime ? "�Ҽ��Դϴ�." : "�Ҽ��� �ƴմϴ�."));
		System.out.println(result / 1000.0 + "�� �ɸ�!!");
	}

}
