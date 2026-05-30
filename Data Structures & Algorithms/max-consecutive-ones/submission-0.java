class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0, max = 0;

        for (int num : nums) {
            if (num != 1) {
                currentCount = 0;
                continue;
            }

            currentCount++;
    
            if (currentCount > max) {
                max = currentCount;
            }
        }

        return max;
    }
}