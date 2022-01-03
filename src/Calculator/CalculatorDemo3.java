package Calculator;

public class CalculatorDemo3 {

    public static void sum(int left, int right){
        System.out.println(left+right);
    }
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }

    public static void main(String[] args) {
        int left, right;

        left = 20;
        right = 40;
        sum(left, right);
        avg(left, right);

        left = 40;
        right = 60;
        sum(left, right);
        avg(left, right);

        left = 80;
        right = 100;
        sum(left, right);
        avg(left, right);
    }
}
