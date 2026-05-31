class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0 , 1};
        }

        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondVal = target - nums[i];

            Integer secondIndex = numbersMap.get(secondVal);
            if (secondIndex != null) {
                return new int[] {Math.min(i, secondIndex), Math.max(i, secondIndex)};
            }

            numbersMap.put(nums[i], i);
        }

        return null;
    }
}
