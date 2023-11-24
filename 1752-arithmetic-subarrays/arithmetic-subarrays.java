class Solution
{
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r)
    {
        List<Boolean> answer = new ArrayList<>();
        int[] subarray;
        boolean isArithmeticSequence = false;

        for (int i = 0; i < l.length; i++)
        {
            // Get the subarray from index l[i] to r[i]
            subarray = Arrays.copyOfRange(nums, l[i], r[i] + 1);

            // Check for an arithmetic sequence
            Arrays.sort(subarray);
            for (int k = 0; k < subarray.length - 1; k++)
            {
                if (subarray[k + 1] - subarray[k] == subarray[1] - subarray[0])
                {
                    isArithmeticSequence = true;
                }
                else
                {
                    isArithmeticSequence = false;
                    break;
                }
            }
            answer.add(isArithmeticSequence);
        }

        return answer;
    }
}