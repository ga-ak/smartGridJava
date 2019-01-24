package java190123;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01_FileWriter {

    public static void main(String[] args) {

        String file = "/Users/cheolho/Programing/practiceThings/exampleDir/";
        String txt = "Ex01_FileWriter.txt";
        FileWriter fw = null; // FileWriter를 finally 에서도 사용하기 위해 try문 바깥으로 빼줌

        try {
            fw = new FileWriter(file + txt);

            String s = "abc\nhello World!";

            fw.write(s);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
