import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int search_element = target - nums[i];

            if(map.containsKey(search_element)) {
                answer[0] = i;
                answer[1] = map.get(search_element);
                return answer;
            }

            map.put(nums[i], i);
        }

        return answer;
    }
}