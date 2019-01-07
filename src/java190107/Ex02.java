package java190107;

public class Ex02 {
    public static void main(String[] args) {
        int[][] intArray = new int[5][5];
        int count = 21;
        for(int i=0; i<intArray.length; i++) {
            for(int j=0; j<intArray[i].length; j++) {
                intArray[i][j] = count++;
            }
        }

        for(int i=0; i<intArray.length; i++) {
            System.out.print("intArray["+i+"] >> ");
            for(int j=0; j<intArray[i].length; j++) {
                System.out.print(intArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
