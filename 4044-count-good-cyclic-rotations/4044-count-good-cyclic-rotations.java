class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;

        long firstHalfSum = 0;
        long secondHalfSum = 0;

        // Calculate sums for the original array
        for (int i = 0; i < half; i++) {
            firstHalfSum += nums[i];
        }

        for (int i = half; i < n; i++) {
            secondHalfSum += nums[i];
        }

        int count = 0;

        // Check all n rotations
        for (int start = 0; start < n; start++) {

            if (firstHalfSum > secondHalfSum) {
                count++;
            }

            // Elements leaving and entering after one rotation
            long leavingFirst = nums[start];
            long enteringFirst = nums[(start + half) % n];

            long leavingSecond = nums[(start + half) % n];
            long enteringSecond = nums[start];

            // Update first half
            firstHalfSum = firstHalfSum - leavingFirst + enteringFirst;

            // Update second half
            secondHalfSum = secondHalfSum - leavingSecond + enteringSecond;
        }

        return count;
    }
}