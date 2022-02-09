package JAVA_Example;
class Outer4 {
    static class Inner4 {
        int iv = 100;
    }
}
public class Ex7_7{
    public static void main(String[] args) {

        Outer4.Inner4 inner = new Outer4.Inner4();
        System.out.println(inner.iv);
    }

}
