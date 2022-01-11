package JAVA_Example;

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        int num = 0;

        while(true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료: 0)>");
            menu = scanner.nextInt();
            if(1<=menu && menu<=3){
                System.out.printf("선택하신 메뉴는 %d번입니다.%n",menu);

            }else if(menu==0){
                System.out.printf("프로그램을 종료합니다.%n");
                break;
            }else{
                System.out.printf("메뉴를 잘못 선택하셨습니다.%n");
                continue;
            }
        }
    }
}
