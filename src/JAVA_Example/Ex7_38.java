package JAVA_Example;

class A {
    void methodA(I i){  // 인터페이스 타입이 매개변수 => 인터페이스를 구현한 클래스로 만든 인스턴스를 매개변수로 받겠다.
        i.method();
    }
}
interface I {
    public abstract void method();
}

class B implements I {
    public void method(){
        System.out.println("B클래스입니다.");
    }
}
class C implements I {
    public void method(){
        System.out.println("C클래스입니다.");
    }
}
public class Ex7_38 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new C());
    }
}
