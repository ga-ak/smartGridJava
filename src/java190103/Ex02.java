package java190103;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		Random ran = new Random();
		int min = 1;
		int max = 5000;
		int[] intArray = new int[max];
		int evenC = 0;
		boolean isInclude = true;
		long st = System.currentTimeMillis();
		
		for(int i=0; i<intArray.length; i++) {
			int a = ran.nextInt(max)+min;
			for(int j=0; j<i; j++) {
				if(a == intArray[j]) {
					a = ran.nextInt(max)+min;
					j=0;
				}
			}
			intArray[i] = a;
		}
		long et = System.currentTimeMillis();
		/*for(int i=0; i<intArray.length; i++) {
			if(intArray[i]%2==0) {
				System.out.println(intArray[i]);
				evenC++;
			}
		}*/
		//System.out.println("¦�� ���� : "+evenC);
		System.out.println((et-st)/1000.0+"�� �ɸ�! >> �����");
		
		//intArray �ʱ�ȭ
		for(int i:intArray) {
			i=0;
		}
		st = System.currentTimeMillis();
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = ran.nextInt(max)+min;
			for(int j=0; j<=i-1; j++) {
				//System.out.println("��"+j+" "+i);
				if(intArray[j] == intArray[i]) {
					i--;
					break;
				}
			}
		}
		et = System.currentTimeMillis();
		System.out.println((et-st)/1000.0+"�� �ɸ�! >> ������ ���");
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i]%2==0) {
				//System.out.println(intArray[i]);
				evenC++;
			}
		}
		//System.out.println("¦��"+evenC);
		st = System.currentTimeMillis();
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = i+1;
		}
		
		for(int i=0; i<intArray.length; i++) {
			int a = ran.nextInt(max)+min-1;
			int b = ran.nextInt(max)+min-1;
			int temp = intArray[a];
			intArray[a] = intArray[b];
			intArray[b] = temp;
		}
		et = System.currentTimeMillis();
		/*for(int i: intArray) {
			System.out.println(i);
		}*/
		System.out.println((et-st)/1000.0+"�� �ɸ�! >> ���ο� ���");
		
		int biggest = Integer.MIN_VALUE;
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] > biggest) {
				biggest = intArray[i];
			}
		}
		System.out.println("���� ū �� : "+biggest);
	}

}
