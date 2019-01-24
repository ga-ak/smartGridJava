package java190123;

import java.io.*;

public class Ex04_FileReader {

    //

    public static void main(String[] args) {
        FileReader fr = null;
        String file = "/Users/cheolho/Programing/practiceThings/exampleDir/";
        String txt = "Ex02_PrintWriter.txt";

        try {
            fr = new FileReader(file + txt);
            int num = 0;
            BufferedOutputStream bos = new BufferedOutputStream(System.out, 2);
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 출력과 입력사이에 한 글자씩 왔다갔다 하면서 출력하기 때문에 느리다.
            while ((num = fr.read()) != -1) {
                //System.out.println((char)num);
                bfw.write(num);
                bfw.flush();
            }

            bos.flush();
            bos.close();
            bfw.flush();
            bfw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
