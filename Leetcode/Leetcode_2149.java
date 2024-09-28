import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_2149 {
  public static void main(String[] args) {
    int[] nums = { 1, -1, 2, -2, 3, -3 };
    int[] rearranged = rearrangeArray(nums);
    System.out.println(Arrays.toString(rearranged));
  }

  public static int[] rearrangeArray(int[] nums) {
    List<Integer> positive = new ArrayList<>();
    List<Integer> negative = new ArrayList<>();

    for (int x : nums) {
      if (x > 0) {
        positive.add(x);
      } else {
        negative.add(x);
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        nums[i] = positive.get(i / 2);
      } else {
        nums[i] = negative.get(i / 2);
      }
    }
    return nums;
  }
}
