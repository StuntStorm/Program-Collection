package Recursion;
// LEETCODE QUESTION https://leetcode.com/problems/combinations/
// print all combinations of nCr
// example arr = {1,2,3} print 4C2
// output: {1,2}, {2,3}, {1,3}


import java.util.ArrayList;

public class Combinations {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        combination(nums, 0, new ArrayList<>(), nums.length, 2);
    }

    public static void combination(int[] arr, int i, ArrayList<Integer> ll, int n, int r){
        if (i>=n){
            if (ll.size() == r){
                System.out.println(ll);
            }
            return;
        }
        ll.add(arr[i]);
        combination(arr, i+1, ll, n, r);
        ll.remove(ll.size()-1);
        combination(arr, i+1, ll, n, r);
    }
}
