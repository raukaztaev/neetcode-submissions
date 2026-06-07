class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<Integer> count;
        Map<List<Integer>, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            count = new ArrayList<>(Collections.nCopies(26, 0));

            for (int j = 0; j < strs[i].length(); j++) {
                int currentCharIndex = strs[i].charAt(j) - 'a';
                int current = count.get(currentCharIndex);
                count.set(currentCharIndex, current + 1);
            }

            List<String> currentList = map.getOrDefault(count, new ArrayList<>());
            currentList.add(strs[i]);

            map.put(count, currentList);
        }

        return new ArrayList<>(map.values());
    }
}
