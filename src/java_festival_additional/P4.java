package java_festival_additional;

import java.util.Random;

public class P4 {

    // 합병

    public static int[] selectSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[minIndex] = temp;

        }

        return a;
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            } else {
                result[i] = b[i-a.length];
            }
        }
        result = selectSort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[20];
        int[] b = new int[7];
        Random ran = new Random();


        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(100);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            b[i] = ran.nextInt(100);
            System.out.print(b[i]+" ");
        }
        System.out.println();
        int[] result = merge(a,b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
