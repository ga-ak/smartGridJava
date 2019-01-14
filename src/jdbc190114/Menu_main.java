package jdbc190114;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_main {

    // 자판기
    // 재고가 몇 개 남았는지, 거스름돈이 얼마 남았는지 출력
    // 제품을 선택하면 재고를 하나 줄어들게 구현
    // 재고가 없다면 "재고가 없습니다!" 출력
    //

    public static void main(String[] args) {
        MenuVO cola = new MenuVO("콜라", 1000, 5);
        MenuVO coffee = new MenuVO("커피", 1500, 10);
        MenuVO water = new MenuVO("물", 500, 20);

        ArrayList<MenuVO> menueArr = new ArrayList<>();
        menueArr.add(cola);
        menueArr.add(coffee);
        menueArr.add(water);

        for (int i = 0; i < menueArr.size(); i++) {
            System.out.println(menueArr.get(i).getName());
        }

        int remainMoney = 50000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("자판기");
            System.out.print("금액을 투입해 주십시오 : ");
            int money = sc.nextInt();

            for (int i = 0; i < menueArr.size(); i++) {
                System.out.printf("[%s]재고 : %d\t",menueArr.get(i).getName(),menueArr.get(i).getStock());
            }
            System.out.println("\n기기 거스름돈 : "+remainMoney+"원 남음");
            System.out.println("[1]콜라 [2]커피 [3]물 [4]종료");
            System.out.print("메뉴를 선택해 주십시오 : ");
            int choice = sc.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.println("수량을 입력해 주십시오 : ");
            int amount = sc.nextInt();

            MenuVO temp = menueArr.get(choice - 1);

            if (money - temp.getPrice() * amount > remainMoney) {
                System.out.println("거스름돈이 부족합니다!");
                System.out.printf("남은 거스름돈 : %d",remainMoney);
            } else {
                remainMoney -= temp.getPrice()*amount;
            }

            if (temp.getStock() < amount) {
                System.out.println(temp.getName()+"의 재고가 부족합니다! "+temp.getStock());
            }else{
                temp.setStock(temp.getStock()-amount);
            }

            System.out.println(temp.getName()+" "+amount+"개 나옴! 맛있게 드세요!");
        }
        System.out.println("자판기 프로그램 종료!");
    }
}
