package JAVA_Example;

class Outer2 {
    int value = 10;

    class Inner {
        int value = 20;

        void method() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer2.this.value);
        }
    }
}

public class Ex7_50 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.method();
    }
}
