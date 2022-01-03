public class GuGuDan {

    public static void pro(int i) {
        System.out.println(String.format("%d단 구구단",i));
        for(int iter=1; iter<10; iter++){
            System.out.println(iter*i);
        }
    }
    public static void main(String[] args) {
        for (int idx=2; idx<10; idx++){
            pro(idx);
        }
    }
}
