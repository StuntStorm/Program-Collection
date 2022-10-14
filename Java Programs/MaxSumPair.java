import java.util.*;
public class MaxSumPair
{
    public static void main(String[] args) throws Exception 
    {
        int [] nums = {18,43,36,13,7};
        System.out.println(maximumSum(nums));
    }
    static int maximumSum(int[] nums) 
    {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int sum=-1;
        for(int i=0;i<nums.length;i++)
        {
            int curSum=sumdigits(nums[i]);
            if(!map.containsKey(curSum)) //checks if cursum is present
            {
                map.put(curSum, new ArrayList<>());
            }
            List<Integer> list = map.get(curSum);
            list.add(nums[i]);
            map.put(curSum,list);
        }

        for(Integer curSum : map.keySet())
        {
            List<Integer> list = map.get(curSum);
            if(list.size()<2)
            {
                continue;

            }
            Collections.sort(list);
            sum=Math.max(sum, list.get(list.size()-1)+list.get(list.size()-2));
            
        }
        return sum;
    }
    static int sumdigits(int num)
    {
        int numb=0;
        while(num>0)
        {
            if(num%10!=0)
            {
                numb+=num%10;
                num=num/10;
            }
        }
        return numb;
    }
}
