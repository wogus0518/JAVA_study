package JAVA_Example.ch_9;

public class P9_3 {
    public static int count(String src, String target){
        int count = 0;
        int pos = 0;

        while (true){
            int r = src.indexOf(target, pos);

            if(r==-1) break;
            else{
                count++;
                pos += r;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
}
