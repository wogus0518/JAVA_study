package JAVA_Example;

class Outer3 {
    class Inner3 {
        int iv = 100;
    }
}
public class Ex7_6 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner3 inner = outer.new Inner3();

        System.out.println(inner.iv);
    }
}
