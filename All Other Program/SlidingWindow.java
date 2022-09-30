package Arrays;

//Given an array of integers of size ‘n’.
//        Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
//
//        Input  : arr[] = {100, 200, 300, 400}
//        k = 2
//        Output : 700
//
//        Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
//        k = 4
//        Output : 39
//        We get maximum sum by adding subarray {4, 2, 10, 23}
//        of size 4.
//
//        Input  : arr[] = {2, 3}
//        k = 3
//        Output : -1
//        There is no subarray of size 3 as size of whole
//        array is 2.

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 3};
        int k = 3;

        // output: 39
        int ans = maxSum(arr, k);
        System.out.println(ans);
    }



    static int maxSum(int[] arr, int k) {
        if(k > arr.length){
            return -1;
        }
        int maxSum = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if(sum(arr, i, i+k-1) > maxSum){
                maxSum = sum(arr, i, i+k-1);
            }
        }
        return maxSum;
    }

    static int sum(int[] arr, int s, int e){
        int sum = 0;
        for (int i=s; i <= e; i++){
            sum += arr[i];
        }
        return sum;
    }


}
