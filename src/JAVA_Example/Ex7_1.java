package JAVA_Example;

class SutdaDeck{
    final static int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i = 0; i < CARD_NUM; i++){
            int num = i%10 + 1;
            boolean isKwang = false;
            if ((i == 2) || (i == 7) || (i == 0)){ isKwang = true; }
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
    void shuffle(){
        for(int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * CARD_NUM);
            SutdaCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    SutdaCard pick(){
        return cards[(int) (Math.random() * CARD_NUM)];
    }

    SutdaCard pick(int idx){
        return cards[idx];
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

}

public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
