import java.util.Hashtable;

class Solution
{
    public int findFinalValue(int[] nums, int original)
    {
        int value = original;
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        // Fill hashtable with element from input array
        for (int i = 0; i < nums.length; i++)
        {
            hashtable.put(nums[i], nums[i]);
        }

        // Process of multiplying value by 2 and search it in hashtable
        while (true)
        {
            if (hashtable.get(value) == null)
            {
                return value;
            }
            value = 2 * value;
        }
    }
}