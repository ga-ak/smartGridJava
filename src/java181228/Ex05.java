package java181228;

public class Ex05 {

	public static void main(String[] args) {
		// 1,2,4,7,11 로 증가하는 수열 -> 20번째는?
		
		int a = 1;
		
		for (int i=1; i<20; i++) {
			a += i;
			System.out.println(i+1+" >>> "+a);
		}
		System.out.println("20번째 결과 >>> "+a);
	}

}
