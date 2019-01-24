package java190123;

import java.io.PrintWriter;

public class Ex03_1to10write {

    // 1~10까지 숫자 txt파일로 쓰기

    public static void main(String[] args) {
        PrintWriter pw = null;
        String file = "/Users/cheolho/Programing/practiceThings/exampleDir/";
        String txt = "Ex03_1to10write.txt";

        try {
            pw = new PrintWriter(file + txt);

            String s = "";

            for (int i = 1; i <= 10; i++) {
                s += Integer.toString(i) + "\n";
            }

            pw.printf(s);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}
