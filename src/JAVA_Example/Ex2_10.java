package JAVA_Example;

import java.util.Scanner;

public class Ex2_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("두자리 정수를 하나 입력해주세요.>>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.printf("입력내용 :%d%n", num);
        System.out.println("num="+num);
    }

}
