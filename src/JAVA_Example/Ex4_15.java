package JAVA_Example;

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int answer = (int)(Math.random()*100) + 1;

        do{
            System.out.printf("1부터 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt();
            if(input>answer) {
                System.out.println("더 작은 값으로 다시 시도해보세요.");
            }else if(input<answer){
                System.out.println("더 큰 값으로 다시 시도해보세요.");
            }else{
                System.out.println("정답입니다.");
            }
        }while (input!=answer);
        //System.out.println("정답입니다.");
    }
}
