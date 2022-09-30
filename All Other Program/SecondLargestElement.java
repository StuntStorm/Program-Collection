package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,0,1,2,4};
        int large = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large){
                sLarge = large;
                large = arr[i];
            } else if (arr[i] > sLarge && arr[i] < large){
                sLarge = arr[i];
            }
        }
        System.out.println(sLarge);
    }
}
