package JAVA_Example;

class Product2{
    int price;
    int bonusPoint;

    Product2(){}
    Product2(int price){
        this.price = price;
        bonusPoint = (int) (price * 0.1);
    }
}

class Tv2 extends Product2{
    Tv2(){ super(100); }
    public String toString() { return "Tv"; }
}
class Computer2 extends Product2{
    Computer2(){ super(200); }
    public String toString() { return "Computer"; }
}
class Audio extends Product2{
    Audio(){ super(300); }
    public String toString() { return "Audio"; }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy(Product2 p){
        if(money<p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i=0; i< cart.length; i++){
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i].toString() + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
public class Ex7_30 {
    public static void main(String[] args) {
        Product2[] p = new Product2[10];
        p[0] = new Tv2();

        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.summary();
    }
}
