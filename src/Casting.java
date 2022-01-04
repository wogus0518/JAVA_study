public class Casting {
    public static void main(String[] args) {
        // double 타입을 손실을 감수하고 int형으로 바꾸는 방법
        int b = (int) 1.1;

        // int형 => string형으로 바꾸는 방법
        String s = Integer.toString(365);
        System.out.println(s.getClass());

        // string형 => int형으로 바꾸는 방법
        int i = Integer.parseInt("0518");
        System.out.println(i);

        // string => double
        double d = Double.parseDouble("183.2");
        System.out.println(d);

        // double => string
        String tall = Double.toString(183.2);
        System.out.println(tall);
    }
}