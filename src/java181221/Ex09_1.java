package java181221;

import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {
		// if �̿� ���Ǳ� ����
		Scanner sc = new Scanner(System.in);
		int money;
		int beverage;
		int cost = 0;
		int result;
		int cola = 800;
		int water = 500;
		int vitamin = 1500;
		System.out.print("�ݾ��� �Է��ϼ��� >>> ");
		money = sc.nextInt();
		System.out.println("�޴��� ������");
		System.out.printf("1. �ݶ�(%d��) 2. ����(%d��) 3. ��Ÿ�� ����(%d��) >>> ",cola, water, vitamin);
		beverage = sc.nextInt();
		
		if(beverage == 1) {
			cost = cola;
		} else if(beverage == 2) {
			cost = water;
		} else if(beverage == 3) {
			cost = vitamin;
		}
		
		result = money - cost;
		
		System.out.println(result>=0 ? "�ܵ� : "+result : "���� "+(-1*result)+"�� �����մϴ�. >>> "+money+"���ݳ�!");
		int a,b,c;
		a = result / 1000;
		result %= 1000;
		
		b = result / 500;
		result %= 500;
		
		c = result / 100;
		result %= 100;
		
		System.out.printf("õ�� : %d��, ����� : %d��, ��� %d��",a,b,c);
		
	}

}
