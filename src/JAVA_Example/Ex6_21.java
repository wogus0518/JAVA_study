package JAVA_Example;

public class Ex6_21 {
    public static int abs(int value){
        return value>0 ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(abs(value));
        value = -10;
        System.out.println(abs(value));
    }
}
