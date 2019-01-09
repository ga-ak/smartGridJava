package java181220;

public class Ex01 {

	public static void main(String[] args) {
		int num = 5;

		// num을 1증가시키는 법
		num = num + 1;
		num += 1;
		num++;
		++num;
		System.out.println(num);
		System.out.println(num++); //출력 : 9, num : 10 (출력후 증가)
		System.out.println(num);
		System.out.println(++num); //출력 : 11, num : 11
		System.out.println(num--); //출력 : 11, num : 10
		
		int num2 = num++; //현 num 값을 num2에 대입한 뒤 num 1 증가
		System.out.println(num2);
		int a = 0;
		int b = 0;
		a = ++b;
		System.out.println(a+" "+b);
	}

}
