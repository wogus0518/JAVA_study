package JAVA_Example;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println(toString() + x + ", " + y + "으로 지상 이동");
    }
    public String toString() {
        return "Marine";
    }
    void stimPack()         { /* 스팀팩 사용 */ }
}
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank" + x + ", " + y + "으로 지상 이동");
    }
    void changeMode()       { /* 공격모드 변경 */ }
}
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship" + x + ", " + y + "으로 공중 이동");
    }
    void load()             { /* 대상을 태운다 */ }
    void unload()           { /* 대상을 내린다 */ }
}

public class Ex7_34 {
    public static void main(String[] args) {
//        Unit[] units = new Unit[3];
//        units[0] = new Marine();
//        units[1] = new Tank();
//        units[2] = new Dropship();

        // 공통 조상이 없었다면 이렇게 하나의 배열로 다룰 수 없다.
        // 추상화 클래스로 공통분모를 상속해주는 조상이 있기에 조상타입 참조변수로 모두 다룰 수 있다.
        Unit[] units = {new Marine(), new Tank(), new Dropship()};
        for(int i=0; i<3; i++) {
            units[i].move(100,200);
            System.out.println(units[i].toString());
        }
    }
}
