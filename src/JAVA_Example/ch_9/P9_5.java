package JAVA_Example.ch_9;

public class P9_5 {
    public static String delChar(String src, String delCh){
        StringBuffer sb = new StringBuffer(src.length());
        for(int i = 0; i < src.length(); i++){
            char c = src.charAt(i);
            if(delCh.indexOf(c)==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));
    }

}
