import java.util.Hashtable;

class Solution
{
    public int findFinalValue(int[] nums, int original)
    {
        Set<Integer> hashset = new HashSet<>();
        int value = original;

        // Fill hashset with element from input array
        for (int num: nums)
        {
            hashset.add(num);
        }

        // Process of multiplying value by 2 and search it in hashset
        while (hashset.contains(value))
        {
            value = 2 * value;
        }

        return value;
    }
}