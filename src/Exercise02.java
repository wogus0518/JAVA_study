public class Exercise02 {
    public static void main(String[] args){
        // 2번 문제
        int i = 0;
        int sum = 0;

        while(i<1001){
            i++;
            if(i%3 != 0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        // 3번 문제
        for (int loop=1; loop<=5; loop++){
            int cyc = 1;
            while(true){
                System.out.print("*");
                cyc++;
                if(cyc>loop){
                    System.out.print("\n");
                    break;
                }
            }
        }

        // 4번 문제
//        for (int number=1; number<=100; number++){
//            System.out.println(number);
//        }

        // 5번 문제
        int[] marks = {70,60,55,75,95,90,80,80,85,100};
        int avg_sum = 0;
        for (int score: marks){
            avg_sum += score;
        }
        System.out.println(avg_sum/marks.length);
    }
}
