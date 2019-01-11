package java_festival_additional;

import java.util.ArrayList;

public class P3 {

    // 1,2,4 만 쓰는 124나라
    public static String toTrinary(int a) {
        int work = a;

        int q = work/3;
        int r = work%3;

        if (q == 0) {
            return Integer.toString(r);
        } else {
            return toTrinary(q)+Integer.toString(r);
        }
    }
    public static int change124(int input) {
        String[] a = {"1", "2", "4"};
        int workNum = input-1;
        int q = workNum /3;
        int r = workNum %3;
        if (q == 0) {
            return Integer.parseInt(a[r]);
        } else {

            return Integer.parseInt(change124(Integer.parseInt(a[q]))+a[r]);
        }
    }

    public static void main(String[] args) {
        System.out.println(toTrinary(10));
        //System.out.println(change124(19));
    }
}
