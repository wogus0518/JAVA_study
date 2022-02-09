package JAVA_Example;

class Outerr {
    int value = 10;
    class Innerr {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outerr.this.value);
        }
    }
}
public class Ex7_8 {
    public static void main(String[] args) {


    Outerr outer = new Outerr();
    Outerr.Innerr inner = outer.new Innerr();
    inner.method1();
    }
}
