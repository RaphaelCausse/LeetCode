import java.util.Hashtable;

class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int complement;
        Integer complementIndex;
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < nums.length; i++)
        {
            complement = target - nums[i];
            complementIndex = hashtable.get(complement);
            if (complementIndex == null)
            {
                hashtable.put(nums[i], i);
            }
            else
            {
                return new int[] { complementIndex, i };
            }
        }
        return new int[] {};
    }
}