public class Leetcode_238 {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int[] result = productExceptSelf(nums);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    result[0] = 1;
    for (int i = 1; i < n; i++) {
      result[i] = result[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
      result[i] *= right;
      right *= nums[i];
    }
    return result;
  }
}
