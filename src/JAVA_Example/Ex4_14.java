package JAVA_Example;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        while(num!=0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("입력한 숫자의 각 자리수의 합: "+sum);
    }
}
