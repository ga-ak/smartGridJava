package java190103;

public class Ex01 {

	public static void main(String[] args) {
		// ������ ������ 10���� �����ϴ� Array
		int[] intArray = new int[10];
		
		System.out.println(intArray.length);
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = i+i+1;
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
