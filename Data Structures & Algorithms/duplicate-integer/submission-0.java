class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        return numsMap.entrySet().stream().anyMatch(entry -> entry.getValue() > 1);
    }
}