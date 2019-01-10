package java181228;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int n = sc.nextInt();
		int result = 1;
		for (int i=0; i<n; i++) {
			result *= base;
		}
		System.out.println(result);
	}

}
