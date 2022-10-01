package Arrays;

public class MinMaxInTheArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int ans = MinMax(arr, false);
        System.out.println(ans);
    }

    private static int MinMax(int[] arr, boolean max) {
        if(max){
            int m = Integer.MIN_VALUE;
            for (int j : arr) {
                if (j > m) {
                    m = j;
                }
            }
            return m;
        }
        else {
            int m = Integer.MAX_VALUE;
//            Math.log10();
            for (int j : arr) {
                if (j < m) {
                    m = j;
                }
            }
            return m;
        }
    }
}
