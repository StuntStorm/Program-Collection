package Arrays;

public class checkDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] == 0){
                return false;
            }

            arr[arr[i]] = 0;
        }
        return true;
    }
}
