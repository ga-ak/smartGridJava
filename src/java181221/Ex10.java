package java181221;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// ����ó������ 5������ ������ �ֽ��ϴ�
		// �����ͺ��̽�, ���ڰ���, �ü��, ����Ʈ�������, ���������
		// ��� 60�� �̻�, ���� ���� 40��
		
		// 5������ ������ �Է��϶�, �� ������ 5���̴�
		Scanner sc = new Scanner(System.in);
		int db,ec,os,se,dc;
		double avg;
		String result;
		
		System.out.print("�����ͺ��̽� ���� : ");
		db = sc.nextInt();
		System.out.print("���ڰ��� ���� : ");
		ec = sc.nextInt();
		System.out.print("�ü�� ���� : ");
		os = sc.nextInt();
		System.out.print("����Ʈ������� ���� : ");
		se = sc.nextInt();
		System.out.print("��������� ���� : ");
		dc = sc.nextInt();
		
		avg = (db+ec+os+se+dc)/5.0;
		
		if(db<40||ec<40||os<40||se<40||dc<40) {
			result = "���հ� -> ���� ";
		} else if (avg<60) {
			result = "���հ� -> ��չ̴� ";
		} else {
			result = "�հ� ";
		}
		
		System.out.println(result + avg);
	}

}
