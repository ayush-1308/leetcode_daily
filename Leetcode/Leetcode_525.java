import java.util.HashMap;
import java.util.Map;

public class Leetcode_525 {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 1 };
    System.out.println(findMaxLength(nums));
  }

  public static int findMaxLength(int[] nums) {
    int max = 0;
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    for (int i = 0; i < nums.length; i++) {
      count = count + (nums[i] == 1 ? 1 : -1);
      if (map.containsKey(count)) {
        max = Math.max(max, i - map.get(count));
      } else {
        map.put(count, i);
      }
    }
    return max;
  }
}
