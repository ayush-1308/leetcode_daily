public class Leetcode_268 {
  public static void main(String[] args) {
    int[] nums = { 3, 0, 1 };
    System.out.println(missingNumber(nums));
  }

  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = n * (n + 1) / 2;
    for (int i = 0; i < n; i++) {
      sum -= nums[i];
    }
    return sum;
  }
}
