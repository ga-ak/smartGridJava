package java190118.music;

import java.util.Scanner;


public class Music_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicCon controller = new MusicCon();
        int listSize = controller.musicList.size()-1;
        int index = 0;

        while (true) {
            System.out.println("====================================");
            System.out.print("[1]재생 [2]이전곡 [3]다음곡 [4]종료");
            int choice = sc.nextInt();

            // 노래 재생
            if (choice == 1) {
                System.out.println(controller.play(index));

                // 이전곡 재생
            } else if (choice == 2) {
                if (index == 0) {
                    index = listSize;
                }
                System.out.println(controller.play(--index));


                // 다음곡 재생
            } else if (choice == 3) {
                if (index == listSize) {
                    index = -1;
                }
                System.out.println(controller.play(++index));


                // 종료
            } else if (choice == 4) {
                System.out.println(controller.stop());
                break;
            }
        }
        System.out.println("프로그램 종료!");

    }
}
