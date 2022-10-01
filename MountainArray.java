package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int[] arr1 = {0,1,0};
        int[] arr2 = {0,2,4,6,8,5,3};
        System.out.println(peakIndexInMountainArray(arr2));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
