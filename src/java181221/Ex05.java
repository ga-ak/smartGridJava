package java181221;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		String result = "Ȧ��";
		if (num % 2 == 0) {
			result = "¦��";
		} 
		
		System.out.println(num+"��(��) "+result+"�Դϴ�.");
	}

}
