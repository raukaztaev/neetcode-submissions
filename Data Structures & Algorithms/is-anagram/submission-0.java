class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = getFreqMapFromString(s);
        Map<Character, Integer> mapT = getFreqMapFromString(t);

        return mapS.equals(mapT);
    }

    private Map<Character, Integer> getFreqMapFromString(String word) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            result.put(word.charAt(i), result.getOrDefault(word.charAt(i), 0) + 1);
        }

        return result;
    }
}
