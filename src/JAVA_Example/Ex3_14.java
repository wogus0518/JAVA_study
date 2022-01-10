package JAVA_Example;

public class Ex3_14 {
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf("\"str1\"==\"abc\" ? %b%n", str1=="abc");
        System.out.printf("\"str2\"==\"abc\" ? %b%n%n", str2=="abc"); // false인 이유는? 객체가 달라서

        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str1.equals(\"ABC\") ? %b%n", str1.equals("ABC"));
        System.out.printf("str1.equals(\"ABC\") ? %b%n", str1.equalsIgnoreCase("ABC")); // 대소문자 무시하고 문자열 비교
        // 문자열의 비교는 항상 equals()를 사용하자
    }
}
