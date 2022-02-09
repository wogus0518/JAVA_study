package JAVA_Example;

public class Ex7_46 {
    // 인스턴스 내부 클래스
    class InstanceInner {
        int iv = 100;
        final static int LV = 100; // final static은 상수이므로 허용.
    }
    // static 내부 클래스
    static class StaticInner{
        int iv = 200;
        static int cv = 200;  // static 내부 클래스만 static멤버를 가질 수 있다.
    }

    void myMethod() {
        // 지역 내부 클래스
        class LocalInner{
            int iv = 300;
            final static int CONST = 300;
        }
    }

    static void staticMethod(){
        // static멤버는 인스턴스멤버에 접근 불가능.
//      InstanceInner i = new InstanceInner();
        StaticInner s = new StaticInner();
    }

    void instanceMethod(){
        // 인스턴스멤버는 모두 접근 가능.
        InstanceInner i = new InstanceInner();
        StaticInner s = new StaticInner();
    }
    public static void main(String[] args) {
        StaticInner s = new StaticInner();
        Ex7_46 outer = new Ex7_46();
        InstanceInner i = outer.new InstanceInner();

        System.out.println(i.iv);
        System.out.println(InstanceInner.LV);
        System.out.println(s.iv);
        System.out.println(StaticInner.cv);
    }
}
