class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        boolean isIncreasing = isIncreasing(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] && isIncreasing) {
                return false;
            }

            if (nums[i] < nums[i + 1] && !isIncreasing) {
                return false;
            }
        }

        return true;
    }

    private boolean isIncreasing(int[] nums) {
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                return true;
            } else if (nums[i] > nums[i + 1]) {
                return false;
            }

            i++;
        }

        return true;
    }
}