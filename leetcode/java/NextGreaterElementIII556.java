class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int i = digits.length - 2;

        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) return -1;

        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        int left = i + 1, right = digits.length - 1;
        while (left < right) {
            char t = digits[left];
            digits[left] = digits[right];
            digits[right] = t;
            left++;
            right--;
        }

        long val = Long.parseLong(new String(digits));
        return (val > Integer.MAX_VALUE) ? -1 : (int) val;
    }
}