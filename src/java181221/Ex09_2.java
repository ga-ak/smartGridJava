package java181221;

import java.util.Scanner;

public class Ex09_2 {

	public static void main(String[] args) {
		// switch ��� ���Ǳ� ����
		Scanner sc = new Scanner(System.in);
		int money, beverage, cost = 0, result;
		
		System.out.print("�ݾ��� �Է��ϼ��� >>> ");
		money = sc.nextInt();
		System.out.println("�޴��� ������");
		System.out.print("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�� ����(1500��) >>> ");
		beverage = sc.nextInt();
		
		switch (beverage) {
		case 1:
			cost = 800;
			break;
		case 2:
			cost = 500;
			break;
		case 3:
			cost = 1500;
			break;	
		}
		
		result = money - cost;
		System.out.println(result>=0 ? "�ܵ� : "+result : "���� "+(-1*result)+"�� �����մϴ�");

	}

}
