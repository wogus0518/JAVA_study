package JAVA_Example.Ch_11;

import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("박자바", 100);
        map.put("정자바", 80);
        map.put("최자바", 90);

        Collection values = map.values();
        Iterator it = values.iterator();

        int total_sum = 0;
        float avg = 0;

        while (it.hasNext()) {
            total_sum += (int) it.next();
            avg = (float) total_sum / map.size();
        }
        System.out.println(total_sum);
        System.out.println(avg);

    }
}
