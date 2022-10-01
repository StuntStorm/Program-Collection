package BinarySearch;
//https://leetcode.com/problems/find-target-indices-after-sorting-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }

    static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                list.add(mid);
            }
        }

//        for(int i =0; i < nums.length; i++){
//            if(target == nums[i]){
//                list.add(i);
//            }
//            if(nums[i] > target){
//                break;
//            }
//        }
        return list;
    }
}
