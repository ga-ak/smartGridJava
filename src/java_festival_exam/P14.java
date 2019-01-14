package java_festival_exam;

public class P14 {
    public static void main(String[] args) {
        int[][] array = new int[7][7];

        int startNum = 1;

        for (int i = 0; i < array.length; i++) {
            int a = Math.abs(3 + i);
            int b = Math.abs(3 - i);
            for (int j = 0; j < array[i].length; j++) {


                int big;
                int small;
                if (a > b) {
                    big = a;
                    small = b;
                } else if (a < b) {
                    big = b;
                    small = a;
                } else {
                    big = a;
                    small = a;
                }

                if (big>6) {
                    big = big- 2*small;
                }
                if (small>6) {
                    small = small- 2*big;
                }

                if (j <= big && j >= small) {
                    array[j][i] = startNum++;
                } else {
                    array[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
