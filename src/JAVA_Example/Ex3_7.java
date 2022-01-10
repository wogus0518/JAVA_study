package JAVA_Example;

public class Ex3_7 {
    public static void main(String[] args){
        System.out.println(5/2);
        System.out.println((float)5/2); // 캐스트/형변환 연산자 사용

        byte a = 1;
        byte b = 2;
        byte c = (byte) (a*b); // int*int = int이므로 int => byte 더 작은 범위로 변경은 명시 해야함.
        System.out.println(c);

        int i = 1_000_000;
        int j = 2_000_000;
        long k = i * j;
        System.out.println(k); // 왜 2,000,000,000,000 아닐까?
        // int*int = int이므로 오버플로우 발생
        // int가 long에 담기는 것은 오류가 발생하지 않는다.
        long g = (long)i * j; // 산술 변환이 발생하게끔하여 long 타입의 결과값을 계산하도록 유도.
        System.out.println(g);

        // 소수점 아래에서 반올림하기
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000) / 1000.0;
        System.out.println(shortPi);
    }
}
