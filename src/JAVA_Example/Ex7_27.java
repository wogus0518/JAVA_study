package JAVA_Example;

class Product {
    int price;
    int bonusPoint;

    Product(){}
    Product(int price){
        this.price = price;
        this.bonusPoint = (int) (price*0.1);
    }
}

class Tv1 extends Product{
    Tv1(int price){ super(price); }
    public String toString() { return "TV"; }
}

class Computer extends Product{
    Computer(int price){ super(price); }
    public String toString() { return "Computer"; }
}

class Buyer{
    private int money = 1000;
    private int bonusPoint = 0;

    int getMoney(){ return money; }
    int getBonusPoint(){ return bonusPoint; }

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }
}

public class Ex7_27 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Product t = new Tv1(100);
        Product c = new Computer(200);

        b.buy(t);
        b.buy(c);

        System.out.println("현재 남은 돈은" + b.getMoney() + "만원입니다.");
        System.out.println("현재 보너스점수는" + b.getBonusPoint() + "점입니다.");
    }
}
