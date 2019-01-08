package java190108;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> playList = new ArrayList<>();
        ArrayList<String> curruntList = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("[1]노래 추가 [2]노래 삭제 [3]PlayList추가 [4]PlayList조회 [5]종료 >> ");
            int inputKey = sc.nextInt();
            sc.nextLine();

            // 노래 추가
            if (inputKey == 1) {
                if (curruntList == null) {
                    System.out.println("PlayList가 선택되지 않았습니다!");
                } else {
                    System.out.println("====== 현재 재생 목록 : "+curruntList.get(0)+" ======");
                    if (curruntList.size() == 1) {
                        System.out.println("재생 목록이 없습니다.");
                    } else{
                        for (int i = 1; i < curruntList.size(); i++) {
                            System.out.println(i+"."+curruntList.get(i));
                        }
                    }
                    System.out.println("=====================================");

                    System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
                    inputKey = sc.nextInt();
                    sc.nextLine();
                    if (inputKey == 1) {
                        System.out.print("추가 할 노래 입력 : ");
                        String temp = sc.nextLine();
                        curruntList.add(temp);
                    } else if (inputKey == 2) {
                        System.out.print("추가 할 노래 입력 : ");
                        String temp = sc.nextLine();
                        System.out.print("추가 할 위치 입력 : ");
                        int tempIndex = sc.nextInt();
                        curruntList.add(tempIndex, temp);
                    }
                    System.out.println("추가가 완료되었습니다\n");
                }

            // 노래 삭제
            } else if (inputKey == 2) {
                if (curruntList == null) {
                    System.out.println("PlayList가 선택되지 않았습니다!");
                } else {
                    if (curruntList.size() == 1) {
                        System.out.println("============ 현재 재생 목록 ============");
                        System.out.println("재생 목록이 없습니다.");
                        System.out.println("=====================================");
                    } else {
                        System.out.println("============ 현재 재생 목록 ============");
                        for (int i = 1; i < curruntList.size(); i++) {
                            System.out.println(i+"."+curruntList.get(i));
                        }
                        System.out.println("=====================================");
                        System.out.print("[1]선택삭제 [2]전체삭제 >> ");

                        inputKey = sc.nextInt();
                        if (inputKey == 1) {
                            System.out.print("삭제할 노래 선택 >>");
                            inputKey = sc.nextInt();
                            curruntList.remove(inputKey);
                            System.out.println("노래가 삭제되었습니다.");
                        } else if (inputKey == 2) {
                            int n = curruntList.size();
                            for (int i = 1; i < n; i++) {
                                curruntList.remove(1);
                            }
                            System.out.println(curruntList.get(0)+"의 모든 노래가 삭제되었습니다.");
                        }
                    }
                }

            // PlayList 추가
            } else if (inputKey == 3) {
                System.out.print("PlayList 이름 : ");
                String tempPlay = sc.nextLine();
                ArrayList<String> tempArrayList = new ArrayList<>();
                tempArrayList.add(tempPlay);
                playList.add(tempArrayList);
                System.out.println("PlayList ["+tempArrayList.get(0)+"] 저장 완료!");


            // PlayList 조회
            } else if (inputKey == 4) {
                if (playList.size() == 0) {
                    System.out.println("PlayList를 먼저 추가해 주세요!");
                } else {
                    System.out.println("==========PlayList==========");
                    for (int i = 0; i < playList.size(); i++) {
                        System.out.println(i+1+". "+playList.get(i).get(0));
                    }
                    System.out.println("============================");
                    System.out.print("PlayList 선택 : ");
                    int selectPlay = sc.nextInt()-1;
                    curruntList = playList.get(selectPlay);
                    System.out.println(curruntList.get(0)+" - 선택 완료!");
                }

            // while문 종료
            } else if (inputKey == 5) {
                break;
            }
        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}
