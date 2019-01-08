package java_festival;

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Number : ");
        int number = scan.nextInt();
        System.out.print(number + "=");

        for(int i = 2; i <= number; i++) {
            while(number % i == 0) {
                number /= i;
                System.out.print(i);
                if(number > i) {
                    System.out.print("*");
                }
            }
        }

    }
}
