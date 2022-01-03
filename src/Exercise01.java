import java.util.*;

public class Exercise01 {

    public static void main(String[] args){
        HashMap<String, Integer> score = new HashMap<>();
        score.put("국어", 80);
        score.put("영어", 75);
        score.put("수학", 55);

        ArrayList<String> keys = new ArrayList<String>(score.keySet());

        int sum = 0;
        int num = keys.size();
        for (int i=0; i<num; i++){
            String subject = keys.get(i);
            sum += score.get(subject);
        }

        double result = sum / num;
        System.out.println(String.format("홍길동의 평균 점수는 %.1f점 입니다.", result));

        // 2번 문제
        boolean isOdd = 13 % 2 == 0;
        System.out.println(isOdd);

        // 3번 문제
        String number = "881120-1068234";
        System.out.println(number.substring(0,6));
        System.out.println(number.substring(7,14));

        // 4번 문제
        int split = number.indexOf("-");
        System.out.println(number.charAt(split+1));

        // 5번 문제
        String a = "a:b:c:d";
        a = a.replaceAll(":", "#");
        System.out.println(a);

        // 6번 문제
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        myList.sort(Collections.reverseOrder());
        System.out.println(myList);

        // 7번 문제
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String str = String.join(" ", stringList);
        System.out.println(str);

        // 8번 문제
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        grade.remove("B");
        System.out.println(grade);

        // 9번 문제
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> setNumbers = new HashSet<>(numbers);
        System.out.println(setNumbers);

        // 10번 문제
        enum Menu {
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };
        HashMap<Menu, Integer> price = new HashMap<>();
        price.put(Menu.AMERICANO, 3000);
        price.put(Menu.ICE_AMERICANO, 4000);
        price.put(Menu.CAFE_LATTE, 5000);

        System.out.println(price.get(Menu.AMERICANO));
    }
}
