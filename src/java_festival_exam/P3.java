package java_festival_exam;

public class P3 {





    public static void main(String[] args) {
        String[] names = {"Queen", "Tod", "Kim"};

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                System.out.println("김서방은 "+(i+1)+"에 있다.");
                break;
            }
        }
    }
}
