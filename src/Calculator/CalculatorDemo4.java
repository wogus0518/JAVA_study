package Calculator;

class Calculator {
    int left;
    int right;

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
//    public void setOprands(int left, int right){
//        this.left = left;
//        this.right = right;
//    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

public class CalculatorDemo4 {
    public static void main(String[] args) {

        Calculator cal_1 = new Calculator(10, 20);
//        cal_1.setOprands(10,20);
        cal_1.sum();
        cal_1.avg();
    }
}
