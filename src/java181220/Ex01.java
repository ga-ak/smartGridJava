package java181220;

public class Ex01 {

	public static void main(String[] args) {
		int num = 5;

		// num�� 1������Ű�� ��
		num = num + 1;
		num += 1;
		num++;
		++num;
		System.out.println(num);
		System.out.println(num++); //��� : 9, num : 10 (����� ����)
		System.out.println(num);
		System.out.println(++num); //��� : 11, num : 11
		System.out.println(num--); //��� : 11, num : 10
		
		int num2 = num++; //�� num ���� num2�� ������ �� num 1 ����
		System.out.println(num2);
		int a = 0;
		int b = 0;
		a = ++b;
		System.out.println(a+" "+b);
	}

}
