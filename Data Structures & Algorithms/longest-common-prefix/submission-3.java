class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char currentSymbol = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == 0) {
                    return "";
                }

                if (i >= strs[j].length() || currentSymbol != strs[j].charAt(i)) {
                    return result.toString();
                }
            }

            result.append(currentSymbol);
        }

        return result.toString();
    } 
}