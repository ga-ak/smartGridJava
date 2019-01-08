package java190107;

public class Ex03 {
    public static void main(String[] args) {
        int[][] intArray = new int[5][5];
        int count = 21;
        for(int i=0; i<intArray.length; i++) {
            for(int j=0; j<intArray[i].length; j++) {
                if(i%2 ==0) {
                    intArray[i][j] = count++;
                }else if (i%2 !=0) {
                   intArray[i][intArray[i].length-j-1] = count++;
                }
            }
        }

        for(int i=0; i<intArray.length; i++) {
            System.out.print("intArray["+i+"] >> ");
            for(int j=0; j<intArray[i].length; j++){
                System.out.print(intArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
