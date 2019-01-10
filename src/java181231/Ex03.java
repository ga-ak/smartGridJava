package java181231;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int inputValue = sc.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.println(inputValue+"*"+i+"="+inputValue*i);
		}

	}

}
