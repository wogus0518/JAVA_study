import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Type {
    public static void main(String[] args){

        // 정수
        int i = 10;                 // 표현 범위 이상의 숫자를 넣으면 에러
        long a = 8764827384923849L; // 접미사 L이 없다면 에러

        // 실수
        double morePi = 3.14159265358979323846;
        double micro = 10e-6;
        float pi = 3.14f; // default가 double이므로 접미사 f가 필요

        // 불린
        boolean isSuccess = true;
        boolean isFail = false;

        boolean isTall = 180>170;
        System.out.println(isTall);

        // 문자
        char c = 'a';
        // 문자열
        String abc2 = new String("Hello Java");
        // 리터럴 표기 : 객체 생성없지 고정된 값을 그대로 대입하는 방법
        // 컴파일 시 최적화에 더 도움을 주기에 권장
        String abc = "Hello Java";
        // 문자열 내장 메소드
        System.out.println(abc.equals(abc2));
        System.out.println(abc.indexOf("Java"));
        System.out.println(abc.charAt(6));
        System.out.println(abc.replaceAll("Java", "World"));
        System.out.println(abc.substring(0,5));
        System.out.println(abc.toUpperCase());
        System.out.println(String.format("%s, %.1f, %d",abc, pi, a));

        //배열
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        int[] odds = {1, 3, 5, 7, 9};
        String[] names = new String[5]; // 배열 변수의 길이를 반드시 입력

        // 리스트
        ArrayList aList = new ArrayList();
        aList.add("jaehyun");
        aList.add("mina");
        aList.add(0, "jenny");
        String name = (String) aList.get(0);

        ArrayList<String> nameList = new ArrayList<>(); // use 제네릭스
        nameList.add("lisa");
        nameList.add("jisoo");
        String member = nameList.get(1);  // 형 변환이 필요없다. 제네릭스를 사용하는 이유
        System.out.println(member);

        // 맵 (Associative array, Hash)
        // LinkedHashMap, TreeMap도 별도로 알아보자
        HashMap<String, String> userInfo = new HashMap<>();
        userInfo.put("ID", "wogus0518");
        userInfo.put("PW", "123456");
        System.out.println(userInfo.get("ID"));
        System.out.println(userInfo.keySet());

        // 집합 Set
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

    }
}
