package JAVA_Example;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for(int i=0;i< ball.length;i++){
            ball[i] = i+1;
        }
        for(int i=0;i< ball.length;i++){
            int r_idx = (int)(Math.random()*44);
            int tmp = ball[i];
            ball[i] = ball[r_idx];
            ball[r_idx] = tmp;
        }
        for(int i=0;i<6;i++){
            System.out.printf("%d, ",ball[i]);
        }
    }
}
