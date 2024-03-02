public class Leetcode_977 {
  public static void main(String[] args) {
    int[] nums = { -4, -1, 0, 3, 10 };
    int[] result = sortedSquares(nums);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

  static int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int left = 0;
    int right = n - 1;
    for (int i = n - 1; i >= 0; i--) {
      if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        result[i] = nums[left] * nums[left];
        left++;
      } else {
        result[i] = nums[right] * nums[right];
        right--;
      }
    }
    return result;
  }
}
