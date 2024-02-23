import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) != null) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
                if (hm.get(nums[i]) > nums.length / 2) {
                    return nums[i];
                }
            } else {
                hm.put(nums[i], 1);
            }
        }

        return nums[0];
    }
}

// Sample input
public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = solution.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
