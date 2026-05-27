class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getMaxFromIndex(arr, i);
        }

        arr[arr.length - 1] = -1;

        return arr;
    }

    private int getMaxFromIndex(int[] arr, int index) {
        int max = Integer.MIN_VALUE;

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}