class Solution
{
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r)
    {
        List<Boolean> answer = new ArrayList<>();
        int left;
        int right;
        int[] subarray;
        boolean isSequence;

        for (int i = 0; i < l.length; i++)
        {
            // Get the subarray from index left to right
            left = l[i];
            right = r[i];
            subarray = new int[right - left + 1];
            for (int j = left; j <= right; j++)
            {
                subarray[j - left] = nums[j];
            }

            // Check for an arithmetic sequence
            Arrays.sort(subarray);
            isSequence = true;
            for (int k = 0; k < subarray.length - 1; k++)
            {
                if (subarray[k + 1] - subarray[k] != subarray[1] - subarray[0])
                {
                    isSequence = false;
                    break;
                }
            }
            answer.add(isSequence);
        }

        return answer;
    }
}