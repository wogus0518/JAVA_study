package JAVA_Example.ch_9;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card(){
        this("Spade", 1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Card){ // 형변환 체크 중요!
            Card c = (Card) obj; // obj 리모콘으로는 iv에 접근 할 수 없으므로 형변환이 필요하다.
            return this.number == c.number && this.kind.equals(c.kind); //문자열 비교는 equals()
        }
        return false;
    }

    @Override // equals()를 오버라이딩 했으므로 hashCode()도 오버라이딩 해주어야 한다.
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override // 인스턴스의 정보를 문자열로 변환하는 메서드를 좀 더 유용하게 오버라이딩.
    public String toString(){
        return "Kind : " + this.kind + " Number : " + this.number;
    }

}
public class Ex9_5 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        if(c1.equals(c2)){
            System.out.println("같습니다.");
        } else{
            System.out.println("다릅니다.");
        }

        System.out.println("c1 hash : " + c1.hashCode());
        System.out.println("c2 hash : " + c2.hashCode());

        System.out.println(c1.toString());
    }
}
