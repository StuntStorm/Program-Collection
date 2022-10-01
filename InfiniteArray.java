package BinarySearch;

//AMAZON Interview question


public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 9, 11, 14, 19, 25, 34, 49, 55, 67, 89, 100};
        int target = 19;

        System.out.println(findRange(arr, target));
    }

    static int findRange(int[] arr, int target){
        //first start range with box of size 2
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
