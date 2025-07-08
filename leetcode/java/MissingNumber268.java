public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int array_sum = 0;

        for(int i = 0; i < n; i++) {
            array_sum += nums[i];
        }

        return (sum - array_sum);
    }
}