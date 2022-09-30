package Recursion;

public class GetIndices {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10, 8, 8, 7};
        int x = 0;
        getIndices(arr, 0, x);
    }

    private static void getIndices(int[] arr, int s, int x){
        if (s >= arr.length) {
            System.out.println(-1);
            return;
        }
        if (arr[s] == x){
            System.out.print(s + " ");
        }
        getIndices(arr, s+1, x);
    }


}

