package JAVA_Example;

public class Ex4_7 {
    public static void main(String[] args) {
        int num = 0;

        for (int i=0; i<5; i++){
            num = (int)(Math.random()*6) + 1; // 1<=num<6 범위의 난수
           System.out.println(num);
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
