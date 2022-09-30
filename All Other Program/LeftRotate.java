package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,3,2,1},
                {4,2,3,5}
        };
        for (int i = 0; i < 12; i++) {
            if(i%4==0){
                System.out.println();
            }
            System.out.print(arr[i/4][i%4] + " ");
        }
    }
}
