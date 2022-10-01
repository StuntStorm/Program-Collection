package Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,2};
        System.out.println(isSorted2(arr, 0));
    }

    static boolean isSorted(int[] arr, int n) {
        if (n==0 || n==1) return true;
        if (arr[n-2] > arr[n-1]) return false;
        return isSorted(arr, n-1);
    }

    static boolean isSorted2(int[] arr, int i){
        if (i == arr.length-1) return true;
        if (arr[i+1] > arr[i]) return isSorted2(arr, i+1);
        return false;
    }
}
