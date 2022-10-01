package Recursion;

public class LastOccur {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,0,3,9,4,6};
        int x = 99;
        System.out.println(getLastIndex(arr, arr.length, x));
    }

    private static int getLastIndex(int[] arr, int n, int x) {
        if (n==1){
            if (arr[0] == x) return 0;
            return -1;
        }
        if (arr[n-1] == x) return arr.length - (n-1);
        return getLastIndex(arr, n-1, x);
    }
}
