package JAVA_Example.ch_9;

public class Ex9_10 {

    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);
        int integer = Integer.valueOf(strVal);
        double dVal = Double.valueOf(integer);
        String d_to_strVal = String.valueOf((int)dVal);

        System.out.println(((Object) iVal).getClass().getSimpleName());
        System.out.println(strVal.getClass().getSimpleName());
        System.out.println(((Object) integer).getClass().getSimpleName());
        System.out.println(((Object) dVal).getClass().getSimpleName());
        System.out.println(dVal);
        System.out.println(d_to_strVal);


    }
}
