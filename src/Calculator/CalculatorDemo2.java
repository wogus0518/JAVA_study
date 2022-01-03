package Calculator;

public class CalculatorDemo2 {

    public void sum(int left, int right){
        System.out.println(right+left);
    }

    public static void main(String[] args){
        CalculatorDemo2 cal = new CalculatorDemo2();
        cal.sum(10,20);
        cal.sum(20,40);
        cal.sum(40,60);
    }
}
