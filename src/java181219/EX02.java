package java181219;

public class EX02 {

	public static void main(String[] args) {
		// ����
		boolean boo = true; // false �� ����
		System.out.println(boo);

		// ������
		char c = '��';
		System.out.println(c);

		// ������
		byte by = 1;
		System.out.println(by);
		short sh = 10;
		System.out.println(sh);
		int i = 100;
		System.out.println(i);
		long l = 1000l;
		System.out.println(l);
		// by = (byte)l;

		System.out.println(by + i);

		// �Ǽ���
		float f = 10.23f;
		double d = 33.24;
		System.out.println(f + "\n" + d);

		// ���ڿ�
		String s = "�ȳ�";
		String s1 = "���� �� ";
		String s2 = "���ɽð��Դϴ�.";
		System.out.println(s);
		System.out.println(s1 + s2);
		
		// �ڵ�����ȯ
		byte b2 = 10; // ������ ���� �־ �ʱ�ȭ �� �ʿ�� ����!
		int i2;
		
		i2 = b2;
		
		// ��������ȯ
		float f2 = 10.23f;
		int i3 = 10;
		i3 = (int)f2;
		System.out.println(i3);
	}

}
