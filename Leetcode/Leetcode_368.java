import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_368 {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    System.out.println(largestDivisibleSubset(nums));
  }

  public static List<Integer> largestDivisibleSubset(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n];
    Arrays.sort(nums);
    Arrays.fill(dp, 1);

    int max = 1;
    int maxIndex = 0;

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] % nums[j] == 0) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
          if (dp[i] > max) {
            max = dp[i];
            maxIndex = i;
          }
        }
      }
    }
    List<Integer> result = new ArrayList<>();
    int num = nums[maxIndex];
    for (int i = maxIndex; i >= 0; i--) {
      if (num % nums[i] == 0 && dp[i] == max) {
        result.add(nums[i]);
        num = nums[i];
        max--;
      }
    }
    return result;
  }
}