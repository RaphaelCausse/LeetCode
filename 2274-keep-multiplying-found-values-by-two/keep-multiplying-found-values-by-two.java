class Solution
{
    public int findFinalValue(int[] nums, int original)
    {
        Set<Integer> hashset = new HashSet<>();
        int value = original;

        for (int num: nums)
        {
            hashset.add(num);
        }

        while (hashset.contains(value))
        {
            value = 2 * value;
        }

        return value;
    }
}