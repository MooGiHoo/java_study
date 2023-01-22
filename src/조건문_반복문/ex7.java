package 조건문_반복문;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int balance = 0;
        while(true) {
            System.out.print("---------------------------------\n");
            System.out.print("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료\n");
            System.out.print("---------------------------------\n");
            System.out.print("선택>");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if(input == 1) {
                System.out.print("예금액>");
                int money = sc.nextInt();
                balance += money;
            }
            else if(input == 2) {
                System.out.print("출금액>");
                int money = sc.nextInt();
                balance -= money;
            }
            else if(input == 3) {
                System.out.println(balance);
            }
            else if(input == 4) {
                break;
            }
            else {
                System.out.print("잘못된 입력입니다.\n");
            }
        }
        System.out.print("프로그램 종료");
    }
}