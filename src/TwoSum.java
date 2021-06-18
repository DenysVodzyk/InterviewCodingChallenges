import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 8};

        System.out.println(Arrays.toString(solution(nums, 65)));

    }

    public static int[] solution(int[] nums, int target) {
        int arrayLength = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arrayLength; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < arrayLength; i++) {
            int delta = target - nums[i];
            if (map.containsKey(delta)) {
                return new int[]{i, map.get(delta)};
            }
        }
        return new int[]{-1, -1};
    }

}
