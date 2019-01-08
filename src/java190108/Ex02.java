package java190108;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

    // 예제 : MusicPlayList 만들기
    public static void main(String[] args) {
        ArrayList<String> playList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
            int inputKey = sc.nextInt();
            if (inputKey == 1) {
                if (playList.size() == 0) {
                    System.out.println("============ 현재 재생 목록 ============");
                    System.out.println("재생 목록이 없습니다.");
                    System.out.println("=====================================");
                } else{
                    System.out.println("============ 현재 재생 목록 ============");
                    for (int i = 0; i < playList.size(); i++) {
                        System.out.println(i+1+"."+playList.get(i));
                    }
                    System.out.println("=====================================");
                }

                System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
                inputKey = sc.nextInt();
                sc.nextLine();
                if (inputKey == 1) {
                    System.out.print("추가 할 노래 입력 : ");
                    String temp = sc.nextLine();
                    playList.add(temp);
                } else if (inputKey == 2) {
                    System.out.print("추가 할 노래 입력 : ");
                    String temp = sc.nextLine();
                    System.out.print("추가 할 위치 입력 : ");
                    int tempIndex = sc.nextInt();
                    playList.add(tempIndex-1, temp);
                }
                System.out.println("추가가 완료되었습니다\n");
            } else if (inputKey == 2) {
                if (playList.size() == 0) {
                    System.out.println("============ 현재 재생 목록 ============");
                    System.out.println("재생 목록이 없습니다.");
                    System.out.println("=====================================");
                } else {
                    System.out.println("============ 현재 재생 목록 ============");
                    for (int i = 0; i < playList.size(); i++) {
                        System.out.println(i+1+"."+playList.get(i));
                    }
                    System.out.println("=====================================");
                    System.out.print("[1]선택삭제 [2]전체삭제 >> ");

                    inputKey = sc.nextInt();
                    if (inputKey == 1) {
                        System.out.print("삭제할 노래 선택 >>");
                        inputKey = sc.nextInt();
                        playList.remove(inputKey-1);
                        System.out.println("노래가 삭제되었습니다.");
                    } else if (inputKey == 2) {
                        int n = playList.size();
                        for (int i = 0; i < n; i++) {
                            playList.remove(0);
                        }
                        System.out.println("전체 list가 삭제되었습니다.");
                    }
                }
            } else if (inputKey == 3) {
                break;
            }
        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}
