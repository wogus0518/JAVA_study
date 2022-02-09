package JAVA_Example;

/*
내부 클래스를 이용하는 이유
=> 내부 클래스를 감추기 위해서 => 내부 클래스를 다른 곳에서 사용한다면 내부 클래스로 하면 안된다.
=> 두 클래스간의 밀접한 관계 때문에 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근하기 위해서.

원래 클래스는 public, (default)만 사용 가능하지만 멤버 변수들처럼 private, protected도 사용 가능.

*/

class Outer {
    int iv;
    static int cv;

    class 인스턴스_내부_클래스{
        int iv = 100;
        final static int LV = 100;  // final static은 상수이다. => final vs. final static 의 차이는?

    }
    static class static_내부_클래스{
        int iv = 200;
        static int cv = 200; // cv는 static 내부 클래스만 가질 수 있다.
    }

    void 인스턴스_멤버_함수(){
        System.out.println(iv);
        System.out.println(cv);

        static_내부_클래스 s = new static_내부_클래스();
        System.out.println(static_내부_클래스.cv);
        System.out.println(s.iv);

        Outer outer = new Outer();
        인스턴스_내부_클래스 i = outer.new 인스턴스_내부_클래스();
        System.out.println(i.iv);
        System.out.println(인스턴스_내부_클래스.LV);
    }
    static void static_멤버_함수(){}
}

public class Ex7_47 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.static_멤버_함수();
        System.out.println(Outer.cv);

        outer.인스턴스_멤버_함수();
    }
}
