class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String detail : details) {
            String ageStr = String.valueOf(detail.charAt(11)) + String.valueOf(detail.charAt(12));
            int age = Integer.valueOf(ageStr);

            if (age > 60) count++;
        }

        return count;
    }
}