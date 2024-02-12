public class Leetcode_169 {
  public static void main(String[] args) {
    int[] nums = { 3, 2, 3 };
    System.out.println(majorityElement(nums));
  }

  public static int majorityElement(int[] nums) {
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = i + 1; j < n; j++) {
        if (nums[i] == nums[j])
          count++;
      }
      if (count > n / 2)
        return nums[i];
    }
    return -1;
  }
}
