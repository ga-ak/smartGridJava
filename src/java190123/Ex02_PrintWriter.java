package java190123;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex02_PrintWriter {

    // FileWriter 보다 향상됨

    public static void main(String[] args) {
        PrintWriter pw = null;
        String file = "/Users/cheolho/Programing/practiceThings/exampleDir/";
        String txt = "Ex02_PrintWriter.txt";

        try {
            pw = new PrintWriter(file + txt);

            String s = "동해물과 백두산이 마르고 닳도록\n" +
                    "하느님이 보우하사 우리나라 만세.\n" +
                    "무궁화 삼천리 화려강산\n" +
                    "대한 사람, 대한으로 길이 보전하세.";

            pw.printf(s);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}
