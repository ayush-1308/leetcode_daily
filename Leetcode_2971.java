import java.util.Arrays;

public class Leetcode_2971 {
  public static void main(String[] args) {
    int[] nums = { 2, 1, 2 };
    System.out.println(largestPerimeter(nums));
  }

  static long largestPerimeter(int[] nums) {
    long sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }

    Arrays.sort(nums);

    for (int i = nums.length - 1; i >= 2; i--) {
      sum -= nums[i];
      if (sum > nums[i])
        return sum + nums[i];
    }

    return -1;
  }
}
