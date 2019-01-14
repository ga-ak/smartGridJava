package java_festival_exam;

public class P10 {

    public static int[] sort(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            int min = temp[i];
            int minIndex = i;

            for (int j = i + 1; j < temp.length; j++) {
                if ( temp[j] < min) {
                    min = temp[j];
                    minIndex = j;
                }

            }
            int tempI = temp[i];
            temp[i] = min;
            temp[minIndex] = tempI;
        }

        return temp;
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aC = 0;
        int bC = 0;

        for (int i = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            } else {
                result[i] = b[i - a.length];
            }

        }

        result = sort(result);


        return result;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int b[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] result = merge(a, b);

        System.out.print("Merge : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
