package java181220;

public class Ex02 {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;

		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println((3 > 5) && (5 < 8)); // IDE���� �� �κ� ���꿡 ���ǥ�� �ߴ� ���� : �� ������ false�̱⶧���� �� �κ��� �� �ʿ䵵 ����.
		System.out.println((3 > 5) || (5 < 8));

		System.out.println(a > b ? "a�� �� ũ��" : "b�� �� ũ��");
	}

}
