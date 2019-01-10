package java181231;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >>> ");
		int inputValue = sc.nextInt();
		System.out.printf("%d의 약수 : ",inputValue);
		
		for (int i=1; i<=inputValue/2; i++) {
			if (inputValue % i == 0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
