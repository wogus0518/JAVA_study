package JAVA_Example;

import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));
        for(int i=0;i<numArr.length;i++){
            int r_idx = (int)( Math.random() * 10 );
            int tmp = numArr[i];
            numArr[i] = numArr[r_idx];
            numArr[r_idx] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
