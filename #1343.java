class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int target = k * threshold;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int count = 0;

        if (windowSum >= target) {
            count++;
        }

        // Slide window
        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i] - arr[i - k];

            if (windowSum >= target) {
                count++;
            }
        }

        return count;
    }
}
