package java181228;

public class Ex05 {

	public static void main(String[] args) {
		// 1,2,4,7,11 �� �����ϴ� ���� -> 20��°��?
		
		int a = 1;
		
		for (int i=1; i<20; i++) {
			a += i;
			System.out.println(i+1+" >>> "+a);
		}
		System.out.println("20��° ��� >>> "+a);
	}

}
