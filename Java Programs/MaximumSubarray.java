import java.util.*;
public class Solution
{
    public static void main(String[] args) throws Exception 
    {
       int [] nums={-2,1,-3,4,-1,2,1,-5,4}; 
       System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int currMax=0;
        for(int i=0;i<nums.length;i++)
        {
            currMax=currMax+nums[i];
            if(max<currMax)
            {
                max=currMax;
            }
            if(currMax<0)
            {
                currMax=0;
            }
        }
        return max;
    }
}
