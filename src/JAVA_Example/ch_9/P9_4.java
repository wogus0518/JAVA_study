package JAVA_Example.ch_9;

public class P9_4 {
    public static boolean contains(String src, String target){
            if(src.indexOf(target,0)==-1){
                return false;
            }else{return true;}
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "12"));
    }
}
