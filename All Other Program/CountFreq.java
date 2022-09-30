package Arrays;

import java.util.Arrays;

// counting the frequency of every element
public class CountFreq {
    public static void main(String[] args) {
        int[] ans = getFreq(new int[] {1,1,2,2,3,3,3});
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getFreq(int[] nums){
        int[] arr =new int[101];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            arr[index] = arr[index] + 1;
        }
        return arr;
    }
}
