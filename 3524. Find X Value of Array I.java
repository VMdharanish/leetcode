/*

You are allowed to perform an operation once on nums, where in each operation you can remove any non-overlapping prefix and suffix from nums such that nums remains non-empty.

You need to find the x-value of nums, which is the number of ways to perform this operation so that the product of the remaining elements leaves a remainder of x when divided by k.

Return an array result of size k where result[x] is the x-value of nums for 0 <= x <= k - 1.

A prefix of an array is a subarray that starts from the beginning of the array and extends to any point within it.

A suffix of an array is a subarray that starts at any point within the array and extends to the end of the array.

Note that the prefix and suffix to be chosen for the operation can be empty.*/
class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];

        long[] dp = new long[k];

        for (int num : nums) {

            int mod = num % k;

            long[] newDp = new long[k];
            newDp[mod] = 1;
            for (int r = 0; r < k; r++) {

                int newRemainder = (r * mod) % k;

                newDp[newRemainder] += dp[r];
            }
            for (int r = 0; r < k; r++) {
                result[r] += newDp[r];
            }

            dp = newDp;
        }

        return result;
    }
}
