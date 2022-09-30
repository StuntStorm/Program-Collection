package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,5,6,2,9,3};
        System.out.println(sumArray(arr, arr.length));
    }

    static int sumArray(int[] arr, int n) {
        if (n==0 || n==1) return arr[0];
        return arr[n-1] + sumArray(arr, n-1);
    }
}
