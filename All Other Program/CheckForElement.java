package Recursion;

public class CheckForElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,34,4,5,9,0};
        int x = 34;
        System.out.println(check(arr, arr.length, x));
        System.out.println(check(arr, arr.length, x));
    }

    private static boolean check(int[] arr, int n, int x) {
        if (n==1){
            if (arr[0] == x) return true;
            return false;
        }

        if (arr[n-1] == x) return true;
        return check(arr, n-1, x);
    }

    private static boolean check2(int[] arr, int s, int x){
        if (s== arr.length-1){
            if (arr[0] == x) return true;
            return false;
        }

        if (arr[s] == x) return true;
        return check2(arr, s+1,x);
    }
}
