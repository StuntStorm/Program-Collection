package Arrays;

// used to find target sum of two elements
// works only on sorted array

public class TwoPointerAlgo {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 2, 3, 4, 7, 9};
        int x = 3; // find two elements that adds to x;

        int i = 0;
        int j = arr.length-1;

        while (i<j){
            // i + j element sum less than x
            // increase sum by i++
            if (arr[i] + arr[j] < x){
                i++;
            }
            // i + j element sum more than x
            // decrease sum by j--
            else if (arr[i] + arr[j] > x){
                j--;
            } else{
                System.out.println(i);
                System.out.println(j);
                break;
            }
        }
    }
}
