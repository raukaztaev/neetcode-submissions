class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        if (s.length() == 1) {
            return 1;
        }

        int i = s.length() - 1;
        int count = 0;

        while (s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}