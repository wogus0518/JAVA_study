package JAVA_Example;

class Tv{  // 나중에 객체(인스턴스)를 생성하기 위해 객체를 정의한 클래스를 만든다.
    //객체 멤버 중 속성을 표현한 멤버변수
    String color;
    boolean power;
    int channel;

    //객체 멤버 중 기능을 표현한 메소드
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

public class Ex6_1 {

    public static void main(String[] args) {
        // 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.
        Tv t1 = new Tv(); // 객체는 실제로 존재하는 것. 클래스에 정의된 내용대로 메모리에 생성된 것
        t1.channel = 7;   // 인스턴스에 접근하기 위해 메모리 주소를 알고 있는 참조변수 t로 접근한다.

        Tv t2 = new Tv();
        t2.channel = 11; // 각각 t1, t2 참조변수는 서로 다른 인스턴스의 메모리 주소값을 가지고 있다.

    }
}
