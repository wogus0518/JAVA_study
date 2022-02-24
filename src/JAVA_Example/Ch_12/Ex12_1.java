package JAVA_Example.Ch_12;
import java.util.*;

class Product {}
class Tv extends Product{}
class Audio extends Product{}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        List<Tv> tvLIst1 = new ArrayList<Tv>(); // 다형성 ok

        productList.add(new Tv());
        productList.add(new Product());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(tvList);

        Iterator<Product> it = productList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
    public static void printAll(ArrayList<? extends Product> list){
        for (Product p : list)
            System.out.println(p);
    }
}
