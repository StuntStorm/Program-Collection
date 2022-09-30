package Recursion;

public class FirstOccur {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        int x = 0;
        System.out.println(getIndex(arr, 0, x));
    }

    private static int getIndex(int[] arr, int s, int x) {
        if (s<=arr.length-1){
            if (x==arr[s]) return s;
            return -1;
        }
        if (x==arr[s]) return s;
        return getIndex(arr, s+1, x);
    }
}
