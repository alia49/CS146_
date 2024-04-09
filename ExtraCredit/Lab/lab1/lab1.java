import java.util.HashMap;
import java.util.Map;

public class lab1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        // Throw an exception if no solution is found, should not happen as per problem statement
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        lab1 solution = new lab1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] indices = solution.twoSum(nums, target);
        System.out.println("Index1: " + indices[0] + ", Index2: " + indices[1]);
    }
}
