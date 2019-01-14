package java_festival_exam;

public class P11 {
    public static void main(String[] args) {
        int[][] intArray = new int[5][5];
        int startNum = 1;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = startNum++;
            }
        }

        System.out.println("원본");

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j]+"\t");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("왼쪽으로 90도 회전");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[j][intArray.length-1-i]+"\t");
            }
            System.out.println();
        }

    }
}
