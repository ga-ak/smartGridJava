package java181219;

public class Ex03 {
	public static void main(String[] args) {
		String a = 10 + 7 + ""; // ���ڿ� ���ڿ� ���� -> ���ڿ�, ���ϱ� �����̱� ������ �պ��� ����
		String b = 8 + "" + 2;
		String c = "" + 5 + 2;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int num1 = 7;
		int num2 = 3;
		System.out.println("���ϱ� ���\t: " + (num1 + num2));
		System.out.println("���� ���\t: " + (num1 - num2));
		System.out.println("���ϱ� ���\t: " + (num1 * num2));
		System.out.println("��������\t: " + ((double) num1 / num2));
	}
}
